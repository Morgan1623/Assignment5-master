package BudgetBuddi.Domain.Expenses.ExpsenseCategories.Healthcare;

public class MedicalAid
{
    private String medicalAidID;
    private String medicalAidScheme;
    private int date;
    private double total;
    private double amount;

    public MedicalAid(Builder builder) {
        this.medicalAidID = builder.medicalAidID;
        this.medicalAidScheme = builder.medicalAidScheme;
        this.date = builder.date;
        this.total = builder.total;
        this.amount = builder.amount;
    }// constructor

    public String getMedicalAidID() {
        return medicalAidID;
    }


    public String getMedicalAidScheme() {
        return medicalAidScheme;
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
        private String medicalAidID;
        private String medicalAidScheme;
        private int date;
        private double total;
        private double amount;

        public Builder  medicalAidID(String  medicalAidID)
        {
            this. medicalAidID= medicalAidID;
            return this;
        }

        public Builder medicalAidScheme(String medicalAidScheme)
        {
            this.medicalAidScheme=medicalAidScheme;
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

        public MedicalAid
        build()
        {
            return new MedicalAid(this);
        }

    }//builder

    @Override
    public String toString() {
        return "MedicalAid{" +
                "medicalAidID='" + medicalAidID + '\'' +
                ", medicalAidScheme='" + medicalAidScheme + '\'' +
                ", date=" + date +
                ", total=" + total +
                ", amount=" + amount +
                '}';
    }
}//constructor
