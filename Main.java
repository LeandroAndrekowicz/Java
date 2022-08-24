
public class Main {

	public static void main(String[] args) {
		/* CLASSE FUNCIONARIO*/
		Funcionario funcionario[] = new Funcionario[4];
		funcionario[0] = new Funcionario("Marcelo da silva","Operador de caixa",1290);
		funcionario[1] = new Funcionario("Ana Maria","Repositora de loja",2000);
		funcionario[2] = new Funcionario("Carlos Alberto","Gerente de loja",3600);
		funcionario[3] = new Funcionario("Amanda Padilha","Atendente de Padaria",1490);
		
		utilitarioFuncionario uf = new utilitarioFuncionario();
		uf.imprimirFuncionarios(funcionario);
		uf.somarSalarios(funcionario);
		
		System.out.println("\n\n");
		/* CLASSE VEICULO*/
		Veiculo veiculo[] = new Veiculo[4];
		veiculo[0] = new Veiculo("CRUZE SPORT6 RS", 154000);
		veiculo[1] = new Veiculo("HONDA CIVIC", 90000);
		veiculo[2] = new Veiculo("FIAT PALIO",14000);
		veiculo[3] = new Veiculo("FORD KA", 20000);
		
		utilitarioVeiculo uv = new utilitarioVeiculo();
		uv.imprimirVeiculos(veiculo);
		uv.somarPrecos(veiculo);
	}

}
