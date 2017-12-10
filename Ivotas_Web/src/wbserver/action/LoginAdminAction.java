package wbserver.action;
import com.opensymphony.xwork2.ActionSupport;

import wbserver.bean.WbserverBean;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;



public class LoginAdminAction extends ActionSupport implements SessionAware {
	private static final long serialVersionUID = 1L;
	private Map<String, Object> session;
	private String password=null,username=null;
	
	//@Override
	public String execute(){
		System.out.println("Username: "+this.username);
		if((this.username != null && !username.equals(""))
			&&(this.password!=null && !password.equals(""))){
			return SUCCESS;
		}
		else
			return LOGIN;	
	}
	public void setUsername(String username) {
		this.username = username; // will you sanitize this input? maybe use a prepared statement?
	}

	public void setPassword(String password) {
		this.password = password; // what about this input? 
	} 
	public WbserverBean getWeb_serverBean() throws MalformedURLException{
		if(!session.containsKey("Web_serverBean"))
			this.setWeb_serverBean(new WbserverBean());
		return (WbserverBean) session.get("Web_serverBean");
	}
	public void setWeb_serverBean(WbserverBean web_serverBean) {
		this.session.put("web_serverBean", web_serverBean);
	}
	
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
