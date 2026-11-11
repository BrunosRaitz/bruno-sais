public class Exer06Main {
    public static void main(String[] args) {

        Endereco e1 = new Endereco("BH", "XiqueXique", "6767676", "tchurusbango tchurusbago", "67");

        Pessoa p1 = new Pessoa("Jamelao", e1);

        System.out.println(p1);
    }
}
