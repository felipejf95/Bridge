public class JogadorBase extends Jogador{

    public JogadorBase(float salario, int convocacoes) {
        super(salario, convocacoes);
    }

    @Override
    public float calculaSalario() {
        return this.salario;
    }
}
