public class Exercicio07 {
    public static void executar() {

    double num1 = Prompt.lerDecimal("Digite um número: ");

    if (num1 >= 100 && num1 <= 200) {
        Prompt.imprimir("o Número está no intervalo de 100 a 200!");
    }
    else {
        Prompt.imprimir("O Número não está no intervalo entre 100 e 200 :(");
    }



    }
}
