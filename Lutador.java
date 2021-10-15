package questão3;

public class Lutador {
	private String nome;
	private int energia;
	private int forca;
	
	public Lutador(String nome, int energia, int forca) {
        this.nome = nome;
		this.energia = energia;
		this.forca = forca;
	}
	
	public Lutador() {
	
	}
	public void aplicarGolpe(String nome, int energia, int forca) {
		
	}
	
	public void reduzirEnergia(String nome, int energia, int forca) {
		energia = energia - forca;
	}
	
	public static void main(String[] args) {
		Lutador lutador1;
		lutador1 = new Lutador();
		Lutador lutador2;
		lutador2 = new Lutador();
		
		lutador1.nome = "Ryu";
		lutador1.energia = 100;
		lutador1.forca = 10;
		
		lutador2.nome = "Bison";
		lutador2.energia = 100;
		lutador2.forca = 12;
		
		int perca_energia_lutador1;
		int perca_energia_lutador2;
		
	    perca_energia_lutador2 = lutador1.energia - (lutador1.forca = 12 * 3);
		System.out.println("Energia de Bison após os golpes: " + perca_energia_lutador2);
		
		perca_energia_lutador1 = lutador2.energia - (lutador2.forca = 12 * 8);
		System.out.println("Energia de Ray após os golpes: " + perca_energia_lutador1);
	}
}
