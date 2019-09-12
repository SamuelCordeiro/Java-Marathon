package exercicios;

public class Ex43_Aluno {
	/* Defina uma classe de nome Aluno com dados privados para armazenar o nome do aluno, 
	 * a série e o grau. Inclua dois métodos públicos: 
	 * uma para solicitar os dados para o usuário e outro para imprimir os dados.*/
	
	private String nome;
	private int serie;
	private int grau;
	
	public void SolicitarDados() {
		Utils.Print("Digite o nome");
		nome = Utils.ReadString();
		Utils.Print("Digite a série");
		serie = Utils.ReadInt();
		Utils.Print("Digite o grau");
		grau = Utils.ReadInt();
	}
	
	public void ImprimirDados() {
		Utils.Print("Nome: " + nome);
		Utils.Print("Série: " + serie);
		Utils.Print("Grau: " + grau);
	}
	
	
}
