package questão2;

public class Endereco {
	private String rua;
	private int numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String uf;
	private String cep;
	
	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}
	
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
		
	public static void main(String[] args) {
		Endereco Endereco1;
		Endereco1 = new Endereco();
		
		Endereco1.rua = "Rua Tiradentes";
		Endereco1.numero = 234;
		Endereco1.complemento = "apt. 234";
		Endereco1.bairro = "Centro";
		Endereco1.cidade = "Euclides da Cunha";
		Endereco1.uf = "BA";
		Endereco1.cep = "48500-000";
		
		System.out.println(" - Endereco - " );
		System.out.println("Rua: " + Endereco1.rua);
		System.out.println("Número: " + Endereco1.numero);
		System.out.println("Complemento: " + Endereco1.complemento);
		System.out.println("Bairro: " + Endereco1.bairro);
		System.out.println("Cidade: " + Endereco1.cidade);
		System.out.println("UF: " + Endereco1.uf);
		System.out.println("CEP: " + Endereco1.cep);
	}
}