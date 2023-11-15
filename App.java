import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a:");
        double a = scanner.nextDouble();

        System.out.println("Informe b:");
        double b = scanner.nextDouble();

        System.out.println("Informe c:");
        double c = scanner.nextDouble();

        // Criar um objeto Funcao
        Funcao funcao = new Funcao(a, b, c);

        // Calcular e exibir as raízes
        funcao.raizes();
        scanner.close();
    }
}

