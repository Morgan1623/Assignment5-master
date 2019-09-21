package BudgetBuddi.Repository.UsersRepository;

import BudgetBuddi.Domain.Users.User;
import BudgetBuddi.Repository.ImplementationRepository;

import java.util.ArrayList;

public interface UserRepository extends ImplementationRepository<User,String>
{
    ArrayList<User> getAll();
}//class
