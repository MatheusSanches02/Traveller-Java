package GlobalSolution;

import java.util.Scanner;

public class Usuario {

	private String id;
	private String nome;
	private String email;
	private String senha;
	private String tipoUsuarioId;

	
	public String getUsuarioId(String id) {
		return id;
	}
	public String getTipoUsuarioId() {
		return tipoUsuarioId;
	}
	public void setTipoUsuarioId(String tipoUsuarioId) {
		this.tipoUsuarioId = tipoUsuarioId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	
	public void novoUsuario() {

		Scanner input = new Scanner(System.in);
		System.out.println("Digite '1' para cliente ou '2' para anunciante:");
		int nome = input.nextInt();
		if( nome == 1) {
			System.out.println("Você está cadastrado!! Agora você pode ter acesso as nossas funcionalidades.");
			Usuario usuario = new Usuario();
			usuario.setId("55555");
			Favorito favorito = new Favorito();
			favorito.setUsuarioId(usuario.getId());
			System.out.println("O id do usuario é " + favorito.getUsuarioId());
		}else if(nome == 2){
			System.out.println("Seu estabelecimento foi cadastrado!! Agora você pode ter acesso as nossas funcionalidades.");
			Restaurante restaurante = new Restaurante();
			restaurante.setId("12345");
			Favorito favorito = new Favorito();
			favorito.setRestauranteId(restaurante.getId());
			System.out.println("O id do seu estabelecimento é "+favorito.getRestauranteId());
		}else {
			System.out.println("Opção Inválida!");
		}
	}
}
