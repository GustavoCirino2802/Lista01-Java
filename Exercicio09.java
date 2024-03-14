public class Exercicio09 {
    public static void executar(){

        double numA = Prompt.lerDecimal("Digite um Número A: ");
        double numB = Prompt.lerDecimal("Digite um Número B: ");
        Prompt.separador();

        if (numA == numB) {
            Prompt.imprimir("Os Números A e B são iguais!!");   
        }
        else {
            Prompt.imprimir("Os Números A e B são diferentes!");
        }
        if (numA > numB) {
            Prompt.imprimir("O Número A é maior que o Número B!");
            Prompt.imprimir("O Número é: " + numA);
            Prompt.separador();
        }
        else if (numB > numA) {
            Prompt.imprimir("O Número B é maior que o Número A!");
            Prompt.imprimir("O Número é: " + numB);
            Prompt.separador();
        }



    }

}
