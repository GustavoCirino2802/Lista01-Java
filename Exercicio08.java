public class Exercicio08 {

    public static void executar() {
        
        double num = Prompt.lerDecimal("Digite um número: ");

        if (num >= 50) {
            Prompt.imprimir("O Número é maior ou igual a 50!");
        }
        else {
            Prompt.imprimir("Esse número é menor que 50!");
        }

    }
}
