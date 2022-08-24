
public class utilitarioVeiculo {
	public void imprimirVeiculos(Veiculo[] veiculo) {
		for(int i = 0; i < veiculo.length; i++) {
			if(veiculo[i] != null) {
				System.out.println("|Marca: "+veiculo[i].getMarca()+"| Cargo: "+veiculo[i].getPreco());
			}
		}
	}
	public void somarPrecos(Veiculo[] veiculo) {
		double totalPrecos = 0;
		for (int i = 0; i<veiculo.length; i++) {
			if(veiculo[i] != null) {
				totalPrecos = totalPrecos + veiculo[i].getPreco();
			}
		}
		System.out.println("A soma de todos os preços eh: "+totalPrecos);
	}
}
