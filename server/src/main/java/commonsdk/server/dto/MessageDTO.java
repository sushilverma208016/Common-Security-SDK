package commonsdk.server.dto;



/**
 * Created by mouradzouabi on 04/12/15.
 */
public class MessageDTO extends AbstractDTO {

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
