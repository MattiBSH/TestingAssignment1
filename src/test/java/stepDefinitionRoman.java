import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class stepDefinitionRoman {
    int numerals;
    String romanNumerals;

    @Given("I have {double} as number of numerals")
    public void i_have_as_number_of_numerals(Double double1) {
        // Write code here that turns the phrase above into concrete actions
        try{
            if(double1 != null) {
                numerals = double1.intValue();
            }
        }catch (Exception e){
            System.out.println(e);

        }
        //throw new io.cucumber.java.PendingException();
    }

    @When("I convert the number to roman numerals")
    public void i_convert_the_number_to_roman_numerals() {
        // Write code here that turns the phrase above into concrete actions
        RomanConverter romanConverter = new RomanConverter();
        romanNumerals = romanConverter.convertToRoman(numerals);
        //throw new io.cucumber.java.PendingException();
    }

    @Then("I should get XLII as roman numerals")
    public void i_should_get_xlii_as_roman_numerals() {
        // Write code here that turns the phrase above into concrete actions
        assertEquals("XLII", romanNumerals);
    }

    @Then("I should get I as roman numerals")
    public void i_should_get_i_as_roman_numerals() {
        // Write code here that turns the phrase above into concrete actions
        assertEquals("I", romanNumerals);
    }

    @Then("I should get XXI as roman numerals")
    public void i_should_get_xxi_as_roman_numerals() {
        // Write code here that turns the phrase above into concrete actions
        assertEquals("XXI", romanNumerals);
    }
}
