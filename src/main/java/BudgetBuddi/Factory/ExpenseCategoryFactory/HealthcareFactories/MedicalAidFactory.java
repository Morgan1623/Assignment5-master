package BudgetBuddi.Factory.ExpenseCategoryFactory.HealthcareFactories;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Healthcare.MedicalAid;

import java.util.Date;

public class MedicalAidFactory
{
    public static MedicalAid getMedicalAid (String medicalAidID, String medicalAidScheme, int date, double total, double amount)
    {
        return new MedicalAid.Builder().medicalAidID(medicalAidID)
                .date(date)
                .total(total)
                .amount(amount)
                .medicalAidScheme(medicalAidScheme)
                .build();


    }
}
