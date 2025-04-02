import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Set<Integer> sorteados = new HashSet<>();
        while (sorteados.size() < 6) {
            sorteados.add(random.nextInt(60) + 1);
        }

        Set<Integer> palpites = new HashSet<>();
        System.out.println("Digite seus 6 números de palpite (entre 1 e 60):");
        while (palpites.size() < 6) {
            int numero = scanner.nextInt();
            if (numero >= 1 && numero <= 60) {
                palpites.add(numero);
            } else {
                System.out.println("Número inválido. Digite novamente entre 1 e 60.");
            }
        }

        Set<Integer> acertos = new HashSet<>(palpites);
        acertos.retainAll(sorteados);

        System.out.println("Números sorteados: " + sorteados);
        System.out.println("Palpites: " + palpites);
        System.out.println("Acertou " + acertos.size() + " número(s).");

        scanner.close();
    }
}
