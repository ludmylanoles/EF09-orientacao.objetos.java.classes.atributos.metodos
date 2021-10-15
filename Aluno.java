package questão5;

public class Aluno {
	private String nome;
	private String cpf;
	private double nota1;
	private double nota2;
	private double nota3;
	private double media;
	
	
	public Aluno(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
	
	public Aluno() {
	}

	public static void calcularMedia(double nota1, double nota2, double nota3) {
		double calcularMedia = (nota1 + nota2 + nota3)/3;}
	public double getCalcularMedia() {
		return getCalcularMedia();}
		
	
	public static void main(String[] args) {
		Aluno aluno1;
		aluno1 = new Aluno();
		
		aluno1.nome = "Fulano da Silva";
		aluno1.cpf = "123.456.789-01";
		aluno1.nota1 = 7.8;
		aluno1.nota2 = 6.5;
		aluno1.nota3 = 8.9;
		 
		calcularMedia(aluno1.nota1, aluno1.nota2, aluno1.nota3);
		
		
		
		System.out.println("Média: " + aluno1.getCalcularMedia());
		
		
		
		
	}

}
