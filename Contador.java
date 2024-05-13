import java.util.Scanner;

public class Contador extends ParametrosInvalidosException {
    public static void main(String[] args) {

        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primero parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        try{

            contar(parametroUm, parametroDois);

        }catch (ParametrosInvalidosException e){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");
        }
    }
}
