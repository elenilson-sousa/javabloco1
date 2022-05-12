package Herança;

public class Bichos {

	public static void main(String[] args) {
		
		Animal An = new Animal();
		Cachorro ca = new Cachorro();
		Cavalo c = new Cavalo();
		Preguiça preg = new Preguiça();
		
		
		ca.nome = " Amora ";
        ca.idade = " 2 ";
		ca.som = " Late ";
		ca.correr = "Corre";
		
		c.nome = " Trovao";
		c.idade = " 25 ";
		c.som = "Relinchar";
		c.correr = "Corre";		

		preg.nome = " Jubileia ";
		preg.idade = " 60 ";
		preg.som = "Sabe la Deus ";
		preg.sobe = "vai dormir";
		
		
		System.out.println("Cachorro: " + "/" + ca.nome + "/" + ca.idade + "/" + ca.som + "/" + ca.correr);
		System.out.println("Cavalo: " + "/" + c.nome + "/" + c.idade + "/" + c.som + "/" + c.correr);
		System.out.println("Preguiça: " + "/" + preg.nome + "/" + preg.idade + "/" + preg.som + "/" + preg.sobe);
	}
	

}
