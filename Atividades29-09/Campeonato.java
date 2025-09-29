package atividades;

class Time{
	String nome_time, instituicao_origem;
	int numero_jogadores;
	
	Time(String nome_time, String instituicao_origem, int numero_jogadores){
		setNome_time(nome_time);
		setInstituicao_origem(instituicao_origem);
		setNumero_jogadores(numero_jogadores);
	}

	public String getNome_time() {
		return nome_time;
	}

	public void setNome_time(String nome) {
		this.nome_time = nome;
	}

	public String getInstituicao_origem() {
		return instituicao_origem;
	}

	public void setInstituicao_origem(String instituicao_origem) {
		this.instituicao_origem = instituicao_origem;
	}

	public int getNumero_jogadores() {
		return numero_jogadores;
	}

	public void setNumero_jogadores(int numero_jogadores) {
		this.numero_jogadores = numero_jogadores;
	}
}

class Futebol extends Time{
	String nome_tecnico;
	int nr_jogadores_reservas;
	Futebol(String nome_time, String instituicao_origem, int numero_jogadores, String nome_tecnico, int nr_jogadores_reservas){
		super(nome_time, instituicao_origem, numero_jogadores);
		setNome_tecnico(nome_tecnico);
		setNr_jogadores_reservas(nr_jogadores_reservas);
	}
	
	public String getNome_tecnico() {
		return nome_tecnico;
	}
	public void setNome_tecnico(String nome_tecnico) {
		this.nome_tecnico = nome_tecnico;
	}
	public int getNr_jogadores_reservas() {
		return nr_jogadores_reservas;
	}
	public void setNr_jogadores_reservas(int nr_jogadores_reservas) {
		this.nr_jogadores_reservas = nr_jogadores_reservas;
	}
}


class Volei extends Time{
	double altura_media;
	int qtd_sets_jogados;
	
	Volei(String nome_time, String instituicao_origem, int numero_jogadores, double altura_media, int qtd_sets_jogados){
		super(nome_time, instituicao_origem, numero_jogadores);
		setAltura_media(altura_media);
		setQtd_sets_jogados(qtd_sets_jogados);
	}

	public double getAltura_media() {
		return altura_media;
	}

	public void setAltura_media(double altura_media) {
		this.altura_media = altura_media;
	}

	public int getQtd_sets_jogados() {
		return qtd_sets_jogados;
	}

	public void setQtd_sets_jogados(int qtd_sets_jogados) {
		this.qtd_sets_jogados = qtd_sets_jogados;
	}
}

class Basquete extends Time{
	double altura_media_jogadores;
	String capitao_time;
	
	Basquete(String nome_time, String instituicao_origem, int numero_jogadores, double altura_media_jogadores, String capitao_time){
		super(nome_time, instituicao_origem, numero_jogadores);
		setAltura_media_jogadores(altura_media_jogadores);
		setCapitao_time(capitao_time);	
	}

	public double getAltura_media_jogadores() {
		return altura_media_jogadores;
	}

	public void setAltura_media_jogadores(double altura_media_jogadores) {
		this.altura_media_jogadores = altura_media_jogadores;
	}

	public String getCapitao_time() {
		return capitao_time;
	}

	public void setCapitao_time(String capitao_time) {
		this.capitao_time = capitao_time;
	}	
}

class Arbitro{
	String nome, modalidade;
	int anos_experiencia;
	
	Arbitro(String nome, String modalidade, int anos_experiencia){
		setNome(nome);
		setModalidade(modalidade);
		setAnos_experiencia(anos_experiencia);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public int getAnos_experiencia() {
		return anos_experiencia;
	}

	public void setAnos_experiencia(int anos_experiencia) {
		this.anos_experiencia = anos_experiencia;
	}
}

class Partida{
	private Time time1, time2;
	private Arbitro nome;
	String resultado_final;
	
	Partida(Time time1, Time time2, Arbitro nome, String resultado_final){
		setResultado_final(resultado_final);
		this.time1 = time1;
		this.time2 = time2;
		this.nome = nome;
	}

	public String getResultado_final() {
		return resultado_final;
	}

	public void setResultado_final(String resultado_final) {
		this.resultado_final = resultado_final;
	}	
	
	public Time getNome_time() {
		return time1;
	}


	public Arbitro getNome() {
		return nome;
	}

	public void mostrar_resultado_partida() {
		System.out.println("Partida entre: " + time1.getNome_time() + " vs " + time2.getNome_time() + ", terminou com o resultado: " + resultado_final + " com o arbitro: " + nome.getNome());
	}
}


public class Campeonato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Futebol sistemas = new Futebol("AASIAM", "AMF", 11, "Anderson", 8);
		Futebol direito = new Futebol("AADIAM", "AMF", 11, "Bruno", 6);
		Arbitro juiz1 = new Arbitro("Leonam", "Futebol", 10);
		Partida jogo1 = new Partida(sistemas, direito, juiz1, "Sistemas vencedor!");
		jogo1.mostrar_resultado_partida();
		
		Volei adm = new Volei("ADM", "AMF", 11, 1.89, 3);
		Volei pedagogia = new Volei("Pedagogia", "AMF", 10, 1.89, 6);
		Arbitro juiz2 = new Arbitro("Maiara", "Volei", 2);
		Partida jogo2 = new Partida(adm, pedagogia, juiz2, "ADM vencedor!");
		jogo2.mostrar_resultado_partida();
		
		Basquete contabeis = new Basquete("contabeis", "AMF", 12, 1.74, "Junior");
		Basquete onto = new Basquete("onto", "AMF", 9, 1.99, "Maisa");
		Arbitro juiz3 = new Arbitro("Matheus", "Basquete", 6);
		Partida jogo3 = new Partida(contabeis, onto, juiz3, "onto vencedor!");
		jogo3.mostrar_resultado_partida();
	}
}
