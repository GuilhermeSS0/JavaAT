public class Main {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente("Carlos", 5000);
        Funcionario estagiario = new Estagiario("Maria", 1500);

        System.out.println("Salário do Gerente: R$ " + gerente.calcularSalario());
        System.out.println("Salário do Estagiário: R$ " + estagiario.calcularSalario());
    }
}
