/**
 * 
 */
package cl.finanzas.controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.GenericForwardComposer;


/**
 * @author gsaravia
 *
 */
@Controller("ventanaController")
@Scope("prototype")
public class VentanaControlle extends GenericForwardComposer {
	
	

	private static final long serialVersionUID = -676335023964230364L;
	
	

	
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
	}
	
	public void onClick$updateSubPage(){
		
		
	}
	
	
	
	}
	

