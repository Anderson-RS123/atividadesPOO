package atividades;

abstract class Funcionario3{
	String nome, matricula;
	double salario_base = 2000.0;
	public Funcionario3(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
	
	public void mostrar_salario() {
		System.out.println("Salario do " + nome + " é de  R$" + calculaSalario());
	}
	public abstract double calculaSalario();
}

class Gerente3 extends Funcionario3{
	public Gerente3(String nome, String matricula) {
		super(nome, matricula);
	}
	@Override
	public double calculaSalario() {
		return salario_base * 2;
	}
}

class Assistente extends Funcionario3{
	public Assistente(String nome, String matricula) {
		super(nome, matricula);
	}
	@Override
	public double calculaSalario() {
		return salario_base;
	}
}

class Vendedor extends Funcionario3{
	double comissao = 1.5;
	
	public Vendedor(String nome, String matricula) {
		super(nome, matricula);
	}
	@Override
	public double calculaSalario() {
		return salario_base * comissao;
	}
}


public class Funcionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gerente3 g1 = new Gerente3("Anderson", "222");
		g1.mostrar_salario();
		
		Assistente a1 = new Assistente("Roberto", "333");
		a1.mostrar_salario();
		
		Vendedor v1 = new Vendedor("Julio", "331");
		v1.mostrar_salario();
		
	}

}
