package Academy.devdojo.Atividades.Atividade0410;
//Escreva a classe ConversaoDeUnidadesDeVolume com métodos estáticos para
//        conversão das unidades de volume segundo a lista abaixo.
//        – 1 litro = 1000 centímetros cúbicos
//        – 1 metro cúbico = 1000 litros
//        – 1 metro cúbico = 35.32 pés cúbicos
//        – 1 galão americano = 231 polegadas cúbicas
//        – 1 galão americano = 3.785 litros
public class Conversor {
    private double litro;
    private double metroCubicoLitro;
    private double metroCubicoPes;
    private double galaoAmericanoPolegadas;
    private double galaoAmericanoLitros;
        private static int centcub=1000;
        private static int litros=1000;
        private static double pescub=35.32;
        private static int polcub=231;
        private static int litros2=3875;

    public Conversor(){
        this.galaoAmericanoLitros=0;
        this.litro=0;
        this.metroCubicoLitro=0;
        this.metroCubicoPes=0;
        this.galaoAmericanoPolegadas=0;
    }
    public Conversor(double litro, double metroCubicoLitro, double metroCubicoPes, double galaoAmericanoPolegadas, double galaoAmericanoLitros){
        this.litro = litro;
        this.metroCubicoLitro = metroCubicoLitro;
        this.metroCubicoPes = metroCubicoPes;
        this.galaoAmericanoPolegadas = galaoAmericanoPolegadas;
        this.galaoAmericanoLitros= galaoAmericanoLitros;
    }

    public void ConversaoTotal(){
        this.litro = this.litro * centcub;
        this.metroCubicoLitro = this.metroCubicoLitro * litros;
        this.metroCubicoPes = this.metroCubicoPes * pescub;
        this.galaoAmericanoPolegadas = this.galaoAmericanoPolegadas * polcub;
        this.galaoAmericanoLitros = this.galaoAmericanoLitros * litros2;
        System.out.println("Conversao Concluida: " + "Litros em Centimetros cubicos: "+ this.litro + "");
        System.out.println("Metro Cubico em Litros: "+this.metroCubicoLitro);
        System.out.println("metro cubico em pes: "+this.metroCubicoPes);
        System.out.println("Galao americano em polegadas: "+this.galaoAmericanoPolegadas);
        System.out.println("Galao Americano em Litros: "+this.galaoAmericanoLitros);

    }
}
