import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do primeiro usuário: ");
        String usuario1 = scanner.nextLine();
        System.out.print("Digite o nome do segundo usuário: ");
        String usuario2 = scanner.nextLine();

        String[] mensagens = new String[10];

        for (int i = 0; i < 10; i++) {
            String usuarioAtual;
            if (i % 2 == 0) {
                usuarioAtual = usuario1;
            } else {
                usuarioAtual = usuario2;
            }
            System.out.print(usuarioAtual + ", digite sua mensagem: ");
            mensagens[i] = scanner.nextLine();
        }

        System.out.println("\n===== Histórico de Mensagens =====");
        for (int i = 0; i < 10; i++) {
            String usuarioAtual;
            if (i % 2 == 0) {
                usuarioAtual = usuario1;
            } else {
                usuarioAtual = usuario2;
            }
            System.out.println(usuarioAtual + ": " + mensagens[i]);
        }

        System.out.println("\nObrigado por utilizarem o sistema! Boa sorte para vocês! 🚀");

        scanner.close();
    }
}
