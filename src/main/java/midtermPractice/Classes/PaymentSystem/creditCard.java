package midtermPractice.Classes.PaymentSystem;

public class creditCard implements Payable{

    String cardName;
    int limit;
    public creditCard(String cardName, int limit) {
        this.cardName = cardName;
        this.limit = limit;
    }

    public int pay() {
        return 100;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    @Override
    public String makePayment() {
        return "CD payment";
    }
}
