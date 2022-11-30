package Academy.devdojo.Atividades.Atividade0410;
//Um quadrado mágico é uma matriz quadrada de valores
// inteiros onde a soma dos
//        valores em cada linha, coluna ou diagonal principal
//        é a mesma, e não existem
//        elementos repetidos. Por exemplo, a matriz
//        2 7 6
//        9 5 1
//        4 3 8
//        representa um quadrado mágico. Escreva uma classe
//        QuadradoMagico que te-
//        nha o método estático é QuadradoMágico que retorne
//        true caso a matriz, pas-
//        sada como argumento para o método, represente um
//        quadrado mágico.

public class QuadMagico {
    private int[][] matrix = new int[3][3];

    public QuadMagico(int a, int b, int c, int d, int e, int f, int g, int h, int i) {
        this.matrix[0][0] = a;
        this.matrix[0][1] = b;
        this.matrix[0][2] = c;
        this.matrix[1][0] = d;
        this.matrix[1][1] = e;
        this.matrix[1][2] = f;
        this.matrix[2][0] = g;
        this.matrix[2][1] = h;
        this.matrix[2][2] = i;
    }

    public void ImprimeMatriz() {
        int i;
        int j;
        for (i = 0; i < matrix.length; i++) {
            System.out.println();
            for (j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
        }
    }


    public boolean EhMagico() {
        int valorl1;
        int valorl2;
        int valorl3;
        int valorc1;
        int valorc2;
        int valorc3;
        int valord1;
        int valord2;


        valorl1 = this.matrix[0][0] + this.matrix[0][1] + this.matrix[0][2];
        valorl2 = this.matrix[1][0] + this.matrix[1][1] + this.matrix[1][2];
        valorl3 = this.matrix[2][0] + this.matrix[2][1] + this.matrix[2][2];
        valorc1 = this.matrix[0][0] + this.matrix[1][0] + this.matrix[2][0];
        valorc2 = this.matrix[0][1] + this.matrix[1][1] + this.matrix[2][1];
        valorc3 = this.matrix[0][2] + this.matrix[1][2] + this.matrix[2][2];
        valord1 = this.matrix[0][0] + this.matrix[1][1] + this.matrix[2][2];
        valord2 = this.matrix[2][0] + this.matrix[1][1] + this.matrix[0][2];

        if (valorl1 == valorl2 && valorl2 == valorl3 && valorc1 == valorc2 && valorc2 == valorc3 && valord1 == valord2 && valord1 == valorl1 && valord1 == valorc1) {
            return true;
        } else {
            return false;
        }

    }


    public void VerificaQuad() {
        if(this.EhMagico()){
            System.out.println();
            System.out.println("eh quad!!!");
        }else{
            System.out.println();
            System.out.println("nao eh quad");
        }
    }
}