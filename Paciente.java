package questão1;

public class Paciente {

	private int codigo;
	private String nome;
    private String dataNascimento;
    private String sexo;
    private String planoSaude;
    private String alergia;
    private String tipoSanguineo;

	public Paciente() {
		
	}
	public static void main(String[] args) {
	 Paciente Paciente1;
     Paciente1 = new Paciente();
  
     Paciente1.codigo = 1010;
	 Paciente1.nome = "Ludmyla";
     Paciente1.dataNascimento = "10/01/2004";
     Paciente1.sexo = "Feminino";
     Paciente1.planoSaude = "Plano 1";
     Paciente1.alergia = "Não tem";
     Paciente1.tipoSanguineo = "A+";
	
	 
	System.out.println("Código:  " + Paciente1.codigo);
	System.out.println("Nome: " + Paciente1.nome);
	System.out.println("Data de nascimento: " + Paciente1.dataNascimento);
	System.out.println("Sexo: " + Paciente1.sexo);
	System.out.println("Plano de saúde: " + Paciente1.planoSaude);
	System.out.println("Alergia: " + Paciente1.alergia);
	System.out.println("Tipo sanguíneo: " + Paciente1.tipoSanguineo);

}
}
