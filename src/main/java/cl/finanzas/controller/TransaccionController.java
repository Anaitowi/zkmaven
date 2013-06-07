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
 * @author tsaravia
 *
 */
@Controller("transaccionController")
@Scope("prototype")
public class TransaccionController extends GenericForwardComposer {

	private static final long serialVersionUID = -676335023964230364L;
	
	private Textbox txNombre;
	private Combobox cboTipo;
	private Intbox intMonto;
	
	private Button btnGuardar;
	
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
	}
	// funcion para borrar las variables de los campos
	public void onClick$btnLimpiar(){
		txNombre.setValue(null);
		cboTipo.setValue(null);
		intMonto.setValue(null);
		this.validaGuardar();
	}
	//funcion del boton guardar datos
	public void validaGuardar(){
		if(txNombre.getValue() != null && !"".equals(txNombre.getValue()) && // condiciones para guardar datos
				cboTipo.getValue() != null && intMonto.getValue() != null &&
				intMonto.getValue() != 0){
			btnGuardar.setDisabled(false);
		}else{
			btnGuardar.setDisabled(true);
		}
	}
	
}
