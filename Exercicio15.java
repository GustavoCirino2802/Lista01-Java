public class Exercicio15 {

    public static void executar() {

        int x1 = Prompt.lerInteiro("Digite a coordenada x do ponto P1: ");
        int y1 = Prompt.lerInteiro("Digite a coordenada y do ponto P1: ");
        
        int x2 = Prompt.lerInteiro("Digite a coordenada x do ponto P2: ");
        int y2 = Prompt.lerInteiro("Digite a coordenada y do ponto P2: ");
           
        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        
        Prompt.imprimir("A distância entre os pontos P1 e P2 é: " + distancia);
    }
}

