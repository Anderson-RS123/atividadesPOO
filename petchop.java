// 										Exercício: 1
//             			Resumo do programa
// O código deve cadastrar um cachorro para um petchop, e mostrar as suas informações.
// Cada cachorro possui: nome, raça e idade.

// 				Planejamento das classes
// classe: Petchop; Atributos: raca, nome e idade; Metodos: cadastrar;

package atividades;

public class petchop {
	static class Petchop{
		String raca, nome;
		int idade;
	
		Petchop(String raca, String nome, int idade){
			this.idade = idade;
			this.raca = raca;
			this.nome = nome;
		}
		
		void cadastrar() {
			System.out.println("Animal " + nome + " da raca " + raca + " com a idade de " + idade + " ano(s) cadastrado com sucesso.");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Petchop animal1 = new Petchop("Vira Lata", "Kilo", 10);
		animal1.cadastrar();
		
		Petchop animal2 = new Petchop("Pastor Alemao", "Biden", 3);
		animal2.cadastrar();
	}
}
