public class JogadorVeterano extends Jogador{
    public JogadorVeterano(float salario, int convocacoes) {
        super(salario, convocacoes);
    }

    @Override
    public float calculaSalario() {
        return this.salario + (0.5f * this.premiacao.calculaPremio());
    }
}
