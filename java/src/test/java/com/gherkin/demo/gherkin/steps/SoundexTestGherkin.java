package com.gherkin.demo.gherkin.steps;

import com.gherkin.demo.Soundex;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by andy on 1/30/16.
 */
public class SoundexTestGherkin {

    private Soundex _soundex;
    private String _encoded;

    @Given("^A soundex instance$")
    public void aSoundexInstance() {
        _soundex = new Soundex();
    }

    @When("^i enter a word as \"([^\"]*)\"$")
    public void iEnterAWordAs(final String word) {
        _encoded = _soundex.encode(word);
    }

    @Then("^it is encoded to \"([^\"]*)\"$")
    public void itIsEncodedTo(final String encoded) {
        assertThat(_encoded, is(equalTo(encoded)));
    }
}
