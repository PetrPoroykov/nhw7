package Deals;

public class Sale extends Deal {
    public Sale(String comment, int debitChange) {
        super(comment, 0, debitChange);
    }

    @Override
    public void printTransactions(Deal deal) {
            System.out.printf("Продажа %S  на %d руб.\n", deal.getComment(), deal.getDebitChange());
    }
}
