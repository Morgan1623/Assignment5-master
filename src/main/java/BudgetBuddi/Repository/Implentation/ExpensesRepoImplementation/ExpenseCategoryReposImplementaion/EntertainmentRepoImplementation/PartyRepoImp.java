package BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.EntertainmentRepoImplementation;

import BudgetBuddi.Domain.Expenses.ExpsenseCategories.Entertainment.Party;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.EntertainmentRepositories.PartyRepository;

import java.util.ArrayList;

public class PartyRepoImp implements PartyRepository
{
    private static PartyRepoImp repository =null;
    ArrayList<Party> parties;

    private PartyRepoImp()
    {
        this.parties = new  ArrayList<>();
    }

    public static PartyRepository getRepository()
    {
        if(repository == null) repository = new PartyRepoImp();
        return repository;
    }


    @Override
    public ArrayList<Party> getAll()
    {
        return this.parties;
    }

    @Override
    public Party create(Party party)
    {
        this.parties.add(party);
        return null;
    }

    @Override
    public Party update(Party party)
    {
        this.parties.set(1, null);
        return null;
    }

    @Override
    public void delete(String s)
    {
        this.parties.remove(parties);

    }

    @Override
    public Party read(String s)
    {
        {
            for (int i = 0; i < parties.size(); i++)
                System.out.println(parties.get(i));

            return null;
        }

    }
}//class
