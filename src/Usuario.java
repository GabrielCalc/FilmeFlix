
public class Usuario {
	//Atributo
	private String nome;
	private String CPF;
	private String sexo;
	private int idade;
	
	
	public Usuario(String nome, String CPF, String sexo, int idade) {
		super();
		this.CPF = CPF;
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
	}
	
	
	@Override
	public String toString() {
		return "Nome: " + this.nome + "Idade: " + this.idade + "CPF: " + this.CPF;
	}


	public String getCPF() {
		return CPF;
	}


	public void setCPF(String cPF) {
		CPF = cPF;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	

}
