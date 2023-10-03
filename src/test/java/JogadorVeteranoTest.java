import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogadorVeteranoTest {

    @Test
    void deveRetornarSalarioArtilheiro(){
        Premiacao premiacao = new Artilheiro();
        JogadorVeterano jogador = new JogadorVeterano(50000.0f, 5);
        jogador.setPremiacao(premiacao);
        assertEquals(50000.04f, jogador.calculaSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioConvocado(){
        Premiacao premiacao = new Convocado();
        JogadorVeterano jogador = new JogadorVeterano(50000.0f, 5);
        jogador.setPremiacao(premiacao);
        assertEquals(50000.05f, jogador.calculaSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioCraque(){
        Premiacao premiacao = new Craque();
        JogadorVeterano jogador = new JogadorVeterano(50000.0f, 5);
        jogador.setPremiacao(premiacao);
        assertEquals(50000.07f, jogador.calculaSalario(), 0.01f);
    }

}