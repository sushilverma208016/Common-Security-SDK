package commonsdk.server.dto;

public class TransferRequestDTO {
    Integer fromAccount;
    Integer toAccount;
    Integer amount;

    public Integer getFromAccount() {
        return fromAccount;
    }

    public void setFromAccount(Integer fromAccount) {
        this.fromAccount = fromAccount;
    }

    public Integer getToAccount() {
        return toAccount;
    }

    public void setToAccount(Integer toAccount) {
        this.toAccount = toAccount;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
