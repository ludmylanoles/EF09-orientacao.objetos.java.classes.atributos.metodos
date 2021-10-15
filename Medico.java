package questão2;

public class Medico {
	private int codigo;
	private String nome;
	private String sexo;
	private String especialidade;
	private Endereco Endereco1;
	
	public Medico() {
		
	}

	public Medico(int codigo, String nome, String sexo, String especialidade, Endereco endereco) {
		this.codigo = codigo;
		this.nome = nome;
		this.sexo = sexo;
		this.especialidade = especialidade;
		this.Endereco1 = new Endereco();}
	
	public static void main(String[] args) {
		Medico Medico1;
		Medico1 = new Medico();
		Endereco Endereco1;
		Endereco1 = new Endereco();
		
		String retornarRua;
		int retornarNumero;
		String retornarComplmento;
		String retornarBairro;
		String retornarCidade;
		String retornarUf;
		String retornarCep;
		
		retornarRua = Endereco1.getRua();
		retornarNumero = Endereco1.getNumero();
		retornarComplmento = Endereco1.getComplemento();		
		retornarBairro = Endereco1.getBairro();
		retornarCidade = Endereco1.getCidade();
		retornarUf = Endereco1.getUf();
		retornarCep = Endereco1.getCep();
		
		Medico1.codigo = 2222;
		Medico1.nome = "Fulano";
		Medico1.sexo = "Masculino";
		Medico1.especialidade = "Cirugia Geral";
		
		System.out.println("Código: " + Medico1.codigo);
		System.out.println("Nome: " + Medico1.nome);
		System.out.println("Sexo: " + Medico1.sexo);
		System.out.println("Especialidade: " + Medico1.especialidade);
		System.out.println(" - Endereço - " );
		System.out.println("Rua: " + retornarRua);
		System.out.println("Numero: " + retornarNumero);
		System.out.println("Complemento: " + retornarComplmento);
		System.out.println("Bairro: " + retornarBairro);
		System.out.println("Cidade: " + retornarCidade);
		System.out.println("UF: " + retornarUf);
		System.out.println("CEP: " + retornarCep);
	}
}
