//Atividade 03. Crie um menu que oferece duas opções ao usuário: "1.
// Calcular área do quadrado" e "2. Calcular área do círculo".
// Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.

import java.util.Scanner;

public class CalculadoraArea {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int escolha = 0;

        while (escolha != 3){
            System.out.println("-----Menu-----");
            System.out.println("1. Calcular area do quadrado");
            System.out.println("2. Calcular area do circulo");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opcao: ");
            escolha = scanner.nextInt();

            if (escolha == 1) {
                System.out.print("Digite o lado do quadrado: ");
                double lado = scanner.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("Area do quadrado: " + areaQuadrado);
            } else if (escolha == 2){
                System.out.print("Digite o raio do circulo: ");
                double raio = scanner.nextDouble();
                double areaCirculo = 3.14 * raio * raio;
                System.out.println("Area do circulo: " + areaCirculo);
            } else if (escolha == 3){
                System.out.println("Programa encerrado");
            } else {
                System.out.println("Opcao invalida. Tente novamente.");
            }
        }
    }
}