package programa1;

public class pessoa {
	String nome;
	int idade;
	
	public void pessoa(String nome, int idade) {
		this.nome = nome;
        this.idade = idade;
	}
	
	public void fazaniversario() {
        idade++;
    }
	
	public void imprimeidade() {
        System.out.println(nome + " tem " + idade + " anos.");
    }
}