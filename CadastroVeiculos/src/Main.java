public class Main {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("JACARE", "Fusca", 1970, 23000);
        veiculo1.exibirDetalhes();
        veiculo1.registrarViagem(150);
        veiculo1.exibirDetalhes();
    }
}
