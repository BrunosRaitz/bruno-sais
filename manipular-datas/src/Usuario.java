import java.time.LocalDate;
import java.time.Period;

public class Usuario {

    private LocalDate dataNascimento;

    public Usuario(LocalDate dataNascimento) {
        setDataNascimento(dataNascimento);
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

    public boolean eMaiorDeIdade(){
        int idade = Period.between(dataNascimento, LocalDate.now()).getYears();
        return idade >= 18;
    }
}
