package BudgetBuddi.Repository.Implentation.UsersRepoImplementation;

import BudgetBuddi.Domain.Users.User;
import BudgetBuddi.Repository.UsersRepository.UserRepository;

import java.util.ArrayList;

public class UserRepoImp implements UserRepository
{
    private static UserRepoImp repository =null;
    ArrayList<User> users;

    private UserRepoImp()
    {
        this.users = new  ArrayList<>();
    }

    public static UserRepository getRepository()
    {
        if(repository == null) repository = new UserRepoImp();
        return repository;
    }

    @Override
    public ArrayList<User> getAll()
    {
        return this.users;
    }

    @Override
    public User create(User user)
    {
        this.users.add(user);
        return null;
    }

    @Override
    public User update(User user)
    {
        this.users.set(1, null);
        return null;
    }

    @Override
    public void delete(String s)
    {
        this.users.remove(users);

    }

    @Override
    public User read(String s)
    {
        for (int i = 0; i < users.size(); i++)
            System.out.println(users.get(i));
        return null;
    }
}//class
