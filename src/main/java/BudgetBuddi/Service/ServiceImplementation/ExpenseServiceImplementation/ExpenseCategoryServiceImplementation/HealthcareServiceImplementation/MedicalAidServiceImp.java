package BudgetBuddi.Service.ServiceImplementation.ExpenseServiceImplementation.ExpenseCategoryServiceImplementation.HealthcareServiceImplementation;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Healthcare.MedicalAid;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.HealthcareRepositories.MedicalAidRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.HealthcareRepoImplementation.MedicalAidRepoImp;
import BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.HealthcareServices.MedicalAidService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class MedicalAidServiceImp implements MedicalAidService
{
    private static MedicalAidServiceImp service =null;
    private MedicalAidRepository repository;

    private MedicalAidServiceImp()
    {
        this.repository= MedicalAidRepoImp.getRepository();
    }

    public static MedicalAidServiceImp getService()
    {
        if (service == null) service = new MedicalAidServiceImp();
        return service;
    }


    @Override
    public ArrayList<MedicalAid> getAll() {
        return this.repository.getAll();
    }

    @Override
    public MedicalAid create(MedicalAid medicalAid)
    {
        return this.repository.create(medicalAid);
    }

    @Override
    public MedicalAid update(MedicalAid medicalAid)
    {
        return this.repository.update(medicalAid);
    }

    @Override
    public void delete(String s)
    {
        this.repository.delete(s);
    }

    @Override
    public MedicalAid read(String s)
    {
        return this.read(s);
    }
}
