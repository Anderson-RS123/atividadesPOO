package atividades;

class Pacote{
	String destino;
	int duracao;
	double preco;
	
	Pacote(String destino, int duracao, double preco){
		setDestino(destino);
		setDuracao(duracao);
		setPreco(preco);
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}

class Pacote_nacional extends Pacote{
	String estado_destino, transporte_utilizado;
	Pacote_nacional(String destino, int duracao, double preco, String estado_destino, String transporte_utilizado){
		super(destino, duracao, preco);
		setEstado_destino(estado_destino);
		setTransporte_utilizado(transporte_utilizado);
	}
	
	public String getEstado_destino() {
		return estado_destino;
	}
	public void setEstado_destino(String estado_destino) {
		this.estado_destino = estado_destino;
	}
	public String getTransporte_utilizado() {
		return transporte_utilizado;
	}
	public void setTransporte_utilizado(String transporte_utilizado) {
		this.transporte_utilizado = transporte_utilizado;
	}
}

class Pacote_internacional extends Pacote{
	String pais_destino;
	boolean precisa_visto = false;
	
	Pacote_internacional(String destino, int duracao, double preco, String pais_destino, boolean precisa_visto){
		super(destino, duracao, preco);
		setPais_destino(pais_destino);
		setPrecisa_visto(precisa_visto);
	}

	public String getPais_destino() {
		return pais_destino;
	}

	public void setPais_destino(String pais_destino) {
		this.pais_destino = pais_destino;
	}

	public boolean isPrecisa_visto() {
		return precisa_visto;
	}

	public void setPrecisa_visto(boolean precisa_visto) {
		this.precisa_visto = precisa_visto;
	}
}

class Pacote_aventura extends Pacote{
	String nivel_dificuldade;
	boolean equipamento_incluso;
	
	Pacote_aventura(String destino, int duracao, double preco, String nivel_dificuldade, boolean equipamento_incluso){
		super(destino, duracao, preco);
		setNivel_dificuldade(nivel_dificuldade);
		setEquipamento_incluso(equipamento_incluso);
	}

	public String getNivel_dificuldade() {
		return nivel_dificuldade;
	}

	public void setNivel_dificuldade(String nivel_dificuldade) {
		this.nivel_dificuldade = nivel_dificuldade;
	}

	public boolean isEquipamento_incluso() {
		return equipamento_incluso;
	}

	public void setEquipamento_incluso(boolean equipamento_incluso) {
		this.equipamento_incluso = equipamento_incluso;
	}
}

class Guia{
	String nome_guia, idioma_falado;
	int anos_experiencia;
	
	Guia(String nome_guia, String idioma_falado, int anos_experiencia){
		setNome_guia(nome_guia);
		setIdioma_falado(idioma_falado);
		setAnos_experiencia(anos_experiencia);
	}

	public String getNome_guia() {
		return nome_guia;
	}

	public void setNome_guia(String nome_guia) {
		this.nome_guia = nome_guia;
	}

	public String getIdioma_falado() {
		return idioma_falado;
	}

	public void setIdioma_falado(String idioma_falado) {
		this.idioma_falado = idioma_falado;
	}

	public int getAnos_experiencia() {
		return anos_experiencia;
	}

	public void setAnos_experiencia(int anos_experiencia) {
		this.anos_experiencia = anos_experiencia;
	}
}

class Viagem{
	Pacote nome_pacote;
	Guia nome_guia;
	
	Viagem(Pacote nome_pacote, Guia nome_guia){
		this.nome_pacote = nome_pacote;
		this.nome_guia = nome_guia;
	}

	
	void mostrar_viagem() {
		System.out.println("O pacote " + nome_pacote.getDestino() + " terá como guia a pessoa: " + nome_guia.getNome_guia());
	}
}

public class Agencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pacote_nacional pacote1 = new Pacote_nacional("Paraicaba", 3, 1200.00, "Para", "Onibus");
		Guia guia1 = new Guia("Roberta", "Portugues", 3);
		Viagem viagem1 = new Viagem(pacote1, guia1);
		viagem1.mostrar_viagem();
		
		Pacote_internacional pacote2 = new Pacote_internacional("Paris", 30, 19200.00, "Franca", true);
		Guia guia2 = new Guia("Bruna", "Frances", 5);
		Viagem viagem2 = new Viagem(pacote2, guia2);
		viagem2.mostrar_viagem();
		
		Pacote_aventura pacote3 = new Pacote_aventura("Everest", 30, 19200.00, "Dificil", true);
		Viagem viagem3 = new Viagem(pacote3, guia1);
		viagem3.mostrar_viagem();
	}

}
