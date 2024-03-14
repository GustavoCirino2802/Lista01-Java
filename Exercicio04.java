public class Exercicio04 {
    public static void executar() {

    double num1 = Prompt.lerDecimal("Digite o primeiro numero: ");
    double num2 = Prompt.lerDecimal("Digite o segundo numero: ");

    double soma = (num1 + num2);
    double sub = (num1 - num2);
    double multi = (num1 * num2);
    double div = (num1 / num2);

    Prompt.imprimir("A Soma dos números é: " + soma);
    Prompt.imprimir("A Subtração dos números é: " + sub);
    Prompt.imprimir("A Multiplicação é: " + multi);
    Prompt.imprimir("A Divisão é: " + div);

    }
}
