import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class stepDefinitions {
    Integer celsius = -1;
    Double fahrenheit = 0.0;

    @Given("I have {int} celcius")
    public void i_have_celcius(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        try{
            if(int1 != null) {
                celsius = int1;
            }
        }catch (Exception e){
            System.out.println(e);
        }
        //throw new io.cucumber.java.PendingException();
    }

    @When("I convert the temperature to fahrenheit")
    public void i_convert_the_temperature_to_fahrenheit() {
        // Write code here that turns the phrase above into concrete actions
        CelsiusConverter celsiusConverter = new CelsiusConverter();

        fahrenheit = celsiusConverter.getFahreheit(celsius);
        //throw new io.cucumber.java.PendingException();
    }

    @Test
    @Then("I should get {double} fahrenheit")
    public void i_should_get_fahrenheit(Double double1) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(double1, fahrenheit, 0.01);
        //throw new io.cucumber.java.PendingException();
    }
}
