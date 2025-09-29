package atividades;

class Obra{
	String titulo, autor;
	int ano_publicacao;
	
	Obra(String titulo, String autor, int ano_publicacao){
		setTitulo(titulo);
		setAutor(autor);
		setAno_publicacao(ano_publicacao);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAno_publicacao() {
		return ano_publicacao;
	}

	public void setAno_publicacao(int ano_publicacao) {
		this.ano_publicacao = ano_publicacao;
	}
}

class Livro extends Obra{
	int nr_paginas;
	String genero;
	
	Livro(String titulo, String autor, int ano_publicacao, int nr_paginas, String genero){
		super(titulo, autor, ano_publicacao);
		setNr_paginas(nr_paginas);
		setGenero(genero);
	}

	public int getNr_paginas() {
		return nr_paginas;
	}

	public void setNr_paginas(int nr_paginas) {
		this.nr_paginas = nr_paginas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String area) {
		this.genero = area;
	}
}

class Revista extends Obra{
	int edicao;
	String area;
	
	Revista(String titulo, String autor, int ano_publicacao, int edicao, String area){
		super(titulo, autor, ano_publicacao);
		setEdicao(edicao);
		setArea(area);
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
}

class Artigo extends Obra{
	String jornal_publicado;
	int doi;
	
	Artigo(String titulo, String autor, int ano_publicacao, String jornal_publicado, int doi){
		super(titulo, autor, ano_publicacao);
		setJornal_publicado(jornal_publicado);
		setDoi(doi);
	}

	public String getJornal_publicado() {
		return jornal_publicado;
	}

	public void setJornal_publicado(String jornal_publicado) {
		this.jornal_publicado = jornal_publicado;
	}

	public int getDoi() {
		return doi;
	}

	public void setDoi(int doi) {
		this.doi = doi;
	}	
}

class Usuario{
	String nome_usuario, curso;
	int matricula;
	
	Usuario(String nome_usuario, String curso, int matricula){
		setNome_usuario(nome_usuario);
		setCurso(curso);
		setMatricula(matricula);
	}

	public String getNome_usuario() {
		return nome_usuario;
	}

	public void setNome_usuario(String nome_usuario) {
		this.nome_usuario = nome_usuario;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}	
}


class Emprestimo{
	Obra titulo;
	Usuario nome_usuario;
	String data_emprestimo, data_devolucao;
	
	Emprestimo(Obra titulo, Usuario nome_usuario, String data_emprestimo, String data_devolucao){
		this.titulo = titulo;
		this.nome_usuario = nome_usuario;
		setData_emprestimo(data_emprestimo);
		setData_devolucao(data_devolucao);
	}

	public String getData_emprestimo() {
		return data_emprestimo;
	}

	public void setData_emprestimo(String data_emprestimo) {
		this.data_emprestimo = data_emprestimo;
	}

	public String getData_devolucao() {
		return data_devolucao;
	}

	public void setData_devolucao(String data_devolucao) {
		this.data_devolucao = data_devolucao;
	}
	
	void obra_emprestada() {
		System.out.println("A obra " + titulo.getTitulo() + " foi emprestado ao usuario " + nome_usuario.getNome_usuario() + " no dia " + data_emprestimo + " e tera que devolver em " + data_devolucao);  
	}
	
}




public class Biblioteca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Livro obra1 = new Livro("A espera de um fantasma", "Ze Manela", 2025, 134, "Terror");
		Usuario usuario1 = new Usuario("Anderson", "Sistemas", 1029383);
		Emprestimo emprestimo1 = new Emprestimo(obra1, usuario1, "27-09-2025", "29-09-2025");
		emprestimo1.obra_emprestada();
		
		Revista obra2 = new Revista("Caçador de animais", "Fabricio", 1990, 2, "Biologia");
		Usuario usuario2 = new Usuario("Joelma", "ADM", 102933);
		Emprestimo emprestimo2 = new Emprestimo(obra2, usuario2, "24-09-2025", "31-09-2025");
		emprestimo2.obra_emprestada();
		
		Artigo obra3 = new Artigo("Hábitos Alimentares", "Patricia Poeta", 432, "Zero Hora", 24294873);
		Usuario usuario3 = new Usuario("Jadson", "Direito", 134243);
		Emprestimo emprestimo3 = new Emprestimo(obra3, usuario3, "03-09-2025", "30-09-2025");
		emprestimo3.obra_emprestada();
	
	}

}
