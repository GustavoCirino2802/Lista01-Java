public class Exercicio16 {
    public static void executar() {

        double nota1 = Prompt.lerDecimal("Digite a primeira nota do aluno: ");
        double nota2 = Prompt.lerDecimal("Digite a segunda nota do aluno: ");
        double nota3 = Prompt.lerDecimal("Digite a terceira nota do aluno: ");
        
         double media = (nota1 + nota2 + nota3) / 3;
        
        
        Prompt.imprimir("A média aritmética das notas é: " + media);
    }
}

