package exercicios;

public class Ex43_Aluno {
	/* Defina uma classe de nome Aluno com dados privados para armazenar o nome do aluno, 
	 * a série e o grau. Inclua dois métodos públicos: 
	 * uma para solicitar os dados para o usuário e outro para imprimir os dados.*/
	
	private String nome;
	private int serie;
	private int grau;
	
	public void SolicitarDados() {
		Utils.print("Digite o nome");
		nome = Utils.readString();
		Utils.print("Digite a série");
		serie = Utils.readInt();
		Utils.print("Digite o grau");
		grau = Utils.readInt();
	}
	
	public void ImprimirDados() {
		Utils.print("Nome: " + nome);
		Utils.print("Série: " + serie);
		Utils.print("Grau: " + grau);
	}
	
	
}
