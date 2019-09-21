package BudgetBuddi.Domain.Expenses.ExpsenseCategories.Car;


public class Insurance
{
    private String insuranceName;
    private int date;
    private double total;
    private double amount;

    private Insurance(){}

    public Insurance(Builder builder) {
        this.insuranceName = builder.insuranceName;
        this.date = builder.date;
        this.total = builder.total;
        this.amount = builder.amount;
    }// constructor

    public String getInsuranceName() {
        return insuranceName;
    }



    public int getDate() {
        return date;
    }


    public double getTotal() {
        return total;
    }



    public double getAmount() {
        return amount;
    }

    public static class Builder
    {
        private String insuranceName;
        private int date;
        private double total;
        private double amount;

        public Builder insuranceName(String insuranceName)
        {
            this.insuranceName=insuranceName;
            return this;
        }

        public Builder date(int date)
        {
            this.date=date;
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

        public Insurance build()
        {
            return new Insurance (this);
        }



    }//builder

    @Override
    public String toString() {
        return "Insurance{" +
                "insuranceName='" + insuranceName + '\'' +
                ", date=" + date +
                ", total=" + total +
                ", amount=" + amount +
                '}';
    }
}//closes  class
