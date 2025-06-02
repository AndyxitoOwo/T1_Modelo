package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name="tbl_actividad")
public class Actividad {
	@Id
	@Column(name="id_actividad")
	@EqualsAndHashCode.Include
	private int idActividad;
	
	@Column(name ="descripcion", nullable = false)
	private String descripcion;
	
	@JoinColumn(name = "id_categoria")
	@ManyToOne(fetch = FetchType.LAZY)
	private Categoria idCategoria;
	
	@Column(name ="fecha_inicio", nullable = false)
	private LocalDate fechaInicio;
	
	@Column(name="nro_vacantes")
	private int nroVacantes;
	
	public String toString() {
		return descripcion;
	}
}
