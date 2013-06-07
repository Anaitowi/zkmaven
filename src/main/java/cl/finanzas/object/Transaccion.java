/**
 * 
 */
package cl.finanzas.object;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author Tatiana
 *
 */
@Entity (name ="transaccion")
public class Transaccion implements Serializable {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 6625178808334982429L;

	@Id
	@Column (name="transaccion_id")
	private Integer transaccionId;
	
	@Column (name="descripcion")
	private String descripcion;
	
	@Column (name= "usuario_id")
	private Integer usuarioId;
	
	@Column (name= "tipo_transaccion_id")
	private Integer tipoTransaccionId;
	
	@Column (name="fecha")
	private Date fecha;
	
	@Column (name= "monto")
	private Integer monto;
	
	/**
	 * @return the transaccionId
	 */
	public Integer getTransaccionId() {
		return transaccionId;
	}
	/**
	 * @param transaccionId the transaccionId to set
	 */
	public void setTransaccionId(Integer transaccionId) {
		this.transaccionId = transaccionId;
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
	/**
	 * @return the usuarioId
	 */
	public Integer getUsuarioId() {
		return usuarioId;
	}
	/**
	 * @param usuarioId the usuarioId to set
	 */
	public void setUsuarioId(Integer usuarioId) {
		this.usuarioId = usuarioId;
	}
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
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}
	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	/**
	 * @return the monto
	 */
	public Integer getMonto() {
		return monto;
	}
	/**
	 * @param monto the monto to set
	 */
	public void setMonto(Integer monto) {
		this.monto = monto;
	}
	
	
}
