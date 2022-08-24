
public class Funcionario {
	private String nome;
	private String cargo;
	private double salario;
	
	public Funcionario(String cargo, String nome, double salario) {
		this.cargo = cargo;
		this.nome = nome;
		this.salario = salario;
	}
	public void demitir(String nome) {
		System.out.println("Funcionario: "+nome+" Está demitido!");
	}
	public void bonificacao(String nome) {
		System.out.println("Funcionario: "+nome+" Recebeu uma bonificação!");
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
