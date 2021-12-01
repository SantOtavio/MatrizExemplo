import java.util.Scanner;

public class pergunta3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int matriz[][] = new int[5][5];
        String numero = "";

        for (int i = 0; i < matriz[0].length; i++) {
            for (int n = 0; n < matriz.length; n++) {
                System.out.println("Insira o valor " + (n + 1) + " da coluna " + (i + 1));
                matriz[n][i] = sc.nextInt();
            }
        }


        for (int i = 0; i < matriz[0].length; i++) {
            for (int n = 0; n < matriz.length; n++) {
                if (matriz[n][i] == i) {
                    numero += "\n" + matriz[n][i];
                }
            }
        }
        System.out.println(numero);
    }
}
