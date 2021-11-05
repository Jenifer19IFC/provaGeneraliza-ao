package provaGeneralizaçao;

public class BombaEtanol extends Bomba{
	
	private String fonte;
	
	public BombaEtanol(double quantidade, double preco, String fonte) {
		super(quantidade, preco);
		setFonte(fonte);
	}

	public String getFonte() {
		return fonte;
	}

	public void setFonte(String fonte) {
		if("cana-de-açucar".equals(fonte) || "milho".equals(fonte) )
			this.fonte = fonte;
	}

	@Override
	public String toString() {
		return "BombaEtanol [fonte=" + fonte + ", toString()=" + super.toString() + "]";
	}
	
	

}
