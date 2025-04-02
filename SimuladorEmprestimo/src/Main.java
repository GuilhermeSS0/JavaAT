import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o valor do empréstimo: ");
        double vlrEmprestado = scanner.nextDouble();

        System.out.print("Digite o número de parcelas (mínimo 6, máximo 48): ");
        int parcelas = scanner.nextInt();

        if (parcelas < 6 || parcelas > 48) {
            System.out.println("Número de parcelas inválido.");
        } else {
            double jurosMensal = 0.03;
            double valorTotal = vlrEmprestado * Math.pow(1 + jurosMensal, parcelas);
            double parcelaMensal = valorTotal / parcelas;

            DecimalFormat df = new DecimalFormat("#.##");

            System.out.println("Valor total pago: R$ " + df.format(valorTotal));
            System.out.println("Valor da parcela mensal: R$ " + df.format(parcelaMensal));
        }

        scanner.close();
    }
}
