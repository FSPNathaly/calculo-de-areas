import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double opcao;

        System.out.print("1 - Quadrado\n 2 - Circulo\n 3 - Triângulo\n 0 - Fim\n Digite a opção: ");
        opcao = ler.nextDouble();

        while (opcao != 0) {
            if (opcao == 1) {
                System.out.print("Digite o lado do quadrado: ");
                double lado = ler.nextDouble();
                double quadrado = lado * lado;
                System.out.println("O resultado é: " + quadrado);
            } else if (opcao == 2) {
                System.out.print("Digite o raio do circulo: ");
                double raio = ler.nextDouble();
                double circulo = 3.14 * raio * raio;
                System.out.println("O resultado é: " + circulo);
            } else if (opcao == 3) {
                System.out.println("Digite a base do triângulo:");
                double base = ler.nextDouble();
                System.out.println("Digite a altura do triângulo: ");
                double altura = ler.nextDouble();
                double triangulo = (base * altura);
                System.out.println("O resultado é: " + triangulo);
            } else if (opcao == 0) {
                System.out.println("Fim");
            } else {
                System.out.println("Opção inválida");
            }
            System.out.println("1 - Quadrado\n 2 - Circulo\n 3 - Triângulo\n 0 - Fim\n Digite a opção: ");
            opcao = ler.nextDouble();
        }
        ler.close();
    }
}