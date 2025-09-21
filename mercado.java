// 										Exercício: 3
//             			Resumo do programa
// O código deve calcular o valor de um  produto comprado, de acordo com o seu preco e a quantidade comprada, 
// e mostrar o valor total da compra de cada produto.


// 				Planejamento das classes
// classe: Mercado; Atributos: nome, valor_produto e quantidade; Metodos: valor_compra;




package atividades;

public class mercado {
	static class Mercado{
		String nome;
		double valor_produto;
		int quantidade;
		
		Mercado(String nome, double valor_produto, int quantidade){
			this.nome = nome;
			this.valor_produto = valor_produto;
			this.quantidade = quantidade;
		}
		
		void valor_Compra(){
			System.out.println("O valor total da compra do produto " + nome + " é de: R$" + String.format("%.2f", valor_produto * quantidade) + ".");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mercado produto1 = new Mercado("Tomate", 2.00, 5);
		produto1.valor_Compra();
		
		Mercado produto2 = new Mercado("Abacate", 4.20, 3);
		produto2.valor_Compra();
	}

}
