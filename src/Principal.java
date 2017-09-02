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

	
	}

}
