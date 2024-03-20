public class Exercicio20 {
    public static void executar() {
        
        double tempoViagemHoras = Prompt.lerDecimal("Digite o tempo de viagem em horas: ");
        double velocidadeMedia = Prompt.lerDecimal("Digite a velocidade média da viagem em km/h: ");
        
        double distancia = tempoViagemHoras * velocidadeMedia;
        
        double consumoPorLitro = 12.0;
        
        double litrosGastos = distancia / consumoPorLitro;
        
        Prompt.imprimir("A quantidade de litros de combustível gasta é: " + litrosGastos);
    }
}
