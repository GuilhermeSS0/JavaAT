public class Aluno {
    String nome;
    String matricula;
    double nota1, nota2, nota3;

    public Aluno(String nome, String matricula, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularMedia() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public void verificarAprovacao() {
        if (calcularMedia() >= 7) {
            System.out.println(nome + " foi aprovado!");
        } else {
            System.out.println(nome + " foi reprovado!");
        }
    }
}
