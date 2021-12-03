import java.util.Scanner;

public class pergunta6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String matriz[][] = new String[5][5], num;

        System.out.print("Insira um número: ");
        num = sc.next();

        for(int j = 0; j < matriz[0].length; j++) {
            for(int i = 0; i < matriz.length; i++) {
                matriz[j][i] = " ";
            }
        }
        matriz[0][0] = num;
        matriz[0][4] = num;
        matriz[2][2] = num;
        matriz[4][0] = num;
        matriz[4][4] = num;
//		
        System.out.println(matriz[0][0] + matriz[0][1] + matriz[0][2] + matriz[0][3] + matriz[0][4]);
        System.out.println(matriz[1][0] + matriz[1][1] + matriz[1][2] + matriz[1][3] + matriz[1][4]);
        System.out.println(matriz[2][0] + matriz[2][1] + matriz[2][2] + matriz[2][3] + matriz[2][4]);
        System.out.println(matriz[3][0] + matriz[3][1] + matriz[3][2] + matriz[3][3] + matriz[3][4]);
        System.out.println(matriz[4][0] + matriz[4][1] + matriz[4][2] + matriz[4][3] + matriz[4][4]);

        sc.close();
    }
}