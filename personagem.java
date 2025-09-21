// 										Exercício: 6
//             			Resumo do programa
// O código deve criar um personagem que pode: sofrer danos, morrer, perder vida ou recuperar vida. A vida comeca em 100. Após cada .
// alteração da vida do personagem, precisa mostrar a vida do personagem

// 				Planejamento das classes
// classe: Personagem; Atributos: nome e pontos_vida; Metodos: sofrer_dano, perdendo_vida e recupara_vida;


package atividades;

public class personagem {
	static class Personagem{
		String nome;
		int pontos_vida = 100;
		
		Personagem(String nome){
			this.nome = nome;
			//this.pontos_vida = pontos_vida;
		}
		
		void sofrer_dano(int dano) {
			pontos_vida -= dano;
			if (pontos_vida < 1) {
				System.out.println("Game Over");
			}else {
				System.out.println("O " + nome + "sofreu " + dano + " danos na sua vida. Pontos de vida atual: " + pontos_vida + ".");
			}
		}
		
		void perdendo_vida(int vida_perdida) {
			for (int i = 0; i < 4; i++) {
				if (pontos_vida < 1) {
					System.out.println("Game Over");
				}else {
				pontos_vida -= vida_perdida;
				System.out.println("O personagem está perdendo " + vida_perdida + " pontos de vida. Vida atual: " + pontos_vida + ".");
				}
			}	
			
		}
		
		void recuperar_vida(int vida_recuperada) {
			pontos_vida += vida_recuperada;
			if (pontos_vida > 100) {
				pontos_vida = 100;
			}
			System.out.println(vida_recuperada + " pontos de vida recuperada. Vida atual: " + pontos_vida + ".");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personagem person1 = new Personagem("Arthur Morgan");
		person1.sofrer_dano(30);
		person1.perdendo_vida(3);
		person1.recuperar_vida(40);
		person1.recuperar_vida(30);
		person1.perdendo_vida(40);
		
		
		Personagem person2 = new Personagem("Jonh Marston");
		person2.sofrer_dano(22);
		person2.perdendo_vida(5);
		person2.recuperar_vida(40);
		person2.recuperar_vida(1);
		person2.perdendo_vida(3);
		person2.sofrer_dano(99);
	}

}
