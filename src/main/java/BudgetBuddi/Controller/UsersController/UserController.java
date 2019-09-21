package BudgetBuddi.Controller.UsersController;


import BudgetBuddi.Domain.Users.User;
import BudgetBuddi.Service.Services.UserServices.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/User")
public class UserController
{
    @Autowired
    private UserService userService;

    @PostMapping("/create")
    @ResponseBody
    public User create(User user)
    {
        return userService.update(user);
    }//create

    @PostMapping("/update")
    @ResponseBody
    public User update(User user)
    {
        return userService.update(user);
    }//update

    @GetMapping("/delete{id}")
    @ResponseBody
    public void delete(@PathVariable String id)
    {
        userService.delete(id);
    }

    @GetMapping
    @ResponseBody

    public User read(@PathVariable String id)
    {
        return userService.read(id);
    }

    @GetMapping
    @ResponseBody
    public ArrayList<User> getAll()

    {
        return userService.getAll();
    }


}//class
