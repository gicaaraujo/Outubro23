package Outubro23;

public class Principal2 {

	public static void main(String[] args) {

		Conta_bancaria conta = new Conta_bancaria("123456", 10000.00);
			
			Cliente cliente = new Cliente ("João", conta);
			
			System.out.println("Número da conta: " + conta.getNumero() +  "\nSaldo da conta: " + conta.getSaldo() +   "\nNome do Cliente: " + cliente.getNome());
		}
	}

