package Academy.devdojo.Atividades.Atividade0410;

public class TestTempo {
    public static void main(String[] args) {
        Tempo jogo1 = new Tempo(5,30,30);
        Tempo jogo2 = new Tempo(9,30,30);

        jogo1.toString();
        jogo1.ImprimeString();

        jogo1.tempoEmSegundos();
        jogo1.ImprimeTempoemSegundos();
        jogo1.difTempo(jogo2);
        jogo1.setHora(55);





    }
}
