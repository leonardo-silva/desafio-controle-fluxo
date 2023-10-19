/******************************************************************************
 Controle de fluxo - Desafio
 @author LeonardoSilva
 *******************************************************************************/
import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();

            //chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println(exception.getMessage());
        } catch (InputMismatchException exception) {
            System.out.println("Numero informado não é um inteiro válido!");
        }
    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroDois < parametroUm)
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");

        int contagem = parametroDois - parametroUm;
        if (contagem == 0)
            System.out.println("Parametro um foi igual ao parametro 2");
        else {
            //realizar o for para imprimir os números com base na variável contagem
            for(int i=1; i<=contagem; i++) {
                System.out.println("Imprimindo número " + i);
            }
        }
    }
}