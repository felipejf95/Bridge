import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogadorProfissionalTest {

    @Test
    void deveRetornarSalarioConvocado(){
        Premiacao premiacao = new Convocado();
        JogadorProfissional jogador = new JogadorProfissional(100000.0f, 10);
        jogador.setPremiacao(premiacao);
        assertEquals(110010.0f, jogador.calculaSalario());
    }

    @Test
    void deveRetornarSalarioArtilheiro(){
        Premiacao premiacao = new Artilheiro();
        JogadorProfissional jogador = new JogadorProfissional(100000.0f, 10);
        jogador.setPremiacao(premiacao);
        assertEquals(108000.0f, jogador.calculaSalario(), 0.01f);
    }

    @Test
    void deveRetornarSalarioCraque(){
        Premiacao premiacao = new Craque();
        JogadorProfissional jogador = new JogadorProfissional(100000.0f, 10);
        jogador.setPremiacao(premiacao);
        assertEquals(115000.0f, jogador.calculaSalario(), 0.01f);
    }
}