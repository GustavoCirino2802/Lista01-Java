public class Exercicio10 {
    public static void executar() {

        int num = Prompt.lerInteiro("Digite um número de 1 a 5: ");

        if (num < 1 || num > 5) {
            Prompt.imprimir("Número inválido!");         
        }

        switch (num) {
            case 1: 
                Prompt.imprimir("UM!");
                break;
            case 2: 
                Prompt.imprimir("DOIS!");
                break;
            case 3: 
                Prompt.imprimir("TRÊS!");
                break;
            case 4: 
                Prompt.imprimir("QUATRO!");
                break;
            case 5: 
                Prompt.imprimir("CINCO!");
                break;
                
        }
    }
}
