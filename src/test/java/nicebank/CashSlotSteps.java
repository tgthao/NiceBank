package nicebank;

import cucumber.api.java.en.Given;
import org.junit.Assert;
import support.KnowsTheCashSlot;

public class CashSlotSteps {

    CashSlot cashSlot;

    public CashSlotSteps(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    @Given("^\\$(\\d+) should be dispensed$")
    public void $ShouldBeDispensed(int dollars) throws Throwable {
        Assert.assertEquals("Incorrect amount dispensed -", dollars,
                cashSlot.getContents());
    }
}