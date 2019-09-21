package BudgetBuddi.Controller.ExpensesController.ExpenseCategoryController.CarController;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PetrolControllerTest
{
    @Autowired
    private TestRestTemplate restTemplate;

    private String baseURL = "http://localhost:8080/petrol";

    @Test
    public void create()
    {
        ResponseEntity responseEntity = restTemplate.withBasicAuth("admin", "admi123")
                .postForEntity(baseURL + "/create/unleaded",null, String.class);
        System.out.println(responseEntity.getBody());
        assertEquals(HttpStatus.OK,responseEntity.getStatusCode());
    }

    @Test
    public void update()
    {
        ResponseEntity responseEntity = restTemplate.withBasicAuth("admin", "admi123")
                .postForEntity(baseURL + "/update/unleaded",null, String.class);
        System.out.println(responseEntity.getBody());
        assertEquals(HttpStatus.OK,responseEntity.getStatusCode());
    }

    @Test
    public void delete()
    {
        ResponseEntity responseEntity = restTemplate.withBasicAuth("admin", "admi123")
                .postForEntity(baseURL + "/delete/outsurance",null, String.class);
        System.out.println(responseEntity.getBody());
        assertEquals(HttpStatus.NOT_FOUND,responseEntity.getStatusCode());
    }

    @Test
    public void read()
    {
        ResponseEntity responseEntity = restTemplate.withBasicAuth("admin", "admi123")
                .postForEntity(baseURL + "/read/unleaded",null, String.class);
        System.out.println(responseEntity.getBody());
        assertEquals(HttpStatus.OK,responseEntity.getStatusCode());
    }

    @Test
    public void getAll()
    {
        ResponseEntity<String> responseEntity= restTemplate.withBasicAuth("user", "user")
                .getForEntity(baseURL + "/getall", String.class);
        System.out.println(responseEntity.getBody());
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
    }
}