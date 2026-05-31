package joaocamilo.potencia2009.estacionamento_ui;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Estacionamento {
    private ArrayList<Vaga> vagas;
    private ArrayList<Ticket> ticketsAbertos;

    public Estacionamento(int totalVagas){
        this.vagas = new ArrayList<Vaga>();
        this.ticketsAbertos = new ArrayList<Ticket>();

        for(int i = 1; i<=totalVagas; i++){
            Vaga novaVaga = new Vaga(i);
            this.vagas.add(novaVaga);
            Ticket ticket = new Ticket();
            this.ticketsAbertos.add(ticket);
        }
    }

    public void registrarEntrada(Veiculo veiculo){
        for(Vaga vaga : this.vagas){
            if(!vaga.isOcupada()){
                vaga.estacionar(veiculo);
                break;
            }
        }
        for(Ticket ticket : this.ticketsAbertos){
            if(!ticket.getUsado()){
                ticket.setHoraEntrada(LocalDateTime.now());
                ticket.setCarro(veiculo);
                ticket.setUsado(true);
                break;
            }
        }
    }


    public void registarSaida(String placa){
        for(Ticket ticket : this.ticketsAbertos){
            if(ticket.getCarro()!= null && ticket.getCarro().getPlaca().equals(placa)){
                ticket.registrarSaida();
                Tarifario tarifario = new Tarifario();
                tarifario.calcularValor(ticket.calcularTempoEmHoras());
                break;
            }
        }
        for(Vaga vaga : vagas){
            if(vaga.getVeiculoEstacionado()!= null && vaga.getVeiculoEstacionado().getPlaca().equals(placa)){
                vaga.liberar();
                break;
            }
        }
    }

    public void exibirVagas(){
        int contador = 0;
        System.out.println("Vagas:");

        for(Vaga vaga : this.vagas){
            if(!vaga.isOcupada()){
                IO.print("[ Vaga " + vaga.getNumero() + " ] ");
                contador++;
            }else{
                IO.println("[ Vaga " + vaga.getNumero() + " - " + vaga.getVeiculoEstacionado().getPlaca() + "] ");
            }
        }
        System.out.println("Total Vagas: " + contador);
    }

}

