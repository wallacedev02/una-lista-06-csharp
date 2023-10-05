public class ExemploMatriz {
    public static void main(String[] args) {
        // Declarando e criando uma matriz de inteiros 3x3
        int[][] matriz = new int[3][3];

        // Preenchendo a matriz com valores
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;
        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 9;

        // Imprimindo a matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Mudar para uma nova linha após cada linha da matriz
        }
    }
}
