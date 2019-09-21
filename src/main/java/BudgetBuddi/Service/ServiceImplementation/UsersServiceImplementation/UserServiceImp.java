package BudgetBuddi.Service.ServiceImplementation.UsersServiceImplementation;

import BudgetBuddi.Domain.Users.User;
import BudgetBuddi.Repository.Implentation.UsersRepoImplementation.UserRepoImp;
import BudgetBuddi.Repository.UsersRepository.UserRepository;
import BudgetBuddi.Service.Services.UserServices.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class UserServiceImp implements UserService
{
    private static UserServiceImp service =null;
    private UserRepository repository;

    private UserServiceImp()
    {
        this.repository= UserRepoImp.getRepository();
    }

    public static UserServiceImp getService()
    {
        if (service == null) service = new UserServiceImp();
        return service;
    }


    @Override
    public ArrayList<User> getAll()
    {
        return this.repository.getAll();
    }

    @Override
    public User create(User user)
    {
        return this.create(user);
    }

    @Override
    public User update(User user)
    {
        return this.update(user);
    }

    @Override
    public void delete(String s)
    {
        this.repository.delete(s);

    }

    @Override
    public User read(String s)
    {
        return this.repository.read(s);
    }
}
