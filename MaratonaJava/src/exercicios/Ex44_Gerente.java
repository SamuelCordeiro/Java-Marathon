package exercicios;

public class Ex44_Gerente extends Ex44_Empregado {
	/*Crie duas classes que definam os seguintes atributos e métodos para objetos do tipo:
	 * Empregado nome: String salario: float
	 * Gerente comissao: float extendendo Empregado
	 * Lembrar que o salário do gerente é composto do salário + comissão. */
	private float comissao;
	
	public void setSalario(float salario, float comissao){
        setSalario(salario + comissao); 
    }

	public float getComissao() {
		return comissao;
	}

	public void setComissao(float comissao) {
		this.comissao = comissao;
	}
	
}
