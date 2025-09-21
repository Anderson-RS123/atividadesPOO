// 										Exercício: 2
//             			Resumo do programa
// O código deve registrar os carros que entram na garagem, mostrando as informações do carro.
// O carro possui: marca, modelo e ano.


// 				Planejamento das classes
// classe: Garagem; Atributos: marca, modelo e ano; Metodos: registrar;

package atividades;

public class garagem {
	static class Garagem {
		String marca, modelo;
		int ano;

		Garagem(String marca, String modelo, int ano){
			this.marca = marca;
			this.modelo = modelo;
			this.ano = ano;
		}
		
		void registrar() {
			System.out.println("O carro d marca " + marca + ", modelo " + modelo + " e do ano " + ano + " foi registrado com sucesso.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Garagem car1 = new Garagem("Fiat", "Uno", 1990);
		car1.registrar();
		
		Garagem car2 = new Garagem("WolksWagen", "Fusca", 1992);
		car2.registrar();
	}

}
