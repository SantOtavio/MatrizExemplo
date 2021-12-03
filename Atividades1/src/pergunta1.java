import java.util.Scanner;

public class pergunta1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros[][] = new int[6][6];
        int numeroPesquisa;

        for (int i = 0 ; i < numeros[0].length ; i++){
            for (int n = 0 ; n < numeros.length ; n++){
                System.out.println("Insira o valor " + (n + 1));
                numeros[n][i] = sc.nextInt();
            }
        }

        System.out.println("Insira o número para pesquisa:");
        numeroPesquisa = sc.nextInt();

        for (int i = 0 ; i < numeros[0].length ; i++){
            for (int n = 0 ; n < numeros.length ; n++){
                if (numeroPesquisa == numeros[n][i]){
                    System.out.println("Número " + numeroPesquisa + " encontrado na linha " + n + " e na coluna" + i);
                }
                else{
                    System.out.println("Número não encontrado");
                }
            }
        }

        System.out.println(numeros[0][0]);
    }
}
