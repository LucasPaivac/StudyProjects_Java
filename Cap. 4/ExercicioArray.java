class Empresa 
{
	String razaoSocial;
	String cnpj;
	Funcionario funcionarios [];

	void adicionaFuncionario (Funcionario funcionario)
	{
		for (int i = 0; i < funcionarios.length; i++)
		{
			if (funcionarios[i] == null)
			{
				funcionarios[i] = funcionario;
				break;
			}
			
		}

	}

}

class Funcionario
{
	String nome;
	String departamento;
	double salario;
	String dataDeEntrada;
	String rg;
	boolean estaNaEmpresa;

}

class Programa 
{
	public static void main(String[] args) 
	{
		Empresa empresa = new Empresa();
		empresa.razaoSocial = "CedroGames";
		empresa.cnpj = "123.456.789/000";
		empresa.funcionarios = new Funcionario[5];

		Funcionario funcionario1 = new Funcionario ();
		funcionario1.nome = "Lucas";
		funcionario1.departamento = "DOV";
		funcionario1.salario = 1000;
		funcionario1.dataDeEntrada = "21/09/2012";
		funcionario1.rg = "12.345.678-9";
		funcionario1.estaNaEmpresa = true;
		empresa.adicionaFuncionario(funcionario1);

		Funcionario funcionario2 = new Funcionario ();
		funcionario2.nome = "Chris";
		funcionario2.departamento = "DOV";
		funcionario2.salario = 1500;
		funcionario2.dataDeEntrada = "21/09/2010";
		funcionario2.rg = "12.345.678-7";
		funcionario2.estaNaEmpresa = true;
		empresa.adicionaFuncionario(funcionario2);

		Funcionario funcionario3 = new Funcionario ();
		funcionario3.nome = "Vitor";
		funcionario3.departamento = "DOV";
		funcionario3.salario = 2000;
		funcionario3.dataDeEntrada = "21/09/2005";
		funcionario3.rg = "12.345.678-1";
		funcionario3.estaNaEmpresa = true;
		empresa.adicionaFuncionario(funcionario3);

		Funcionario funcionario4 = new Funcionario ();
		funcionario4.nome = "Jose";
		funcionario4.departamento = "DOV";
		funcionario4.salario = 2500;
		funcionario4.dataDeEntrada = "21/09/2000";
		funcionario4.rg = "12.345.678-5";
		funcionario4.estaNaEmpresa = true;
		empresa.adicionaFuncionario(funcionario4);

		Funcionario funcionario5 = new Funcionario ();
		funcionario5.nome = "Noelia";
		funcionario5.departamento = "DOV";
		funcionario5.salario = 3000;
		funcionario5.dataDeEntrada = "21/09/2003";
		funcionario5.rg = "12.345.678-7";
		funcionario5.estaNaEmpresa = true;
		empresa.adicionaFuncionario(funcionario5);

		System.out.println("Razao Social: " + empresa.razaoSocial);
		System.out.println("CNPJ: " + empresa.cnpj);

		for (Funcionario func : empresa.funcionarios)
		{
			System.out.println (func);
			System.out.println (func.nome);
			System.out.println (func.departamento);
			System.out.println (func.dataDeEntrada);
			System.out.println (func.rg);
			System.out.println (func.estaNaEmpresa);
		}

	}
}