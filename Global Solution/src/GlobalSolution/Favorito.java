package GlobalSolution;

public class Favorito {

	private String id;
	private int valor;
	private String usuarioId;
	private String restauranteId;

	public Favorito() {
		this.valor = 0;
		System.out.println("Voc� tem "+this.valor+" favoritos");
	}

	public String getRestauranteId() {
		return restauranteId;
	}

	public void setRestauranteId(String restauranteId) {
		this.restauranteId = restauranteId;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsuarioId() {
		return usuarioId;
	}
	public void setUsuarioId(String usuarioId) {
		this.usuarioId = usuarioId;
	}
	
	public int setarFavorito(int num) {
		this.valor = valor+num;
		System.out.println("Agora voc� tem "+valor+" favoritos.");
		return valor;
	}
	public int removerFavorito(int num) {
		this.valor = valor - num;
		System.out.println("Agora voc� tem "+valor+" favoritos.");
		return valor;
	}
	
	
}
