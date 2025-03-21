import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("1 - Quadrado\n2 - Círculo\n3 - Triângulo\n0 - Sair");
            System.out.print("Digite a opção: ");
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o lado do quadrado: ");
                    double lado = ler.nextDouble();
                    double areaQuadrado = lado * lado;
                    System.out.println("Área do quadrado: " + areaQuadrado);
                    break;

                case 2:
                    System.out.print("Digite o raio do círculo: ");
                    double raio = ler.nextDouble();
                    double areaCirculo = Math.PI * raio * raio;
                    System.out.println("Área do círculo: " + areaCirculo);
                    break;

                case 3:
                    System.out.print("Digite a base do triângulo: ");
                    double base = ler.nextDouble();
                    System.out.print("Digite a altura do triângulo: ");
                    double altura = ler.nextDouble();
                    double areaTriangulo = (base * altura) / 2;
                    System.out.println("Área do triângulo: " + areaTriangulo);
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        ler.close();
    }
}
