package atividades;

class Projeto {
	String nome_projeto, nome_responsavel, instituicao_origem;
	int espaco_feira;

	Projeto(String nome_projeto, String nome_responsavel, String instituicao_origem, int espaco_feira) {
		setNome_projeto(nome_projeto);
		setNome_responsavel(nome_responsavel);
		setInstituicao_origem(instituicao_origem);
		setEspaco_feira(espaco_feira);
	}

	public String getNome_projeto() {
		return nome_projeto;
	}

	public void setNome_projeto(String nome_projeto) {
		this.nome_projeto = nome_projeto;
	}

	public String getNome_responsavel() {
		return nome_responsavel;
	}

	public void setNome_responsavel(String nome_responsavel) {
		this.nome_responsavel = nome_responsavel;
	}

	public String getInstituicao_origem() {
		return instituicao_origem;
	}

	public void setInstituicao_origem(String instituicao_origem) {
		this.instituicao_origem = instituicao_origem;
	}

	public int getEspaco_feira() {
		return espaco_feira;
	}

	public void setEspaco_feira(int espaco_feira) {
		this.espaco_feira = espaco_feira;
	}
}

class Robotica extends Projeto {
	int qtd_sensores;
	String hardware_utilizado, software_utilizado, linguagem_programacao;

	Robotica(String nome_projeto, String nome_responsavel, String instituicao_origem, int espaco_feira,
			String hardware_utilizado, String software_utilizado, String linguagem_programacao, int qtd_sensores) {
		super(nome_projeto, nome_responsavel, instituicao_origem, espaco_feira);
		setQtd_sensores(qtd_sensores);
		setHardware_utilizado(hardware_utilizado);
		setSoftware_utilizado(software_utilizado);
		setLinguagem_programacao(linguagem_programacao);
	}

	public int getQtd_sensores() {
		return qtd_sensores;
	}

	public void setQtd_sensores(int qtd_sensores) {
		this.qtd_sensores = qtd_sensores;
	}

	public String getHardware_utilizado() {
		return hardware_utilizado;
	}

	public void setHardware_utilizado(String hardware_utilizado) {
		this.hardware_utilizado = hardware_utilizado;
	}

	public String getSoftware_utilizado() {
		return software_utilizado;
	}

	public void setSoftware_utilizado(String software_utilizado) {
		this.software_utilizado = software_utilizado;
	}

	public String getLinguagem_programacao() {
		return linguagem_programacao;
	}

	public void setLinguagem_programacao(String linguagem_programacao) {
		this.linguagem_programacao = linguagem_programacao;
	}

}

class Software extends Projeto {
	String linguagem_principal, plataforma_desenvolvimento, framework_utilizado;

	Software(String nome_projeto, String nome_responsavel, String instituicao_origem, int espaco_feira,
			String linguagem_principal, String plataforma_desenvolvimento, String framework_utilizado) {
		super(nome_projeto, nome_responsavel, instituicao_origem, espaco_feira);
		setLinguagem_principal(linguagem_principal);
		setPlataforma_desenvolvimento(plataforma_desenvolvimento);
		setFramework_utilizado(framework_utilizado);
	}

	public String getLinguagem_principal() {
		return linguagem_principal;
	}

	public void setLinguagem_principal(String linguagem_principal) {
		this.linguagem_principal = linguagem_principal;
	}

	public String getPlataforma_desenvolvimento() {
		return plataforma_desenvolvimento;
	}

	public void setPlataforma_desenvolvimento(String plataforma_desenvolvimento) {
		this.plataforma_desenvolvimento = plataforma_desenvolvimento;
	}

	public String getFramework_utilizado() {
		return framework_utilizado;
	}

	public void setFramework_utilizado(String framework_utilizado) {
		this.framework_utilizado = framework_utilizado;
	}
}

class Ciencias extends Projeto {
	String tema_pesquisa, origem_pesquisa, area_cientifica;

	Ciencias(String nome_projeto, String nome_responsavel, String instituicao_origem, int espaco_feira,
			String tema_pesquisa, String origem_pesquisa, String area_cientifica) {
		super(nome_projeto, nome_responsavel, instituicao_origem, espaco_feira);
		setTema_pesquisa(tema_pesquisa);
		setOrigem_pesquisa(origem_pesquisa);
		setArea_cientifica(area_cientifica);
	}

	public String getTema_pesquisa() {
		return tema_pesquisa;
	}

	public void setTema_pesquisa(String tema_pesquisa) {
		this.tema_pesquisa = tema_pesquisa;
	}

	public String getOrigem_pesquisa() {
		return origem_pesquisa;
	}

	public void setOrigem_pesquisa(String origem_pesquisa) {
		this.origem_pesquisa = origem_pesquisa;
	}

	public String getArea_cientifica() {
		return area_cientifica;
	}

	public void setArea_cientifica(String area_cientifica) {
		this.area_cientifica = area_cientifica;
	}

}

class Avaliador {
	String nome, especialidade;

	Avaliador(String nome, String especialidade) {
		setNome(nome);
		setEspecialidade(especialidade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

}

// associacao
class Avaliacao {
	private Projeto nome_projeto;
	private Avaliador nome;
	int nota;

	Avaliacao(Projeto projeto, Avaliador nome, int nota) {
		setNota(nota);
		this.nome = nome;
		this.nome_projeto = projeto;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public Projeto getNome_projeto() {
		return nome_projeto;
	}

	public Avaliador getNome() {
		return nome;
	}
	
	public void mostrarNota() {
        System.out.println("Projeto: " + nome_projeto.getNome_projeto());
        System.out.println("Avaliador: " + nome.getNome());
        System.out.println("Nota atribuída: " + nota);
    }
}

public class Feira {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robotica robo = new Robotica("Braço Robótico", "Ana", "Escola X", 10, "Arduino", "IDE Arduino", "C++", 4);
		Software app = new Software("App Saúde", "Carlos", "Univ Y", 8, "Java", "Mobile", "Spring");

// Criando avaliadores
		Avaliador avaliador1 = new Avaliador("João", "Robótica");
		Avaliador avaliador2 = new Avaliador("Maria", "Software");

// Fazendo avaliações (associação)
		Avaliacao av1 = new Avaliacao(robo, avaliador1, 9);
		Avaliacao av2 = new Avaliacao(app, avaliador2, 8);

// mostrando as notas
		av1.mostrarNota();
		av2.mostrarNota();
		
	}

}
