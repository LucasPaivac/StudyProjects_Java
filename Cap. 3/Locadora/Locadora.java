class Filme 
{
	int codigo;
	String nome;
	double valor;
	boolean disponibilidade;

	void retirar ()
	{
		disponibilidade = false;
	}

	void devolver ()
	{
		disponibilidade = true;
	}
}



class Programa 
{
	public static void main(String[] args) 
	{
		Filme filme = new Filme ();
		filme.codigo = 123;
		filme.nome = "A era do gelo";
		filme.valor = 2.50;
		filme.retirar();

		//System.out.println (filme);
		//System.out.println (filme.codigo);
		//System.out.println (filme.nome);
		//System.out.println (filme.valor);
		if (filme.disponibilidade == true) 
		{
			System.out.println ("Filme" + filme.codigo + "disponível");	
		}
		else
		{
			System.out.println ("Filme" + filme.codigo + " indisponível");
		}

		filme.devolver();

		if (filme.disponibilidade == true) 
		{
			System.out.println ("Filme" + filme.codigo + "disponível");	
		}
		else
		{
			System.out.println ("Filme" + filme.codigo + " indisponível");
		}
		
		/*System.out.println (filme2);
		System.out.println (filme2.codigo);
		System.out.println (filme2.nome);
		System.out.println (filme2.valor);
		if (filme2.disponibilidade == true) 
		{
			System.out.println ("Filme" + filme2.codigo + "disponível");	
		}
		else
		{
			System.out.println ("Filme" + filme2.codigo + "indisponível");
		}*/
	}
}