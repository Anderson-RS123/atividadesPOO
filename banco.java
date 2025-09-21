// 										Exercício: 5
//             			Resumo do programa
// O código deve criar  uma conta em unm banco, e dar a possibilidade de saquar ou depositar dinheiro,
// mostrando o saldo apos cada operacao.

// 				Planejamento das classes
// classe: Conta; Atributos: numero_conta e saldo; Metodos: depositar e sacar;

package atividades;

public class banco {
	static class Conta{
		int numero_conta;
		double saldo;
		
		Conta(int numero_conta, double saldo){
			this.numero_conta = numero_conta;
			this.saldo = saldo;
		}
		
		void depositar(Double valor) {
			saldo = saldo + valor;
			System.out.println("Valor de R$" + valor + " depositado na conta " + numero_conta + ". Saldo atual: R$" + saldo + ".");
		}
		 void sacar(Double valor) {
			 if (valor > saldo) {
				 System.out.println("Você não possui esse valor em conta!!! Tente sacar menos dinheiro.");
			 }else {
				 saldo = saldo - valor;
				 System.out.println("Valor de R$" + valor + " sacado da sua conta " + numero_conta + ". Saldo atual:R$" + saldo + ".");
			 }
		 }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta conta1 = new Conta(1, 0);
		conta1.depositar(1500.06);
		conta1.sacar(1700.00);
		conta1.sacar(200.00);
		
		Conta conta2 = new Conta(2, 110);
		conta2.depositar(200.00);
		conta2.sacar(310.00);
		conta2.sacar(200.00);
	}

}
