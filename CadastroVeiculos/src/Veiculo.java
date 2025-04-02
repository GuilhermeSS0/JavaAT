public class Veiculo {
    String placa;
    String modelo;
    int ano;
    double quilometragem;

    public Veiculo(String placa, String modelo, int ano, double quilometragem) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.quilometragem = quilometragem;
    }

    public void exibirDetalhes() {
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Quilometragem: " + quilometragem);
    }

    public void registrarViagem(double km) {
        quilometragem += km;
    }
}
