public class exampleMatriz {
    public static void main(String[] args) {
        double notas[][] = new double[7][3];
        double notas2[][] = {{1.2 , 3.4 , 5.6 , 7.8 ,9.1 , 2.3 , 4.5} , {1.2 , 3.4 , 5.6 , 7.8 ,9.1 , 2.3 , 4.5} , {1.2 , 3.4 , 5.6 , 7.8 ,9.1 , 2.3 , 4.5}};
        notas2[0][2] = 20.2;
        int tamanhoLinhas = notas.length;
        int tamanhoColunas = notas[0].length;
    }
}
