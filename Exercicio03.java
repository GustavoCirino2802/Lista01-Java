public class Exercicio03 {
    public static void executar(){

    double A = Prompt.lerDecimal("Digite um numero A: ");
    double B = Prompt.lerDecimal("Digite um numero B: ");

    if(A > B){
        Prompt.imprimir("O A =" + A + "é maior que B =" + B);
    }
    else{
        Prompt.imprimir("O B =" + B + "é maior que A =" + A );
    }
    if (A == B) {
        Prompt.imprimir("A Sequência digitada é inválida!");
        
    }
    
    }

}
