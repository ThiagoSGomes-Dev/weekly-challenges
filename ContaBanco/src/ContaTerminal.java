import java.util.Scanner;

/** 
 * @author Thiago S Gomes
 * @version 1.0.0
 * @since 06/03/2024
*/

public class ContaTerminal {
     static private String nomeCliente = "MARIO ANDRADE";
     static private double saldo = 237.48;

    public static void main(String[] args) {
        Validar validador = new Validar();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o numero da Conta: ");
        int conta = scanner.nextInt();

        scanner.nextLine();
    
        System.out.print("Por favor, digite o numero da Agencia: ");
        String agencia = scanner.nextLine();
    
        Dados usuario = new Dados(conta, agencia);
    
        String resultado = validador.validator(usuario);
        if(resultado.equals("Usuario valido!")) {
          System.out.println(resultado);
          System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia e " + agencia + ", conta " + conta + " e seu saldo " + saldo + " ja esta disponivel para saque");
        }else {
          System.out.println(resultado + " :(");
        }
    
        scanner.close();
    }
}
