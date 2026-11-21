public class Exer07Main {

    static void main() {

        Usuario u1 = new Usuario("1234", "jamelao", "jamelao@1234",
                "0000", "12345678910", "Tchurosbango");

        UsuarioDTO u1DTO = new UsuarioDTO(u1.getNome(), u1.getEmail());

        System.out.println(u1DTO);
    }

}
