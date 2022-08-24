
public class Veiculo {
	private String marca;
	private double preco;
	
	public Veiculo(String marca, double preço) {
		this.marca = marca;
		this.preco = preço;
	}
	public void ligar() {
		System.out.println("Ligando veiculo!!!");
	}
	public void desligar() {
		System.out.println("Desligando veiculo!!!");
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
