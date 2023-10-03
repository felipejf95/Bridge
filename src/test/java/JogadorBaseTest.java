import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogadorBaseTest {

    @Test
    void deveRetornarSalarioConvocado(){
        Premiacao premiacao = new Convocado();
        JogadorBase jogador = new JogadorBase(5000.0f, 5);
        jogador.setPremiacao(premiacao);
        assertEquals(5000.f, jogador.calculaSalario());
    }
}