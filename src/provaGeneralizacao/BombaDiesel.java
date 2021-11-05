package provaGeneralizacao;

public class BombaDiesel extends Bomba {
	
	private  String tipo;

	public BombaDiesel(double quantidade, double preco, String tipo) {
		super(quantidade, preco);
		setTipo(tipo);
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		if("S10".equals(tipo) || "S50".equals(tipo) || "S500".equals(tipo) || "S1800".equals(tipo))
			this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "BombaDiesel [tipo=" + tipo + ", toString()=" + super.toString() + "]";
	}

	
	
	

}
