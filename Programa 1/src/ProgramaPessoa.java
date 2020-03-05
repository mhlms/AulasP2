
public class ProgramaPessoa {

	public static void main(String[] args) {
		Pessoa pessoaum;
		pessoaum = new Pessoa();
		
		pessoaum.nome = "Aza";
		pessoaum.idade = 15;

		pessoaum.fazerAniversario();
		
		System.out.println(pessoaum.idade);
	}

}
