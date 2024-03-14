

public class Exercicio01 {
    
    public static void executar() {


        double numero = Prompt.lerDecimal("Digite um numero: "); 

        if (numero  > 10) {
            Prompt.imprimir("Esse número é MAIOR que 10!");
        }
        if (numero < 10) {
            Prompt.imprimir("Esse número é MENOR que 10!");
        }
        if (numero == 10) {
            Prompt.imprimir("Esse número é IGUAL a 10!!");
        }

    }
}
