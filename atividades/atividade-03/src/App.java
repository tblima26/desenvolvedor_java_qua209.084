import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /**
         * //TODO - ATIVIDADE 03
         * Recrie o programa da Calculadora feito no dia 18/03, mas desta vez,
         * acrescentando a opção de encerrar o programa quando o usario quiser.
         */
        Scanner scanner = new Scanner(System.in);
        int options;
        do {
            System.out.println("\n=== CALCULADORA ===");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            options = scanner.nextInt();
            double num1, num2, result = 0;
            if (options >= 1 && options <= 4) {
                System.out.print("Digite o primeiro número: ");
                num1 = scanner.nextDouble();
                System.out.print("Digite o segundo número: ");
                num2 = scanner.nextDouble();
                switch (options) {
                    case 1:
                        result = num1 + num2;
                        break;
                    case 2:
                        result = num1 - num2;
                        break;
                    case 3:
                        result = num1 * num2;
                        break;
                    case 4:
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            System.out.println("Erro: divisão por zero!");
                            continue;
                        }
                        break;
                }
                System.out.println("Resultado: " + result);
            } else if (options != 0) {
                System.out.println("Opção inválida!");
            }
        } while (options != 0);
        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
