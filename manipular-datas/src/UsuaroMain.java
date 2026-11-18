import java.time.LocalDate;

public class UsuaroMain {
    public static void main(String[] args) {

        Usuario u1 = new Usuario(LocalDate.of(2003, 11, 03));

        if (u1.eMaiorDeIdade()){
            System.out.println(" Usuario maior idade");
        }else {
            System.out.println("Usuario menor de idade");
        }
    }
}
