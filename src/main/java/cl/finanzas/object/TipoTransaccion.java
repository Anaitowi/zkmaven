/**
 * 
 */
package cl.finanzas.object;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Tatiana
 *
 */
@Entity (name ="tipo_transaccion")
public class TipoTransaccion implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2738976940248014102L;

	@Id
	@Column (name="tipo_transaccion_id")
	private Integer tipoTransaccionId;
	
	@Column (name="descripcion")
	private String descripcion;
	
	/**
	 * @return the tipoTransaccionId
	 */
	public Integer getTipoTransaccionId() {
		return tipoTransaccionId;
	}
	/**
	 * @param tipoTransaccionId the tipoTransaccionId to set
	 */
	public void setTipoTransaccionId(Integer tipoTransaccionId) {
		this.tipoTransaccionId = tipoTransaccionId;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
	
}
