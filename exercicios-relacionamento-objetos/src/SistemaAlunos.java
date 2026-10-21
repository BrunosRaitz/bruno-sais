import java.util.ArrayList;
import java.util.List;

public class SistemaAlunos {

    private List<Alunos> alunos;

    public SistemaAlunos(){
        alunos = new ArrayList<>();
    }

    public void adicionarAluno(Alunos a){
        for (Alunos aluno : alunos){
            if (aluno.getMatriculo().equalsIgnoreCase(a.getMatriculo())){
                throw new IllegalArgumentException("Matricula repetida.");
            }
        }
        alunos.add(a);
    }
    public List<Alunos> pesquisarAlunosPorCurso (String curso, int i, double m){

        List<Alunos> cursoAlunos = new ArrayList<>();
        for (Alunos a : alunos){
            if (a.getIdade() >= i && a.getMediaFinal() >= m){
                if (a.getCurso().equals(curso)){
                    cursoAlunos.add(a);
                }
            }
        }
        return cursoAlunos;
    }

    public Alunos buscarAlunoPorMatricula (String matricula){
        for (Alunos a : alunos){
            if (matricula.equals(a.getMatriculo())){
                return a;
            }
        }
        return null;
    }
}
