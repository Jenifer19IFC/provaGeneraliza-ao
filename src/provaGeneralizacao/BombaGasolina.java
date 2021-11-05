package provaGeneralizacao;

public class BombaGasolina extends Bomba{
	
	private String tipo;
	
	public BombaGasolina(double quantidade, double preco, String tipo) {
		super(quantidade, preco);
		setTipo(tipo);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		if("normal".equals(tipo)  || "aditivada".equals(tipo))
			this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "BombaGasolina [tipo=" + tipo + ", toString()=" + super.toString() + "]";
	}
	
	
}
