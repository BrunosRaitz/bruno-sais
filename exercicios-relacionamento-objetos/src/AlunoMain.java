public class AlunoMain {
    public static void main(String[] args) {


        Alunos a1 = new Alunos("Jose", 32, "123456", "Informatica",);

        SistemaAlunos s1 = new SistemaAlunos();

        s1.adicionarAluno(a1);
    }
}
