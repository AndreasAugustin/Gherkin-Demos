/*
 * Copyright (c) 2016.
 */

package feature.demo;

import com.gherkin.demo.Soundex;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by andy on 1/30/16.
 */
public class SoundexStep {

    private Soundex _soundex;
    private String _encoded;

    @Given("^A soundex instance$")
    public void aSoundexInstance() {
        _soundex = new Soundex();
    }

    @When("^I enter a word as \"([^\"]*)\"$")
    public void iEnterAWordAs(final String word) {
        _encoded = _soundex.encode(word);
    }

    @Then("^it is encoded to \"([^\"]*)\"$")
    public void itIsEncodedTo(final String encoded) {
        assertThat(_encoded, is(equalTo(encoded)));
    }

    @When("^I enter the word \"([^\"]*)\"$")
    public void iEnterTheWordAs(final String word) {
        _encoded = _soundex.encode(word);
    }

    @Then("^the encoded length is equal to \"([^\"]*)\"$")
    public void theEncodedLengthIsEqualTo(final int length) {
        assertThat(_encoded.length(), is(equalTo(length)));
    }

    @When("^I enter the character \"([^\"]*)\"$")
    public void iEnterTheCharacter(final Character character) {
        _encoded = _soundex.encodedDigit(character);
    }

    @Then("^it is equal to other encoded character \"([^\"]*)\"$")
    public void theItIsEqualToOtherCharacter(final Character otherCharacter) {
        String otherEncodedDigit = _soundex.encodedDigit(otherCharacter);
        assertThat(_encoded, is(equalTo(otherEncodedDigit)));
    }

    @When("^I enter the lower case word \"([^\"]*)\"$")
    public void iEnterTheLowerCaseWord(final String word) {
        _encoded = _soundex.encode(word);
    }

    @Then("^the encoded first letter is equal to \"([^\"]*)\"$")
    public void theEncodedFirstLetterIsEqualTo(String encodedFirstLetter) {
        assertThat(_encoded, startsWith(encodedFirstLetter));
    }

    @When("^I enter the string \"([^\"]*)\"$")
    public void iEnterTheString(final String string) throws Throwable {
        _encoded = _soundex.encode(string);
    }

    @Then("^it is equal to other encoded string \"([^\"]*)\"$")
    public void itIsEqualToOtherEncodedString(final String otherString) throws Throwable {
        String _otherStringEncoded = _soundex.encode(otherString);
        assertThat(_encoded, is(equalTo(_otherStringEncoded)));
    }
}
