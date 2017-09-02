import java.util.ArrayList;

public class BDSimulado {
	//Atributos
	private ArrayList<Filme> filmes;
	private ArrayList<Usuario> usuarios;
	
	//Metodo construtor
	public BDSimulado(){
		//Instanciar o atributo filmes
		this.filmes = new ArrayList<Filme>();
		
		//Instanciar objetos da classe Filme
		Filme f1 = new Filme ("A volta dos que não foram", "Will Smith", 2007, "Comédia");
		Filme f2 = new Filme ("As tranças da mulher careca", "Will Smith", 2009, "Drama");
		Filme f3 = new Filme ("A chuva seca", "Carlos Castro", 2005, "Ficção científica");
		Filme f4 = new Filme ("A vista de um cego", "Jorge Kluney", 2000, "Ação");
		Filme f5 = new Filme ("O miado do cachorro", "Madsen Stanley", 2002, "Aventura");
		Filme f6 = new Filme ("Gelo gaseificado", "Monteiro Verdana", 2001, "Romance");
		
		//Colocar os filmes na lista
		this.filmes.add(f1);
		this.filmes.add(f2);
		this.filmes.add(f3);
		this.filmes.add(f4);
		this.filmes.add(f5);
		this.filmes.add(f6);
		
		//Instanciar o atributo usuarios
		this.usuarios = new ArrayList<Usuario>();
		
		//Instanciar objetos da classe Usuarios
		Usuario u1 = new Usuario ("Joao", "Masculino", 33);
		Usuario u2 = new Usuario ("Maria", "Feminino", 25);
		Usuario u3 = new Usuario ("Albert", "Masculino", 24);
		Usuario u4 = new Usuario ("Joana", "Feminino", 55);
		Usuario u5 = new Usuario ("Malboro", "Masculino", 28);
		Usuario u6 = new Usuario ("Carla", "Feminino", 31);
		
		//Colocar os usuarios na lista
		this.usuarios.add(u1);
		this.usuarios.add(u2);
		this.usuarios.add(u3);
		this.usuarios.add(u4);
		this.usuarios.add(u5);
		this.usuarios.add(u6);
		
	}

	public ArrayList<Filme> getFilmes() {
		return filmes;
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}
	//Metodo que retorna a lista de filmes de um ano informado
	public ArrayList<Filme> getFilmesPorAno(int ano){
		ArrayList<Filme> resultado = new ArrayList<Filme>();
		
		//Percorrer a lista de filmes
		for (int i = 0; i < this.filmes.size(); i++) {
			//Verificar se o filme é do ano informado
			if (this.filmes.get(i).getAnoLancamento() == ano) {
				resultado.add(this.filmes.get(i));
				
				
			}
			
		}
		return resultado;
	}
	//metodo que retorna a lista de filmes de um diretor informado
	public ArrayList<Filme> getFilmesPorDiretor(String diretor){
		ArrayList<Filme> resultado = new ArrayList<Filme>();
		for (int i = 0; i < this.filmes.size(); i++) {
			if (this.filmes.get(i).getDiretor().equals(diretor)) {
				resultado.add(this.filmes.get(i));
				
			}
			
		}
		return resultado;
	}
	
}
