import java.util.Scanner;

public class exercicio1lista {
    public static void main(String[] args) {
        // Elaborar um programa que efetue a leitura de dez nomes de pessoas
        // em um vetor A do tipo texto e apresentá-los em seguida

        String[] nome = new String[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < nome.length; i++) {

            System.out.println("Digite o nome: ");
            nome[i] = scanner.nextLine();

        }
        for (int i = 0; i < nome.length; i++) {
            
            System.out.println("nome: " +nome[i]);
        }

        }
    }

