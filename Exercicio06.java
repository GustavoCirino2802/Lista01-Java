public class Exercicio06 {
    public static void executar() {

    double C = Prompt.lerDecimal("Digite a Temperatura em Graus Celsius");

    double F = (9 * C + 160) / 5;

    Prompt.imprimir("A Temperatura em Celsius é: " + C);
    Prompt.imprimir("A Temperatura em Fahrenheit é: " + F);


    }
}
