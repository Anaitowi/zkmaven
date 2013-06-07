/**
 * 
 */
package cl.finanzas.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Button;
import org.zkoss.zul.Combobox;
import org.zkoss.zul.Intbox;
import org.zkoss.zul.Textbox;

/**
 * @author gsaravia
 *
 */
@Controller("registroController")
@Scope("prototype")
public class RegistroControlle extends GenericForwardComposer {

	private static final long serialVersionUID = -676335023964230364L;
	
	
	private Textbox txNombre2;
	private Textbox txCorreo;
	private Textbox txRCorreo;
	private Combobox cboUso;
	private Intbox intContraseña;
	private Intbox intRContraseña;
	
	private Button btnGuardar;
	
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
	}
	
	public void onClick$btnLimpiar(){ // funcion para borrar las variables de los campos
		txNombre2.setValue(null);
		txCorreo.setValue(null);
		txRCorreo.setValue(null);
		cboUso.setValue(null);
		intContraseña.setValue(null);
		intRContraseña.setValue(null);
		
		this.validaGuardar();
	}
	
	public void validaGuardar(){ // funcion del boton guardar datos
		if(txNombre2.getValue() != null && !"".equals(txNombre2.getValue()) &&  // condiciones para guardar datos
				txCorreo.getValue() != null && !"".equals(txCorreo.getValue())&&
				txRCorreo.getValue() != null && !"".equals(txRCorreo.getValue())&&
				cboUso.getValue() != null && intContraseña.getValue() != null &&
				intContraseña.getValue() != 0 && intRContraseña.getValue() != null &&
				intRContraseña.getValue() != 0){
			btnGuardar.setDisabled(false);
		}else{
			btnGuardar.setDisabled(true);
		}
	}
	
}
