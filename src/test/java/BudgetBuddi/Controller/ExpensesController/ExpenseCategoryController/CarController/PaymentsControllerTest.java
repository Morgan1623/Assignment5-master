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
public class PaymentsControllerTest
{
    @Autowired
    private TestRestTemplate restTemplate;

    private String baseURL = "http://localhost:8080/insurance";


    @Test
    public void createPayment()
    {
        ResponseEntity responseEntity = restTemplate.withBasicAuth("admin", "admi123")
                .postForEntity(baseURL + "/create/outsurance",null, String.class);
        System.out.println(responseEntity.getBody());
        assertEquals(HttpStatus.OK,responseEntity.getStatusCode());
    }

    @Test
    public void updatePayment()
    {
        ResponseEntity responseEntity = restTemplate.withBasicAuth("admin", "admi123")
                .postForEntity(baseURL + "/update/outsurance",null, String.class);
        System.out.println(responseEntity.getBody());
        assertEquals(HttpStatus.OK,responseEntity.getStatusCode());
    }

    @Test
    public void deletePayment()
    {
        ResponseEntity responseEntity = restTemplate.withBasicAuth("admin", "admi123")
                .postForEntity(baseURL + "/delete/outsurance",null, String.class);
        System.out.println(responseEntity.getBody());
        assertEquals(HttpStatus.NOT_FOUND,responseEntity.getStatusCode());
    }

    @Test
    public void readPayment()
    {
        ResponseEntity responseEntity = restTemplate.withBasicAuth("admin", "admi123")
                .postForEntity(baseURL + "/read/outsurance",null, String.class);
        System.out.println(responseEntity.getBody());
        assertEquals(HttpStatus.OK,responseEntity.getStatusCode());
    }

    @Test
    public void getAllPayments()
    {
        ResponseEntity<String> responseEntity= restTemplate.withBasicAuth("user", "user")
                .getForEntity(baseURL + "/getall", String.class);
        System.out.println(responseEntity.getBody());
        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
    }
}