package ClassesEObjetos;

public class Cliente {

	String nome;
	String sobrenome;
	String cpf;
	int idade=23;

	
	public Cliente(String x, String y, String z)
	{
		this.nome=x;
		this.sobrenome=y;
		this.cpf=z;
		
	}
				
	public void total() 
	{
	System.out.println("Nome" + this.nome);
	System.out.println("Sobrenome" + this.sobrenome);
	System.out.println("CPF" + this.cpf);
	System.out.println("idade" + this.idade);
	}
	
	
	
}