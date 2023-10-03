public abstract class Jogador {

    protected Premiacao premiacao;
    protected float salario;
    protected int convocacoes;


    public Jogador(float salario, int convocacoes){
        this.salario = salario;
        this.convocacoes = convocacoes;
    }

    public void setPremiacao(Premiacao premiacao){
        this.premiacao = premiacao;
    }

    public void setSalario(float salario){
        this.salario = salario;
    }

    public abstract float calculaSalario();
}
