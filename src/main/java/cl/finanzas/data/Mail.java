/**
 * 
 */
package cl.finanzas.data;

import java.io.Serializable;

/**
 * @author gsaravia
 *
 */
public class Mail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7356532085866949225L;

	private int id;
	private String subject;
	private String date;
	private int size;
	
	
	
	public Mail(int id, String subject, String date, int size) {
		this.id = id;
		this.subject = subject;
		this.date = date;
		this.size = size;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	
	
}
