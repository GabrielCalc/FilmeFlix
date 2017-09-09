import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		//Instanciar o BDSimulado
		BDSimulado bds = new BDSimulado();
		
		//Recuperar a lista de filmes e usuários
		ArrayList<Filme> filmes = bds.getFilmes();
		ArrayList<Usuario> usuarios = bds.getUsuarios();
		
		//Exibindo filmes que foram feitos depois do ano 2000
		for (int i = 0; i < filmes.size(); i++){
			if (filmes.get(i).getAnoLancamento() > 2000){
				System.out.println(filmes.get(i).getTitulo() + "/" + filmes.get(i).getGenero());
			}
		}
		
		ArrayList<Filme> filmesPorAno = bds.getFilmesPorAno(2000);
		//Imprimir
		for (int i = 0; i < filmesPorAno.size(); i++) {
			System.out.println(filmesPorAno.get(i).getTitulo());
			
		}

		Usuario usuario = bds.getUsuarioPorCPF("234");
		System.out.println(usuario);
		
		
		
		bds.addAvaliacaoFilme("A volta dos que não foram", "234", 1);
		bds.addAvaliacaoFilme("As tranças da mulher careca", "123", 2);
		bds.addAvaliacaoFilme("A chuva seca", "345", 3);
		bds.addAvaliacaoFilme("O miado do cachorro", "456", 4);
		bds.addAvaliacaoFilme("A vista de um cego", "789", 5);
		
		ArrayList<Filme> filmesPorNota = bds.getFilmesPorNota(4);
		
		for (int i = 0; i < filmesPorNota.size(); i++) {
			System.out.println(filmesPorNota.get(i).getTitulo());
			
		}
			
		

	
	}

}

	
	
	
	

