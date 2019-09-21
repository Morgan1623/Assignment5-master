package BudgetBuddi.Domain.Expenses.ExpsenseCategories.Totals;

public class TotalCategoryExpense
{

    private double carTotals;
    private double entertainmentTotals;
    private double healthcareTotals;
    private double householdTotals;
    private double personalTotals;
    private double taxTotals;
    private double schoolTotals;
    private double travelTotals;
    private int date;

    public TotalCategoryExpense(Builder builder )
    {
        this.carTotals = builder.carTotals;
        this.entertainmentTotals = builder.entertainmentTotals;
        this.healthcareTotals = builder.healthcareTotals;
        this.householdTotals = builder.householdTotals;
        this.personalTotals = builder.personalTotals;
        this.taxTotals = builder.taxTotals;
        this.schoolTotals = builder.schoolTotals;
        this.travelTotals = builder.travelTotals;
        this.date = builder.date;
    }

    public double getCarTotals() {
        return carTotals;
    }


    public double getEntertainmentTotals() {
        return entertainmentTotals;
    }


    public double getHealthcareTotals() {
        return healthcareTotals;
    }


    public double getHouseholdTotals() {
        return householdTotals;
    }

    public void setHouseholdTotals(double householdTotals) {
        this.householdTotals = householdTotals;
    }

    public double getPersonalTotals() {
        return personalTotals;
    }



    public double getTaxTotals() {
        return taxTotals;
    }



    public double getSchoolTotals() {
        return schoolTotals;
    }


    public double getTravelTotals() {
        return travelTotals;
    }


    public int getDate() {
        return date;
    }

    public static class Builder
    {
        private double carTotals;
        private double entertainmentTotals;
        private double healthcareTotals;
        private double householdTotals;
        private double personalTotals;
        private double taxTotals;
        private double schoolTotals;
        private double travelTotals;
        private int date;

        public Builder carTotals(double carTotals)
        {
            this.carTotals=carTotals;
            return this;
        }

        public Builder entertainmentTotals(double entertainmentTotals)
        {
            this.entertainmentTotals=entertainmentTotals;
            return this;
        }

        public Builder healthcareTotals(double healthcareTotals)
        {
            this.healthcareTotals=healthcareTotals;
            return this;
        }

        public Builder householdTotals(double householdTotals)
        {
            this.householdTotals=householdTotals;
            return this;
        }

        public Builder personalTotals(double personalTotals)
        {
            this.personalTotals=personalTotals;
            return this;
        }

        public Builder taxTotals(double taxTotals)
        {
            this.taxTotals=taxTotals;
            return this;
        }

        public Builder schoolTotals(double schoolTotals)
        {
            this.schoolTotals=schoolTotals;
            return this;
        }

        public Builder travelTotals(double travelTotals)
        {
            this.travelTotals=travelTotals;
            return this;
        }

        public Builder date(int date)
        {
            this.date=date;
            return this;
        }

        public TotalCategoryExpense build()
        {
            return new TotalCategoryExpense(this);
        }

    }//builder
    @Override
    public String toString() {
        return "TotalCategoryExpense{" +
                "carTotals=" + carTotals +
                ", entertainmentTotals=" + entertainmentTotals +
                ", healthcareTotals=" + healthcareTotals +
                ", householdTotals=" + householdTotals +
                ", personalTotals=" + personalTotals +
                ", taxTotals=" + taxTotals +
                ", schoolTotals=" + schoolTotals +
                ", travelTotals=" + travelTotals +
                ", date=" + date +
                '}';
    }






}//closes class
