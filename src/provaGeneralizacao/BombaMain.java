package provaGeneralizacao;

public class BombaMain {

	public static void main(String[] args) {
		
		Bomba b =  new Bomba (100, 6 );
		System.out.println(b.valorParaLitros(50));
		System.out.println(b.abastecerPorLitro(50));
		System.out.println(b.abastecerPorValor(6));
		System.out.println(b);
		
		BombaDiesel bd = new BombaDiesel(100, 6, "S10");
		System.out.println(bd);
		
		BombaGasolina bg = new BombaGasolina(100, 6, "normal");
		System.out.println(bg);
		
		BombaEtanol be = new BombaEtanol(100, 6, "milho");
		System.out.println(be);
	}

}
