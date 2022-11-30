//1. Classe para representar tempo
//        • Crie uma classe para representar tempo em termos de hora, minutos e segundos
//        – Com 4 métodos construtores
//        – Uso adequado dos modificadores de acesso
//        – Se valores inválidos forem informados para hora, minuto ou segundo, então
//        deve-se criar objeto com 00:00:00
//        • Método chamado toString() que deverá retornar o tempo como String. Ex:
//        07:30:00
//        • Métodos para alterar hora, minuto ou segundo
//        – Deve-se retornar true se o valor for alterado com sucesso, false caso contrá-
//        rio
//        • Método que retorne um long com o tempo em segundos. Ex: 01:00:00 retornaria:
//        3600
//        • Método que receba objeto Tempo como parâmetro e retorne um long com a dife-
//        rença entre este e o tempo do objeto em questão

package Academy.devdojo.Atividades.Atividade0410;

public class Tempo {
    private int hora;
    private int minuto;
    private int segundo;

    public Tempo() {
        this.hora = 00;
        this.minuto = 00;
        this.segundo = 00;
    }

    public Tempo(int hora, int minuto, int segundo) {
        if (hora > 0 && hora < 24) {
            this.hora = hora;}
        else {
            this.hora = 0;
        }
        if (minuto > 0 && minuto < 60) {
            this.minuto = minuto;}
        else {
            this.minuto = 0;
        }
        if (segundo > 0 && hora < 60) {
            this.segundo = segundo;}
        else {
            this.segundo = 0;
        }



    }

    public Tempo(int hora, int minuto) {
        if (hora > 0 && hora < 24) {
            this.hora = hora;}
        else {
            this.hora = 0;
        }
        if (minuto > 0 && minuto < 60) {
            this.minuto = minuto;}
        else {
            this.minuto = 0;
        }
    }

    public Tempo(int segundo) {
        if (segundo > 0 && hora < 60) {
            this.segundo = segundo;}
        else {
            this.segundo = 0;
        }

    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora > 0 && hora < 24) {
            this.hora = hora;}
        else {
            System.out.println("Dado incorreto");
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto > 0 && minuto < 60) {
            this.minuto = minuto;}
        else {
            System.out.println("Dado incorreto");
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if (segundo > 0 && hora < 60) {
            this.segundo = segundo;}
        else {
            System.out.println("Dado Incorreto");
        }
    }

    public String toString() {
        String aux = "";
        if (hora < 9){
            aux += "0" + hora + ":";
        }else aux += hora + ":";
        if(minuto < 9){
            aux += "0"+minuto+":";
        }else aux += minuto+":";
        if(segundo < 9){
            aux += "0"+segundo;
        }else aux += segundo;

        return aux;
    }

    public void ImprimeString(){
        System.out.println("Horário em String: "+toString());
    }


    public long tempoEmSegundos() {
        long segundoS = this.segundo;
        long horaS = this.hora * 60 * 60;
        long minutoS = this.minuto * 60;
        long Resultado = horaS + minutoS + segundoS;
        return Resultado;
    }

    public void ImprimeTempoemSegundos(){

        System.out.println("Tempo em Segundos: "+tempoEmSegundos());
    }

    public long difTempo(Tempo outro){
        outro.tempoEmSegundos();
        long tauxTt = outro.tempoEmSegundos();
        long tPrin = tempoEmSegundos();
        long tAuxT = tauxTt - tPrin;
        System.out.println("Diferença em Segundos do primeiro para o segundo jogo!: "+tAuxT);
        return  tAuxT;
    }


}
