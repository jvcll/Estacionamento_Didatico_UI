package joaocamilo.potencia2009.estacionamento_ui;

public class Tarifario{
    private double valorHora = 10.0;
    private double valorDiaria = 240.0;
    private double valorMes = 7200.0;

    public double calcularValor(int totalHoras){
        System.out.println("Voce permaneceu por:" + totalHoras);
        if(totalHoras <=0){
            System.out.println("Total a pagar: R$" + this.valorHora);
            return this.valorHora;
        }else if(totalHoras < 24){
            System.out.println("Total a pagar: R$" + totalHoras*this.valorHora);
            return totalHoras*this.valorHora;
        }else if(totalHoras < 720){
            double dias = totalHoras/24;
            System.out.println("Total a pagar: R$" + this.valorDiaria*dias);
            return this.valorDiaria*dias;
        }else{
            double meses = totalHoras/720;
            System.out.println("Total a pagar: R$" + this.valorMes*meses);
            return this.valorMes*meses;
        }
    }
}
