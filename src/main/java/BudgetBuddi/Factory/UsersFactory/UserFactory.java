package BudgetBuddi.Factory.UsersFactory;

import BudgetBuddi.Domain.Users.User;

public class UserFactory
{
    public static User getUser (String userName, String email, String name, String password)
    {
        return new User.Builder()
                .userName(userName)
                .email(email)
                .name(name)
                .password(password)
                .build();


    }

}
