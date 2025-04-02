import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            ManipuladorArquivos arquivo = new ManipuladorArquivos("compras.txt");

            for (int i = 0; i < 3; i++) {
                System.out.print("Digite o nome do produto: ");
                String produto = scanner.nextLine();

                System.out.print("Digite a quantidade: ");
                int quantidade = scanner.nextInt();

                System.out.print("Digite o preço unitário: ");
                double precoUnitario = scanner.nextDouble();
                scanner.nextLine();

                arquivo.registrarCompra(produto, quantidade, precoUnitario);
            }

            arquivo.lerCompras();

        } catch (IOException e) {
            System.out.println("Erro ao acessar o arquivo: " + e.getMessage());
        }

        scanner.close();
    }
}
