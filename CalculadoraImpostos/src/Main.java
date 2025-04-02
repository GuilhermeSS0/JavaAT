import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu salário mensal: ");
        double salarioMensal = scanner.nextDouble();

        double salarioAnual = salarioMensal * 12;
        double imposto = 0.0;

        if (salarioAnual <= 22847.76) {
            System.out.println(nome + ", você está isento de imposto.");
        } else if (salarioAnual <= 33919.80) {
            imposto = salarioAnual * 0.075;
        } else if (salarioAnual <= 45012.60) {
            imposto = salarioAnual * 0.15;
        } else {
            imposto = salarioAnual * 0.275;
        }

        double salarioLiquido = salarioAnual - imposto;

        System.out.println("Imposto: R$ " + imposto);
        System.out.println("Salário líquido anual: R$ " + salarioLiquido);

        scanner.close();
    }
}
