/*
 * Copyright (c) 2016.
 */

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
    private String _encodedDigit;

    @Given("^A soundex instance$")
    public void aSoundexInstance() {
        _soundex = new Soundex();
    }

    @When("^I enter a word as \"([^\"]*)\"$")
    public void iEnterAWordAs(final String word) {
        encode(word);
    }

    @Then("^it is encoded to \"([^\"]*)\"$")
    public void itIsEncodedTo(final String encoded) {
        assertEncoding(encoded);
    }

    @When("^I enter the word as \"([^\"]*)\"$")
    public void iEnterTheWordAs(final String word) {
        encode(word);
    }

    @Then("^the encoded length is equal to \"([^\"]*)\"$")
    public void theEncodedLengthIsEqualTo(final int length) {
        assertThat(_encoded.length(), is(equalTo(length)));
    }

    private void encode(final String word) {
        _encoded = _soundex.encode(word);
    }

    private void assertEncoding(final String encoded) {
        assertThat(encoded, is(equalTo(_encoded)));
    }

    @When("^I enter the character \"([^\"]*)\"$")
    public void iEnterTheCharacter(final Character character) {
        _encodedDigit = _soundex.encodedDigit(character);
    }

    @Then("^the it is equal to other character \"([^\"]*)\"$")
    public void theItIsEqualToOtherCharacter(final Character otherCharacter) {
        String otherEncodedDigit = _soundex.encodedDigit(otherCharacter);
        assertThat(otherEncodedDigit, is(equalTo(_encodedDigit)));
    }
}
