package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert
@Table(name="tbl_solicitud")
public class Solicitud {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="nro_solicitud")
	private int idSolicitud;
	
	@JoinColumn(name = "id_actividad")
	@ManyToOne(fetch = FetchType.LAZY)
	private Actividad idActividad;
	
	@Column(name ="estado", nullable = false)
	private String estado;
	
	@Column(name ="archivo_adjunto", nullable = false)
	private String archivoAdjunto;
	
	@Column(name ="fecha_reg",  columnDefinition = "DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP")
	private LocalDate fecha;
}
