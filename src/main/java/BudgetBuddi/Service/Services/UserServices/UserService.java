package BudgetBuddi.Service.Services.UserServices;

import BudgetBuddi.Domain.Users.User;
import BudgetBuddi.Service.IServices;

import java.util.ArrayList;

public interface UserService extends IServices<User, String>
{
    ArrayList<User> getAll();
}
