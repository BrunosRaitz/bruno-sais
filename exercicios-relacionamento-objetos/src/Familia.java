import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Familia {

    private List<PessoaEx9> listaPessoas;

    public Familia(){
        listaPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(PessoaEx9 p){
        listaPessoas.add(p);
    }

    public PessoaEx9 obterPessoaMaisVelha(){
        PessoaEx9 pessoaMaisVelha = null;
        LocalDate dataMaisVelha = LocalDate.now();
        for (PessoaEx9 p : listaPessoas){
            if (p.getDataNascimento().isBefore(dataMaisVelha)){
                pessoaMaisVelha = p;
                dataMaisVelha = p.getDataNascimento();
            }
        }
        return pessoaMaisVelha;
    }
}
