package GlobalSolution;

import java.util.Scanner;

public class Avaliacao {

	private String id;
	private String descricao;
	private String usuarioId;
	private String restauranteId;

	public String getRestauranteId() {
		return restauranteId;
	}
	public void setRestauranteId(String restauranteId) {
		this.restauranteId = restauranteId;
	}
	public String getUsuarioId() {
		return usuarioId;
	}
	public void setUsuarioId(String usuarioId) {
		this.usuarioId = usuarioId;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void avaliar() { 
		Scanner input = new Scanner(System.in);
		System.out.println("Avalie de 1 a 5: ");
		int avaliacaoUsuario = input.nextInt();
		while (avaliacaoUsuario < 1 || avaliacaoUsuario >=6 ) {
			System.out.println("Opção invalida!");
			System.out.println("Digite uma opção de 1 a 5: ");
			avaliacaoUsuario = input.nextInt();
		}
		switch(avaliacaoUsuario) {
		case(1):
			System.out.println("Voce avaliou como péssimo!");
			break;
		case(2):
			System.out.println("Voce avaliou como ruim!");
			break;
		case(3):
			System.out.println("Voce avaliou como regular!");
			break;
		case(4):
			System.out.println("Voce avaliou como bom");
			break;
		case(5):
			System.out.println("Voce avaliou como otimo!");
			break;
			
		}
		
	}
	
	
	
	
}
