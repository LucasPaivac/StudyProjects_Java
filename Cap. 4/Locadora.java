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
		
		Filme filme2 = new Filme ();
		filme2.codigo = 1234;
		filme2.nome = "A era do gelo 2";
		filme2.valor = 2.50;

		Filme filme3 = new Filme ();
		filme3.codigo = 12345;
		filme3.nome = "A era do gelo 3";
		filme3.valor = 2.50;

		Filme filme4 = new Filme ();
		filme4.codigo = 123456;
		filme4.nome = "Velozes e Furiosos";
		filme4.valor = 2.50;
		
		Filme filme5 = new Filme ();
		filme5.codigo = 1234567;
		filme5.nome = "Batman";
		filme5.valor = 2.50;

		Filme filmes [] = new Filme [5];
		filmes[0] = filme;
		filmes[1] = filme2;
		filmes[2] = filme3;
		filmes[3] = filme4;
		filmes[4] = filme5;

		for (Filme film : filmes )
		{
			System.out.println (film);
			System.out.println (film.codigo);
			System.out.println (film.nome);
			System.out.println (film.valor);
		}
	}
}