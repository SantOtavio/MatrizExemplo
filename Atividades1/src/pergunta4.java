import java.util.Scanner;

public class pergunta4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matriz[][] = new int[5][5];
        String numeros = "";

        for (int i = 0 ; i < matriz[0].length ; i++){
            for (int n = 0 ; n < matriz.length ; n++){
                System.out.println("Insira o " + (n+1) + " valor da " + (i +1) + " coluna:");
                matriz[n][i] = sc.nextInt();
            }
        }

        for (int i = 0 ; i < matriz[0].length ; i++){
            for (int n = 0 ; n < matriz.length ; n++){
                if (i == n){
                    numeros += "\n" + matriz[n][i];
                }
            }
        }
        System.out.println(numeros);
    }
}
