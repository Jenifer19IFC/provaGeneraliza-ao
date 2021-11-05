package provaGeneralizaçao;

public class Bomba {

	private double quantidade;
	private double preco;
	private double litrosVendidos;
	
	public Bomba(double quantidade, double preco) {
		setQuantidade(quantidade);
		setPreco(preco);
	}
	
	public double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(double quantidade) {
		if(quantidade >= 0)
			this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		if(preco >= 0)
			this.preco = preco;
	}
	public double getLitrosVendidos() {
		return litrosVendidos;
	}
	public void setLitrosVendidos(double litrosVendidos) {
		this.litrosVendidos = litrosVendidos;
	}
	
	double valorParaLitros(double valor) {
		return valor/preco;
	}
	
	public boolean abastecerPorLitro(double litros) {
		if(litros <= getQuantidade()) {
			setQuantidade(getQuantidade()-litros);	
			setLitrosVendidos(getLitrosVendidos() + litros);
			return true;
		}else
			return false;
	}

	public boolean abastecerPorValor(double valor){
		double valorLitros = valorParaLitros(valor);
		 return abastecerPorLitro(valorLitros);
	}
	
	public double faturamento() {
		return litrosVendidos * preco;
		
	}

	@Override
	public String toString() {
		return "Bomba [quantidade=" + quantidade + ", preco=" + preco + ", litrosVendidos=" + litrosVendidos + "]";
	}
	
	
	

	
	
	}

