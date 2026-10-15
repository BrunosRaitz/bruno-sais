import java.util.ArrayList;
import java.util.List;

public class SistemaAlunos {

    private List<Alunos> alunos;

    public SistemaAlunos(){
        alunos = new ArrayList<>();
    }

    public void adicionarAluno(Alunos a){
        alunos.add(a);
    }
    
}
