import java.util.Scanner;

public class pergunta7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int linhas=0, colunas=0;
        System.out.print("Linhas: ");
        linhas = sc.nextInt();
        System.out.print("Colunas: ");
        colunas = sc.nextInt();

        int[][] matriz = new int[linhas][colunas];
        int num;
        System.out.print("Número: ");
        num = sc.nextInt();
        int meioLinha = 0;
        int meioLinha2 = 0;
        int meioColuna = 0;
        int meioColuna2 = 0;

        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length ; j++) {


                if(i == 0 && j == 0 ) {
                    matriz[i][j] = num;
                }
                if(i == 0 && j == matriz[0].length - 1) {
                    matriz[i][j] = num;
                }
                if(i == matriz.length - 1 && j == 0) {
                    matriz[i][j] = num;
                }
                if(i == matriz.length - 1 && j == matriz[0].length - 1) {
                    matriz[i][j] = num;
                }


                // Meio matriz Impar linha
                if((linhas - 1) % 2 == 0) {
                    meioLinha = (linhas - 1) / 2;
                } else {
                    meioLinha = (linhas) / 2;
                    meioLinha2 = (linhas - 1) / 2;
                }


                // Meio matriz Impar Coluna
                if((colunas - 1) % 2 == 0) {
                    meioColuna = (colunas - 1) / 2;
                } else {
                    meioColuna = (colunas) / 2;
                    meioColuna2 = (colunas - 1) / 2;
                }

                if(((colunas - 1) % 2 != 0 && (linhas - 1) % 2 != 0) && (linhas == colunas)) {
                    matriz[meioLinha][meioColuna] = num;
                    matriz[meioLinha2][meioColuna2] = num;
                    matriz[meioColuna][meioLinha2] = num;
                    matriz[meioColuna2][meioLinha] = num;
                } else {
                    if((linhas < colunas) && (linhas % 2 != 0)) {
                        matriz[meioLinha][meioColuna] = num;
                        matriz[meioLinha][meioColuna2] = num;

                    } else if((linhas > colunas) && (linhas % 2 == 0)){
                        matriz[meioLinha][meioColuna] = num;
                        matriz[meioLinha2][meioColuna] = num;
                        if((linhas > colunas) && (linhas % 2 == 0) && (colunas % 2 == 0)) {
                            matriz[meioLinha][meioColuna] = num;
                            matriz[meioLinha2][meioColuna2] = num;
                            matriz[meioLinha][meioColuna2] = num;
                            matriz[meioLinha2][meioColuna] = num;
                        }


                    } else if((linhas > colunas) && (linhas % 2 != 0)){
                        matriz[meioLinha][meioColuna] = num;
                        matriz[meioLinha][meioColuna2] = num;

                    } else if((linhas < colunas) && (linhas % 2 == 0)) {
                        matriz[meioLinha][meioColuna] = num;
                        matriz[meioLinha2][meioColuna] = num;

                        if((linhas < colunas) && (linhas % 2 == 0) && (colunas % 2 == 0)) {
                            matriz[meioLinha][meioColuna] = num;
                            matriz[meioLinha][meioColuna2] = num;
                            matriz[meioLinha2][meioColuna2] = num;
                            matriz[meioLinha2][meioColuna] = num;

                        } else if((linhas > colunas) && (linhas % 2 == 0) && (colunas % 2 == 0)) {
                            matriz[meioLinha][meioColuna] = num;
                            matriz[meioLinha2][meioColuna2] = num;
                            matriz[meioLinha][meioColuna2] = num;
                            matriz[meioLinha2][meioColuna] = num;
                        }
                    }
                    matriz[meioLinha][meioColuna] = num;

//             matriz[meioLinha][meioColuna] = num;
                }



                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();

        }

        sc.close();


    }
}