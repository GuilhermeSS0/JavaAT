class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("João");

        conta.depositar(1000);
        conta.sacar(500);
        conta.exibirSaldo();
    }
}