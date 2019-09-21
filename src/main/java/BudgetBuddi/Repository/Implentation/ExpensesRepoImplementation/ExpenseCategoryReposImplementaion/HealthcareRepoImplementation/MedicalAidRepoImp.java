package BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.HealthcareRepoImplementation;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Healthcare.MedicalAid;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.HealthcareRepositories.MedicalAidRepository;

import java.util.ArrayList;

public class MedicalAidRepoImp implements MedicalAidRepository
{
    private static MedicalAidRepoImp repository =null;
    ArrayList<MedicalAid> medicalAids;

    private MedicalAidRepoImp()
    {
        this.medicalAids = new  ArrayList<>();
    }

    public static MedicalAidRepository getRepository()
    {
        if(repository == null) repository = new MedicalAidRepoImp();
        return repository;
    }

    @Override
    public ArrayList<MedicalAid> getAll()
    {

        return this.medicalAids;
    }

    @Override
    public MedicalAid create(MedicalAid medicalAid)
    {
        this.medicalAids.add(medicalAid);
        return null;
    }

    @Override
    public MedicalAid update(MedicalAid medicalAid)
    {
        this.medicalAids.set(1, null);
        return null;
    }

    @Override
    public void delete(String s)
    {
        this.medicalAids.remove(medicalAids);

    }

    @Override
    public MedicalAid read(String s)
    {
        for (int i = 0; i < medicalAids.size(); i++)
            System.out.println(medicalAids.get(i));
        return null;
    }
}//class
