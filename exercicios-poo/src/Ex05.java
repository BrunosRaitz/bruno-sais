public class Ex05 {
    public static void main(String[] args) {


        int aumento = 12;
        Funcionario p1 = new Funcionario();

        p1.identificacao = "6423624";
        p1.nome = "Jose";
        p1.sobrenome = "da Silva";
        p1.salarioM = 1000.0;

        System.out.println("Nome: "+p1.obterNomeCompleto());
        System.out.println("Salario Anual: "+p1.obterSalarioAnual());
        System.out.println("Aumento do salario: "+p1.obterAumentoSalario(aumento));

    }
}
