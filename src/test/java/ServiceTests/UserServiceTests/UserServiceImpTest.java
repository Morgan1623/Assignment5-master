package ServiceTests.UserServiceTests;

import BudgetBuddi.Domain.Users.User;
import BudgetBuddi.Factory.UsersFactory.UserFactory;
import BudgetBuddi.Repository.Implentation.UsersRepoImplementation.UserRepoImp;
import BudgetBuddi.Repository.UsersRepository.UserRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class UserServiceImpTest
{
    private UserRepository repoImp;
    private User user;

    private User getSaved()
    {
        return this.repoImp.getAll().iterator().next();
    }

    @Before
    public void setUp() throws Exception
    {
        this.repoImp = UserRepoImp.getRepository();
        this.user = UserFactory.getUser("", "", "", "");


    }

    @Test
    public void getAll()
    {
        ArrayList<User> payments = this.repoImp.getAll();

        System.out.println(payments);

    }

    @Test
    public void create()
    {
        User created = this.repoImp.create(this.user);
        System.out.println("Created =" + created);
    }

    @Test
    public void update()
    {
        String newPayment = "";

        User updated = new User.Builder().email("").build();
        this.repoImp.update(updated);
        System.out.println("Updated" + updated);
        Assert.assertSame("", "");
    }

    @Test
    public void delete()
    {
        User saved = getSaved();
        this.repoImp.delete(saved.getEmail());
    }

    @Test
    public void read()
    {
        User saved = getSaved();
        User read = this.repoImp.read(saved.getEmail());
    }
}