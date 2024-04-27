import java.util.Scanner;

public class exercicio2lista {
    public static void main(String[] args) {

        /*
         * Elaborar um programa que leia oito elementos inteiros em um vetor A.
         * Construir um vetor B de mesma dimensão com os elementos do vetor A
         * multiplicados por 3.
         * O elemento B[1] deve ser implicado pelo elemento A[1] * 3, o elemento B[2]
         * implicado pelo elemento A[2] * 3,
         * e assim por diante, até 8. Apresentar a vetor B
         */

        int[] A = new int[8];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < A.length; i++) {
            System.out.printf("Digite o valor para A : ");
            A[i] = scanner.nextInt();
        }
        int[] B = new int[8];

        for (int i = 0; i < B.length; i++) {
            B[i] = A[i] * 3;
        }

        int contador = 0;

        while (contador < B.length) {
            System.out.printf("lista B: %d \n", B[contador]);
            contador++;
        }
        scanner.close();
    }

}
