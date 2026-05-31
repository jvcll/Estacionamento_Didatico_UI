package joaocamilo.potencia2009.estacionamento_ui;

public class Vaga {
    private int numero;
    private boolean ocupada = false;
    private Veiculo veiculoEstacionado;

    public Vaga(int numero){
        this.numero = numero;
        this.ocupada = false;
        this.veiculoEstacionado = null;
    }

    public void estacionar(Veiculo carro){
        this.veiculoEstacionado = carro;
        this.ocupada = true;
    }
    public void liberar(){
        this.veiculoEstacionado = null;
        this.ocupada = false;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public Veiculo getVeiculoEstacionado() {
        return veiculoEstacionado;
    }
}
