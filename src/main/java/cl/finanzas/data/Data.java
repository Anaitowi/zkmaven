/**
 * 
 */
package cl.finanzas.data;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zkplus.databind.AnnotateDataBinder;
import org.zkoss.zul.Listbox;
import org.zkoss.zul.Listitem;

/**
 * @author gsaravia
 *
 */
@Controller("data")
@Scope("prototype")
public class Data extends GenericForwardComposer {

	private static final long serialVersionUID = -676335023964230364L;
	
	private InboxData mailData;
	
	private AnnotateDataBinder binder;

	private Listbox list;
	
	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		binder = new AnnotateDataBinder(comp);
		mailData = new InboxData();
		binder.loadAll();
	}
	
	public void onClick$revertBtn(){
		Mail selected = (Mail) ((Listitem)list.getSelectedItem()).getValue();
		selected.getSubject();
	}
	
	public InboxData getMailData() {
		return mailData;
	}

	public void setMailData(InboxData mailData) {
		this.mailData = mailData;
	}
	

	
}
