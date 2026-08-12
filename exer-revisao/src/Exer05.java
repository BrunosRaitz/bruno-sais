

public class Exer05 {
    static void main() {

        double [] elementos = {10, 20, 30, 40, 50};
        int maior = 0;
        int menor = 0;
        double soma = 0;

        for (int i = 0; i < elementos.length; i++){

            if (elementos[i] > elementos[maior]) maior = i;
            if (elementos[i] < elementos[menor]) menor = i;
            soma += elementos[i];
        }
        double media = soma / elementos.length;
        System.out.println("=============================================");
        System.out.println("Maior: v[" + maior + "] = " + elementos[maior]);
        System.out.println("Menor: v[" + menor + "] = " + elementos[menor]);
        System.out.println("A media é: "+media);

    }
}
