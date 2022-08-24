
public class utilitarioFuncionario {
	public void imprimirFuncionarios(Funcionario[] funcionario) {
		for(int i = 0; i < funcionario.length; i++) {
			if(funcionario[i] != null) {
				System.out.println("|Nome: "+funcionario[i].getNome()+"| Cargo: "+funcionario[i].getCargo()+"| Salario: "+funcionario[i].getSalario());
			}
		}
	}
	public void somarSalarios(Funcionario[] funcionario) {
		double totalSalarios = 0;
		for (int i = 0; i<funcionario.length; i++) {
			if(funcionario[i] != null) {
				totalSalarios = totalSalarios + funcionario[i].getSalario();
			}
		}
		System.out.println("A soma de todos saldos eh: "+totalSalarios);
	}
}
