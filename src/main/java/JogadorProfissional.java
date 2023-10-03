public class JogadorProfissional extends Jogador{

    public JogadorProfissional(float salario, int convocacoes) {
        super(salario, convocacoes);
    }

    @Override
    public float calculaSalario() {
        if(this.premiacao instanceof Convocado)
            return this.salario * (1 + this.premiacao.calculaPremio()) + (convocacoes * 1.0f);
        else
            return this.salario * (1 + this.premiacao.calculaPremio());
    }

}
