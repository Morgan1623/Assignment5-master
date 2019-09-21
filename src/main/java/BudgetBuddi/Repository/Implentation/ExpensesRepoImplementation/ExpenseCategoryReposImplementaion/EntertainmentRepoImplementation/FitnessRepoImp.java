package BudgetBuddi.Repository.Implentation.ExpensesRepoImplementation.ExpenseCategoryReposImplementaion.EntertainmentRepoImplementation;

import BudgetBuddi.Factory.ExpenseCategoryFactory.EntertainmentFactories.FitnessFactory;
import BudgetBuddi.Repository.ExpenseRepositories.ExpenseCategoryRepositories.EntertainmentRepositories.FitnessRepository;

import java.util.ArrayList;

public class FitnessRepoImp implements FitnessRepository
{
    private static FitnessRepoImp repository =null;
    ArrayList<FitnessFactory> fitnesses;

    private FitnessRepoImp()
    {
        this.fitnesses = new  ArrayList<>();
    }

    public static FitnessRepoImp getRepository()
    {
        if(repository == null) repository = new FitnessRepoImp();
        return repository;
    }

    @Override
    public ArrayList<FitnessFactory> getAll()
    {
        return this.fitnesses;
    }

    @Override
    public FitnessFactory create(FitnessFactory fitness)
    {
        this.fitnesses.add(fitness);
        return null;
    }

    @Override
    public FitnessFactory update(FitnessFactory fitness)
    {
        this.fitnesses.set(1, null);
        return null;
    }

    @Override
    public void delete(String s)
    {
        this.fitnesses.remove(fitnesses);

    }

    @Override
    public FitnessFactory read(String s)
    {
        {
            for (int i = 0; i < fitnesses.size(); i++)
                System.out.println(fitnesses.get(i));

            return null;
        }

    }
}
