class Conta
{
	private int numeroConta;
	private Cliente titular;
	private double saldo;
	private static int contador; // Static - O valor do atributo passa à ser compartilhado e não somente do objeto criado.
	

	//Construtor
	public Conta(Cliente titular) 
	{
		this.titular = titular;
		this.numeroConta = contador ++;
	}

	public static int getContador()
	{
		return contador;
	}

	public void setNumeroConta(int numeroConta)
	{
		this.numeroConta = numeroConta;
	}

	public int getNumeroConta()
	{
		return this.numeroConta;
	}

	public void setTitular (Cliente titular)
	{
		this.titular = titular;
	}

	public Cliente getTitular()
	{
		return this.titular;
	}

	public double getSaldo() 
	{
		return saldo;
	}

	boolean saque (double valor)
	{
		if (saldo >= valor) 
		{
			saldo -= valor;
			return true;
		}else
		{
			return false;
		}
	} 

	void depositar(double valor)
	{
		saldo += valor;
		System.out.println ("Deposito no valor de R$" + valor + " feito com sucesso");
	} 

	boolean transferir(Conta contaDestino, double valor) 
	{
		if (saldo >= valor)
		{
			saldo -= valor;	
			contaDestino.saldo += valor;
			return true;
		}
		else
		{
			return false;
		}
	}
}

class Cliente 
{
	private String nome;
	private String cpf;

	public void setNome (String nome)
	{
		this.nome = nome;
	}

	public String getNome ()
	{
		return this.nome;
	}

	public void setCpf (String cpf)
	{
		this.cpf = cpf;
	}

	public String getCpf ()
	{
		return this.cpf;
	}
}

/*class Funcionario
{
	String nome;
	String departamento;
	double salario;
	String dataDeEntrada;
	String rg;
	boolean estaNaEmpresa;

	void bonifica (double valor)
	{
		salario += valor;
	}

	void demite ()
	{
		estaNaEmpresa = false;
	}

	double calculaGanhoAnual ()
	{
		return salario * 12;
	}
}*/

class Programa 
{
	public static void main(String[] args) 
	{
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Lucas");
		cliente1.setCpf("123.456.758-10");

		Cliente cliente2 = new Cliente();
		cliente2.setNome("Chris");
		cliente2.setCpf("321.654.987-01");		

		Conta conta1 = new Conta(cliente1);
		//conta1.setTitular(cliente1);
		//conta1.setNumeroConta(123);
		conta1.depositar (2000);

		Conta conta2 = new Conta(cliente2);
		//conta1.setTitular(cliente1);
		//conta2.setNumeroConta(321);
		conta2.depositar (3000);

		System.out.println (conta1.getTitular().getNome());
		System.out.println (conta1.getTitular().getCpf());
		System.out.println (conta1.getNumeroConta());
		System.out.println (conta1.getSaldo());
		System.out.println ("***************************************");
		System.out.println (conta2.getTitular().getNome());
		System.out.println (conta2.getTitular().getCpf());
		System.out.println (conta2.getNumeroConta());
		System.out.println (conta2.getSaldo());

		System.out.println ("Total de contas criadas: " + Conta.getContador());

		/*Funcionario funcionario1 = new Funcionario();
		funcionario1.nome = "Lucas";
		funcionario1.departamento = "Games";
		funcionario1.salario = 5000;
		funcionario1.dataDeEntrada = "22/07/1996";
		funcionario1.rg = "38.417.759.1";
		funcionario1.estaNaEmpresa = true;
		funcionario1.bonifica(500);
		funcionario1.demite();


		System.out.println ("Nome: " + funcionario1.nome);
		System.out.println ("Departamento: " + funcionario1.departamento);
		System.out.println ("Salario: " + funcionario1.salario);
		System.out.println ("Data de entrada: " + funcionario1.dataDeEntrada);
		System.out.println ("RG: " + funcionario1.rg);
		System.out.println ("Status: " + funcionario1.estaNaEmpresa);
		System.out.println ("Ganho anual: R$" + funcionario1.calculaGanhoAnual());*/




		/*Conta conta = new Conta ();
		conta.numeroConta = 1;
		conta.titular = "Lucas";
		conta.saldo = 500;
		if (conta.saque(600) == true) 
		{
			System.out.println ("Operação realizada com sucesso");
		}
		else
		{
			System.out.println ("Operação não realizada com sucesso");
		}

		Conta conta2 = new Conta ();
		conta2.numeroConta = 2;
		conta2.titular = "Chris";
		conta2.saldo = 50;

		System.out.println ("Numero da conta: " + conta.numeroConta);
		System.out.println ("Titular: " + conta.titular);
		System.out.println ("Saldo: R$" + conta.saldo);

		conta.depositar(800);

		System.out.println ("Saldo: R$" +conta.saldo);

		System.out.println ("Numero da conta: " + conta2.numeroConta);
		System.out.println ("Titular: " + conta2.titular);
		System.out.println ("Saldo: R$" + conta2.saldo);

		if(conta.transferir (conta2, 1500) == true)
		{
			System.out.println ("Tranferência realizada com sucesso");
		}
		else 
		{
			System.out.println ("Saldo insuficiente. Tranferência não realizada");
		}

		System.out.println ("Numero da conta: " + conta.numeroConta);
		System.out.println ("Titular: " + conta.titular);
		System.out.println ("Saldo: R$" + conta.saldo);

		System.out.println ("Numero da conta: " + conta2.numeroConta);
		System.out.println ("Titular: " + conta2.titular);
		System.out.println ("Saldo: R$" + conta2.saldo);*/

	}
}
		