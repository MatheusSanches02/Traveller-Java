package GlobalSolution;

public class Main {

	public static void main(String[] args) {
		
		Usuario user = new Usuario();
		user.novoUsuario();
		user.setNome("Teste");
		user.setEmail("teste@gmail.com");
		user.setSenha("12345");
		
		System.out.println("Seu nome �:"+user.getNome());
		System.out.println("Seu email �:"+user.getEmail());
		System.out.println("Sua senha �:"+user.getSenha());
		
		Comentario comentario = new Comentario();
		comentario.setComentario("Achei otima comida e atendimento!");
		System.out.println("O usuario " + user.getNome() + " fez o comentario " + comentario.getComentario());
		
		Favorito favorito1 = new Favorito();
		favorito1.setarFavorito(2);
		favorito1.removerFavorito(1);
		
		Avaliacao avaliacao = new Avaliacao();
		avaliacao.avaliar();
		
		Restaurante restaurante1 = new Restaurante();
		restaurante1.setBairro("Ipiranga");
		
		System.out.println("O restaurante escolhido � localizado no bairro "+ restaurante1.getBairro());
		
		
		
	}
}
