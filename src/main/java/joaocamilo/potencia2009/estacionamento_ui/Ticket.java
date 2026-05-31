package joaocamilo.potencia2009.estacionamento_ui;

import java.time.LocalDateTime;

public class Ticket {
    private Veiculo carro;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSaida;
    private boolean usado = false;

    public Veiculo getCarro() {
        return carro;
    }
    public void setCarro(Veiculo carro) {
        this.carro = carro;
    }
    public void setHoraEntrada(LocalDateTime horaEntrada){
        this.horaEntrada = horaEntrada;
    }
    public void setHoraSaida(LocalDateTime horaSaida){
        this.horaSaida = horaSaida;
    }
    public boolean getUsado() {
        return usado;
    }
    public void setUsado(boolean usado) {
        this.usado = usado;
    }

    public void registrarSaida(){
        this.horaSaida = LocalDateTime.now();
    }

    public int calcularTempoEmHoras(){
        return this.horaEntrada.getHour()-this.horaSaida.getHour();
    }
}
