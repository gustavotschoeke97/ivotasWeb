package wbserver.action;

import java.net.MalformedURLException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import wbserver.bean.WbserverBean;


public class wbServerAdminAction extends ActionSupport implements SessionAware {
	private static final long serialVersionUID = 1L;
	private Map<String, Object> session;
	private WbserverBean wb;
	@Override
	public String execute() throws MalformedURLException, RemoteException{
		this.setWbserverBean(new WbserverBean());
		wb.getTestconnection();
		return SUCCESS;
	}
	
	public WbserverBean getWeb_serverBean() throws MalformedURLException{
		if(!session.containsKey("WbserverBean"))
			this.setWeb_serverBean(new WbserverBean());
		return (WbserverBean) session.get("WbserverBean");
	}
	public void setWbserverBean(WbserverBean wb){
		this.wb=wb;
	}
	public void setWeb_serverBean(WbserverBean web_serverBean) {
		this.session.put("WbserverBean", web_serverBean);
	}
	
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}

