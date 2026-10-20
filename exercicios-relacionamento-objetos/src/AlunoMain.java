public class AlunoMain {
    public static void main(String[] args) {


        Alunos a1 = new Alunos("Jose", 32, "123456", "Informatica", 10);
        Alunos a2 = new Alunos("Zoio", 28, "67676767", "DJ", 9.9);
        Alunos a3 = new Alunos("Euclides", 18, "394857621", "Informatica", 7);


        SistemaAlunos s1 = new SistemaAlunos();

        s1.adicionarAluno(a1);
        s1.adicionarAluno(a2);
        s1.adicionarAluno(a3);

        System.out.println(s1.pesquisarAlunosPorCurso("Informatica", 18, 5));

        Alunos resultado = s1.buscarAlunoPorMatricula("1234567");

        if (resultado != null) {
            System.out.println(resultado);
        } else {
            System.out.println("Aluno não encontrado!");
        }
    }
}
