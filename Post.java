package questão4;

import questão3.Lutador;

public class Post {
	private String texto;
	private String link;
	private int numeroCurtidas;
	private int numeroCompartilhamentos;
	
	public Post(String texto, String link) {
		this.texto = texto;
		this.link = link;
	}
	
    public Post() {
	}

	public void curtir(int numeroCurtidas) {
		this.numeroCurtidas = numeroCurtidas +1;}
	public int getNumeroCurtidas() {
		return numeroCurtidas;}
	
    public void compartilhar(int numeroCompartilhamentos) {
    	this.numeroCompartilhamentos = numeroCompartilhamentos + 1;}
    public int getNumeroCompartilhamentos() {
		return numeroCompartilhamentos;}
    
	public static void main(String[] args) {
		Post post1;
		post1 = new Post();
		
		post1.texto = "Não há post";
		post1.link = "https://youtu.be/RDDPpz1GS40";
		post1.getNumeroCurtidas();
		System.out.println("Número de curtidas: " + (post1.getNumeroCurtidas() + 3));
		post1.getNumeroCompartilhamentos();
		System.out.println("Número de compartilhamentos: " + (post1.getNumeroCompartilhamentos() + 2));
		
	}

}
