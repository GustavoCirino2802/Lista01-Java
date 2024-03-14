public class Exercicio05 {
    public static void executar() {

    double A = Prompt.lerDecimal("Digite um número A: ");
    double B = Prompt.lerDecimal("Digite um número B: ");

    double aux;

    aux = A;
    A = B;
    B = aux;

    Prompt.imprimir("Original A = " + B);
    Prompt.imprimir("Trocado A = " + A);
    Prompt.imprimir("Original B = " + A);
    Prompt.imprimir("Trocado B = " + B);
    }
}
