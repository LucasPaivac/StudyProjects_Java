class Funcionario
{
	private String nome;
	private String departamento;
	private double salario;
	private String dataDeEntrada;
	private String rg;
	private boolean estaNaEmpresa;

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getNome()
	{
		return this.nome;
	}

	public void setDepartamento(String departamento)
	{
		this.departamento = departamento;
	}

	public String getDepartamento()
	{
		return this.departamento;
	}

	public void setSalario(double salario)
	{
		this.salario = salario;
	}	

	public double getSalario()
	{
		return this.salario;
	}

	public void setDataDeEntrada(String dataDeEntrada)
	{
		this.dataDeEntrada = dataDeEntrada;
	}

	public String getDataDeEntrada()
	{
		return this.dataDeEntrada;
	}

	public void setRg(String rg)
	{
		this.rg = rg;
	}

	public String getRg()
	{
		return this.rg;
	}

	public void setEstaNaEmpresa(boolean estaNaEmpresa)
	{
		this.estaNaEmpresa = estaNaEmpresa;
	}

	public boolean getEstaNaEmpresa()
	{
		return this.estaNaEmpresa;
	}

	public void calculaSalario (double valor)
	{
		this.salario = valor - (valor * 0.06);
	}

	public void calculaSalario (double valor, double horaExtra)
	{
		double valorHorasExtras = (valor/30) / 8 * horaExtra;
		this.salario = valor - (valor * 0.06) + valorHorasExtras;
	}

	public void bonifica (double valor)
	{
		salario += valor;
	}

	public void demite ()
	{
		estaNaEmpresa = false;
	}

	public double calculaGanhoAnual ()
	{
		return salario * 12;
	}
}

class Programa 
{
	public static void main(String[] args) 
	{
		Funcionario f1 = new Funcionario();
		f1.setRg("33");
		f1.setSalario(1253.89);
		f1.setDepartamento("Recepcionista");
		f1.setNome("Lucas");
		f1.setEstaNaEmpresa(true);
		f1.setDataDeEntrada("06/11/2018");
		//f1.calculaSalario(1000, 2);

		System.out.println ("Nome: " + f1.getNome());
		System.out.println ("RG: " + f1.getRg());
		System.out.println ("Departamento: " + f1.getDepartamento());
		System.out.println ("salario: R$" + f1.getSalario());
		System.out.println ("Esta na empresa: " + f1.getEstaNaEmpresa());
		System.out.println ("Data de entrada: " + f1.getDataDeEntrada());
	}
}