public class Exercicio13 {
    public static void executar(){

        double A = Prompt.lerDecimal("Digite um número para A: ");
        double B = Prompt.lerDecimal("Digite um número para B: ");
        double res;
        Character operador = Prompt.lerCaractere("Digite algum operador(+, -, *, /): ");

        if (operador == '+') {    
            res = (A + B);
            Prompt.imprimir("O Resultado é: " + res);        
        }

        if (operador == '-') {    
            res = (A - B);
            Prompt.imprimir("O Resultado é: " + res);        
        }

        if (operador == '*') {    
            res = (A * B);
            Prompt.imprimir("O Resultado é: " + res);        
        }

        if (operador == '/') {    
            res = (A / B);
            Prompt.imprimir("O Resultado é: " + res);        
        }

        if (operador != '+' && operador != '-' && operador != '*' && operador != '/') {    
            Prompt.imprimir("Carácter inválido! ");
        }  
        }
    }

