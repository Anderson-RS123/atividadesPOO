// 										Exercício: 4
//             			Resumo do programa
// O código deve registrar alunos calcular a media de 2 notas dos alunos, e mostrar se o aluno estiver aprovado com uma média >= 7,
// ou mostrar que o aluno está reprovado com uma nota < 7.
// 				Planejamento das classes
// classe: Aluno; Atributos: nome, nota1, nota2 e media; Metodos: registrar e calcular_media;

package atividades;

public class aluno {
	static class Aluno{
		String nome;
		double nota1, nota2, media;
		
		Aluno(String nome, double nota1, double nota2){
			this.nome = nome;
			this.nota1 = nota1;
			this.nota2 = nota2;
	}
		
		void registrar(){
			System.out.println("O aluno " + nome + " está cadastrado com sucesso.");
		}
		
		void calcular_media() {
			media = (nota1 + nota2) / 2;
			if (media >= 7){
				System.out.println("O aluno " + nome + " está aprovado com uma nota média de " + media + " pontos.");
			} else {
				System.out.println("O aluno " + nome + " foi reprovado com uma nota média de " + media + " pontos.");
			}
			
		}
		
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno aluno1 = new Aluno("Anderson", 9, 10);
		aluno1.registrar();
		aluno1.calcular_media();
		
		Aluno aluno2 = new Aluno("Leonam", 3, 8);
		aluno2.registrar();
		aluno2.calcular_media();
	}

}
