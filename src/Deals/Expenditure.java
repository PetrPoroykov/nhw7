package Deals;

public class Expenditure extends Deal {
    public Expenditure(String comment, int creditChange) {
        super(comment, creditChange, 0);
    }

    @Override
    public void printTransactions(Deal deal) {
        System.out.printf("Покупка %S  на %d руб.\n", deal.getComment(), deal.getCreditChange());
    }
}
