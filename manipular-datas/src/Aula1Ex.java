import java.time.LocalDate;
import java.time.Period;

public class Aula1Ex {

    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();

        System.out.println(hoje);

        LocalDate dataNascimentoHenrique = LocalDate.of(2001,10,11);

        LocalDate dataNascimentoDiogo = LocalDate.of(2003,04,02);

        if (dataNascimentoDiogo.isAfter(dataNascimentoHenrique)) {
            System.out.println("Diogo mais novo");
        }else {
            System.out.println("Henrique mais novo");
        }

        int idadeDiogo = Period.between(dataNascimentoDiogo,hoje).getYears();
        System.out.println("Idade diogo "+idadeDiogo+" anos");

    }
}
