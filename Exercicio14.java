public class Exercicio14 {
        public static void executar() {
    
            int a1 = Prompt.lerInteiro("Digite o valor do primeiro termo (a1): ");
    
            int n = Prompt.lerInteiro("Digite o valor de n (ordem do termo a ser encontrado): ");
            
    
            int r = Prompt.lerInteiro("Digite o valor da razão (r): ");          
    
            int an = a1 + (n - 1) * r;
    
            Prompt.imprimir("O " + n + "º termo da progressão aritmética é: " + an);
        }
    }
    

