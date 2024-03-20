public class Exercicio17 {
    public static void executar() {
        
        double nota1 = Prompt.lerDecimal("Digite a primeira nota do aluno: ");
        double peso1 = Prompt.lerDecimal("Digite o peso da primeira nota: ");
        
        double nota2 = Prompt.lerDecimal("Digite a segunda nota do aluno: ");
        double peso2 = Prompt.lerDecimal("Digite o peso da segunda nota: ");
        
        double nota3 = Prompt.lerDecimal("Digite a terceira nota do aluno: ");
        double peso3 = Prompt.lerDecimal("Digite o peso da terceira nota: ");
        
        double mediaPonderada = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / (peso1 + peso2 + peso3);
        
        Prompt.imprimir("A média ponderada das notas é: " + mediaPonderada);
    }
}
