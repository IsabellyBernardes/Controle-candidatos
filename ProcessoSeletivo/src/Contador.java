import java.util.Scanner;


public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt(); // Ler o primeiro parâmetro
        
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt(); // Ler o segundo parâmetro
        
        try {
            // Chamar o método que contém a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            // Imprimir a mensagem de exceção
            System.out.println(exception.getMessage());
        }
        
        terminal.close(); // Fechar o scanner após o uso
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se parametroUm é maior que parametroDois e lançar a exceção se necessário
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        // Realizar o loop para imprimir os números incrementados
        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}