package exercicios;

public class Ex44_Empregado {
	/*Crie duas classes que definam os seguintes atributos e métodos para objetos do tipo:
	 * Empregado nome: String salario: float
	 * Gerente comissao: float extendendo Empregado
	 * Lembrar que o salário do gerente é composto do salário + comissão. */
	private String nome; 
	private float salario;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	
}
