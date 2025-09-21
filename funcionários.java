// 										Exercício: 8
//             Resumo do programa
// O código deve registrar gerentes e vendedores, através de uma classe mãe Funcionarios, e mostrar 
//   as informações dos funcionarios criados quando for solicitado


// 				Planejamento das classes
// classe mãe: Funcionários; Atributos: nome e salario; Metodos: registrar os funcionarios;
// subclasse : Gerente; Atributos: setor; Metodos: exibir informacao do gerente;
// subclasse : Vendedor; Atributos: comissao; Metodos: exibir informacao do vendedor;


package atividades;

class Funcionario{
	String nome;
	double salario;
	
	Funcionario(String nome, double salario){
		this.nome = nome;
		this.salario = salario;
	}
	
	void registrar() {
		System.out.println("O funcionário " + nome + " foi registrado com sucesso, com seu salario de R$" + salario);
	}
}

class Gerente extends Funcionario{
	String setor;
	
	Gerente(String nome, String setor, Double salario){
		super(nome, salario);
		this.setor = setor;
	}
	
	void mostrar_info_gerente() {
		System.out.println("O gerente " + nome + ", trabalha no setor " + setor + " e recebe um salario de R$" + salario);
	}
}


class Vendedor extends Funcionario{
	Double comissao;
	
	Vendedor(String nome, double salario, double comissao){
		super(nome, salario);
		this.comissao = comissao;
	}
	
	void mostrar_info_vendedor() {
		System.out.println("O vendedor " + nome + ", possui um salario de R$" + salario + " e recebe R$" + comissao + " de comissao por venda.");
	}
}


public class funcionários {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente funcionario1 = new Gerente("Anderson", "TI", 20000.00);
		funcionario1.mostrar_info_gerente();
		
		Vendedor funcionario2 = new Vendedor("Bruno", 7000.00, 1300.00);
		funcionario2.mostrar_info_vendedor();
	}

}
