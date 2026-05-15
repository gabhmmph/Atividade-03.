//Ativade 02. Peça ao usuário para inserir dois números inteiros.
// Compare os números e imprima uma mensagem indicando se são iguais, diferentes, o primeiro é maior ou o segundo é maior.

import java.util.Scanner;

public class Comparacao {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro n15251umero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo numero: ");
        int numero2 = scanner.nextInt();

        if (numero1 == numero2) {
            System.out.println("Os numeros sao iguais");
        } else if (numero1 > numero2) {
            System.out.println("Primeiro numero e maior");
        } else {
            System.out.println("O segundo numero e maior");
        }
    }
}