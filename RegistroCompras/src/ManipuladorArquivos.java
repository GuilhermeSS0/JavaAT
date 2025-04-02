import java.io.*;

public class ManipuladorArquivos {

    private String nomeArquivo;

    public ManipuladorArquivos(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void registrarCompra(String produto, int quantidade, double precoUnitario) throws IOException {
        FileWriter writer = new FileWriter(nomeArquivo, true);
        writer.write(produto + " | Quantidade: " + quantidade + " | Preço unitário: R$ " + precoUnitario + "\n");
        writer.close();
    }

    public void lerCompras() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo));
        System.out.println("\nCompras registradas:");
        String linha;
        while ((linha = reader.readLine()) != null) {
            System.out.println(linha);
        }
        reader.close();
    }
}
