package commonsdk.server.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
public class Message extends AbstractEntity {

	private static final long serialVersionUID = -6321180910534044216L;

	String username;

	String password;

	Integer totalbalance;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getTotalbalance() {
		return totalbalance;
	}

	public void setTotalbalance(Integer totalbalance) {
		this.totalbalance = totalbalance;
	}
}
