package ClassesEObjetos;

public class ProdutoEletronico {

	double tamanho;
	String cor;
	String marca;
	int bateria;
	
	
	public ProdutoEletronico(String a , String b)
	{
		this.marca=a;
		this.cor=b;
		this.tamanho=5.5;
		this.bateria=100;
}
	public void descriçao ()
	{
		System.out.println("Aparelho da marca" + this.marca);
		System.out.println("Aparelho da cor" + this.cor);
		System.out.println("Aparelho tem a tela de" + this.tamanho + "polegadas");
		System.out.println("Esta com " + this.bateria + "%de bateria");
}
	public void fim() {
		// TODO Auto-generated method stub
		
	}
}