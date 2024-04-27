import java.util.Scanner;

public class exercicio3lista {
    public static void main(String[] args) {
        /*
         * Escrever um programa que leia dois vetores (denominadas A e B) com 20
         * elementos reais.
         * Construir um vetor C, sendo cada elemento do vetor C a subtração de um
         * elemento correspondente do vetor A
         * com um elemento correspondente do vetor B, ou seja, a operação de
         * processamento deve estar baseada na
         * operação C[I] ← A[I] – B[I]. Ao final, apresentar os elementos do vetor C
         */

        int[] A = new int[5];
        int[] B = new int[5];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < A.length; i++) {
            System.out.printf("Digite o valor para A : ");
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < A.length; i++) {
            System.out.printf("Digite o valor para B : ");
            B[i] = scanner.nextInt();

        }
        int[] C = new int[5];
        for (int i = 0; i < C.length; i++) {
            C[i] = A[i] - B[i];
        }
        int contador = 0;
        while (contador < C.length) {
            System.out.println("Vetor " + C[contador]);
            contador++;

        }
        scanner.close();

    }
}
