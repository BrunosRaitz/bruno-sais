import java.time.LocalDate;

public class PessoaEx9 {

    private String nome;
    private LocalDate dataNascimento;

    public PessoaEx9(String nome, LocalDate dataNascimento) {
        setNome(nome);
        setDataNascimento(dataNascimento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()){
            throw new IllegalArgumentException("Nome invalido");
        }
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        if (dataNascimento == null || dataNascimento.isAfter(LocalDate.now())){
            throw new IllegalArgumentException("Data invalida");
        }
        this.dataNascimento = dataNascimento;
    }
}
