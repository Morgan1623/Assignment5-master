package BudgetBuddi.Domain.Expenses.Expense;

import java.util.ArrayList;

public class RegularExpsenses
{
    ArrayList<String> regularExpsensesList = new ArrayList<String>();

    private double amount;
    private double total;
    private String expenseName;

    public RegularExpsenses(Builder builder ) {
        this.regularExpsensesList = builder.regularExpsensesList;
        this.amount = builder.amount;
        this.total = builder.total;
        this.expenseName = builder.expenseName;
    }//closes constructor

    public ArrayList<String> getRegularExpsensesList() {
        return regularExpsensesList;
    }

    /*public void setRegularExpsensesList(ArrayList<String> regularExpsensesList) {
        this.regularExpsensesList = regularExpsensesList;
    }*/

    public double getAmount() {
        return amount;
    }


    public double getTotal() {
        return total;
    }


    public String getExpenseName() {
        return expenseName;
    }

    public static class Builder
    {
        ArrayList<String> regularExpsensesList = new ArrayList<String>();

        private double amount;
        private double total;
        private String expenseName;

        public Builder regularExpsensesList(ArrayList<String> regularExpsensesList)
        {
            this.regularExpsensesList=regularExpsensesList;
            return this;
        }

        public Builder total(double total)
        {
            this.total=total;
            return this;
        }

        public Builder amount(double amount)
        {
            this.amount=amount;
            return this;
        }

        public RegularExpsenses build()
        {
            return new RegularExpsenses(this);
        }

    }


    @Override
    public String toString() {
        return "RegularExpsenses{" +
                "regularExpsensesList=" + regularExpsensesList +
                ", amount=" + amount +
                ", total=" + total +
                ", expenseName='" + expenseName + '\'' +
                '}';
    }
}//closes class
