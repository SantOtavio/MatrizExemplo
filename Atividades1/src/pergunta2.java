import java.util.Scanner;

public class pergunta2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matriz[][] = new int[4][4];
        String numerosDiagonalPrincipal = "" , numerosDiagonalSecundaria = "" , numerosExcetoPrincipal = "" , numerosExcetoSecundaria = "";

        for (int i = 0 ; i < matriz[0].length ; i++){
            for (int n = 0 ; n < matriz.length ; n++){
                System.out.println("Insira o valor " + (n+1) + " da coluna " + (i+1));
                matriz[i][n] = sc.nextInt();
            }
        }

        for (int i = 0 ; i < matriz[0].length ; i++){
            for (int n = 0 ; n < matriz.length ; n++){
                if (i == n){
                    numerosDiagonalPrincipal += "\n" + matriz[n][i];
                }
            }
        }
        System.out.println("Números na diagonal principal: " + numerosDiagonalPrincipal);

        for (int i = 0 ; i < matriz[0].length ; i++){
            for (int n = 0 ; n < matriz.length ; n++){
                if (!(i == n)){
                    numerosDiagonalSecundaria += "\n" + matriz[n][i];
                }
            }
        }
        System.out.println("Números fora da diagonal principal" + numerosDiagonalSecundaria);


        for (int i = 0 ; i < matriz[0].length ; i++){
            for (int n = 0 ; n < matriz.length ; n++){
                if ((i == 3 && n == 0) || (i == 2 && n == 1) || (i == 1 && n == 2) ||(i == 0 && n == 3) ){
                    numerosExcetoPrincipal += "\n" + matriz[n][i];
                }
            }
        }
        System.out.println("Números da diagonal secundária: " + numerosExcetoPrincipal);


        for (int i = 0 ; i < matriz[0].length ; i++){
            for (int n = 0 ; n < matriz.length ; n++){
                if (!(i == 3 && n == 0) || (i == 2 && n == 1) || (i == 1 && n == 2) ||(i == 0 && n == 3) ){
                    numerosExcetoSecundaria += "\n" + matriz[n][i];
                }
            }
        }
        System.out.println("Números da diagonal secundária: " + numerosExcetoSecundaria);

        System.out.println("Números da diagonal principal e secundária: " + numerosDiagonalPrincipal + numerosDiagonalSecundaria);
        System.out.println("Todos os números exceto os da diagonal principal e secundária: " + numerosExcetoPrincipal + numerosExcetoSecundaria);


    }
}
