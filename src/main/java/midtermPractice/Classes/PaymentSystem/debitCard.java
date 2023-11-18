package midtermPractice.Classes.PaymentSystem;

public class debitCard implements Payable{
    String cardName;

    public debitCard(String cardName) {
        this.cardName = cardName;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }
    public int pay() {
        return 10000;
    }

    @Override
    public String makePayment() {
        return "DC payment";
    }
}
