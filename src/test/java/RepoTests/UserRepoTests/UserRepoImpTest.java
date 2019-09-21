package RepoTests.UserRepoTests;

import BudgetBuddi.Domain.Users.User;
import BudgetBuddi.Repository.Implentation.UsersRepoImplementation.UserRepoImp;
import BudgetBuddi.Repository.UsersRepository.UserRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class UserRepoImpTest {

    private UserRepository repository;

    @Before
    public void setUp() throws Exception
    {
        this.repository = UserRepoImp.getRepository();
    }

    @Test
    public void getRepository() {
    }

    @Test
    public void getAll()
    {
        ArrayList<User> users = this.repository.getAll();
        Assert.assertEquals(1, users.size());
    }

    @Test
    public void create()
    {
        this.repository.create(null);
        Assert.assertEquals(null, null);
    }

    @Test
    public void update() {
    }

    @Test
    public void delete()
    {
        this.repository.delete(null);
        Assert.assertEquals(null, null);
    }

    @Test
    public void read() {
    }
}