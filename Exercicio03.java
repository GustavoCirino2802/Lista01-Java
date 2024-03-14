public class Exercicio03 {
    public static void executar(){

    int A = Prompt.lerInteiro("Digite um numero A: ");
    int B = Prompt.lerInteiro("Digite um numero B: ");

    if(A > B){
        Prompt.imprimir("O A =" + A + "é maior que B =" + B);
    }
    else if(B > A){
        Prompt.imprimir("O B =" + B + "é maior que A =" + A );
    }
    if (A == B) {
        Prompt.imprimir("A Sequência digitada é inválida!");
        
    }
    
    }

}
