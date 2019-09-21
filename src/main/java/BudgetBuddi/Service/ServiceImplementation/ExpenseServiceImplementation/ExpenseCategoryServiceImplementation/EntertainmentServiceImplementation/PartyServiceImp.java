package BudgetBuddi.Service.ServiceImplementation.ExpenseServiceImplementation.ExpenseCategoryServiceImplementation.EntertainmentServiceImplementation;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Entertainment.Party;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.EntertainmentRepositories.PartyRepository;
import BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.EntertainmentRepoImplementation.PartyRepoImp;
import BudgetBuddi.Service.Services.ExpenseServices.ExpenseCategoryServices.EntertainmentServices.PartyService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class PartyServiceImp implements PartyService
{
    private static PartyServiceImp service =null;
    private PartyRepository repository;

    private PartyServiceImp()
    {
        this.repository= PartyRepoImp.getRepository();
    }

    public static PartyServiceImp getService()
    {
        if (service == null) service = new PartyServiceImp();
        return service;
    }

    @Override
    public ArrayList<Party> getAll()
    {

        return this.repository.getAll();
    }

    @Override
    public Party create(Party party)
    {
        return this.repository.create(party);
    }

    @Override
    public Party update(Party party)
    {
        return this.repository.update(party);
    }

    @Override
    public void delete(String s)
    {
       this.repository.delete(s);
    }

    @Override
    public Party read(String s)
    {
        return this.repository.read(s);
    }
}
