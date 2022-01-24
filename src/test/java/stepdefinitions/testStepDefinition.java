package stepdefinitions;

import co.com.devco.automation.mobile.actions.Scroll;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.actors.OnStage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static userinterface.AppInterface.*;

public class testStepDefinition {


    @Before
    public void setUp() throws Exception {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("that {word} could concect with de drive")
    public void thatICouldConcectWithDeDrive(String actor) {
        theActorCalled(actor).attemptsTo(
                WaitUntil.the(TXT_USERNAME, isEnabled()).forNoMoreThan(5).seconds(),
                Enter.theValue("standard_user").into(TXT_USERNAME),
                Enter.theValue("secret_sauce").into(TXT_PASSWORD),
                Click.on(BTN_LOGIN));

    }

    @When("action")
    public void action() {
    }


    @Then("should assert")
    public void shouldAssert() {
    }
}
