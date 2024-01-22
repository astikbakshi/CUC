import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

    String name;

    @Given("user passes a name as a parameter")
    public void givenStep() {
    }

    @When( "user sends string}")
    public void whenStep(String input) {
        name = input;
    }

    @Then("user is able to see Hello world!")
    public void thenHelloWorld() {
        String greeting = "Hello " + name + "!";
    }

    @Then("user is able to see Hello string")
    public void thenHelloCustomName(String customName) {
        String greeting = "Hello " + customName + "!";
    }
}
