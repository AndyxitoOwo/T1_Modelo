package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tbl_categoria")
public class Categoria {
	@Id
	@Column(name ="id_categoria")
	private int idCategoria;
	
	@Column(name ="descripcion", nullable = false)
	private String descripcion;
	
	public String toString() {
		return descripcion;
	}
}
