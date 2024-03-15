public class Exercicio11 {
    public static void executar() {

        int num1 = Prompt.lerInteiro("Digite um número: ");
        int num2 = Prompt.lerInteiro("Digite outro número: ");
        int num3 = Prompt.lerInteiro("Digite outro número: ");

        int cres;
        if (num1 > num2) {
            cres = num1;
            num1 = num2;
            num2 = cres;
        }
        if (num2 > num3) {
            cres = num2;
            num2 = num3;
            num3 = cres;
        }
        if (num1 > num2) {
            cres = num1;
            num1 = num2;
            num2 = cres;
        }

        Prompt.imprimir("Os Números e ordem crescente são: ");
        Prompt.imprimir(+ num1);
        Prompt.imprimir(+ num2);
        Prompt.imprimir(+ num3);

        



    }
}
