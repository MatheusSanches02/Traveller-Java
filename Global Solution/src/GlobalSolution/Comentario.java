package GlobalSolution;

import java.util.Date;

public class Comentario {

	private String id;
	private String comentario;
	private Date data;
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
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	
	
}
