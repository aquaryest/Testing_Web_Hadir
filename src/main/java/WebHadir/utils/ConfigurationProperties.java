package WebHadir.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("framework.properties")
public class ConfigurationProperties {
	
	@Value("${browser}")
	private String browser;
	
	@Value("${inputUsername}")
	private String usernameLogin;
	
	@Value("${inputPassword}")
	private String passwordLogin;
	
	@Value("${inputNIK}")
	private String inNIK;
	
	@Value("${inputName}")
	private String inName;
	
	@Value("${inputLeader}")
	private String inLeader;
	
	@Value("${inputPosisi}")
	private String inPosisi;
	
	@Value("${editPosisi}")
	private String editPosisi;
	
	@Value("${inputTimer}")
	private String inTimer;
	
	@Value("${inputRadius")
	private String inRadius;
	
	@Value("${inputDepartemen}")
	private String inDepartemen;
	
	@Value("${editDepartemen}")
	private String editDepartemen;

	
	public String getInLeader() {
		return inLeader;
	}

	public String getInName() {
		return inName;
	}
	
	public String getInNIK() {
		return inNIK;
	}

	public String getPasswordLogin() {
		return passwordLogin;
	}
	
	public String getUsernameLogin() {
		return usernameLogin;
	}
	
	public String getBrowser() {
		return browser;
	}

	public String getInPosisi() {
		return inPosisi;
	}

	public void setInPosisi(String inPosisi) {
		this.inPosisi = inPosisi;
	}

	public String getEditPosisi() {
		return editPosisi;
	}

	public void setEditPosisi(String editPosisi) {
		this.editPosisi = editPosisi;
	}

	public String getInTimer() {
		return inTimer;
	}

	public void setInTimer(String inTimer) {
		this.inTimer = inTimer;
	}

	public String getInRadius() {
		return inRadius;
	}

	public void setInRadius(String inRadius) {
		this.inRadius = inRadius;
	}

	public String getInDepartemen() {
		return inDepartemen;
	}

	public void setInDepartemen(String inDepartemen) {
		this.inDepartemen = inDepartemen;
	}

	public String getEditDepartemen() {
		return editDepartemen;
	}

	public void setEditDepartemen(String editDepartemen) {
		this.editDepartemen = editDepartemen;
	}
		
}
