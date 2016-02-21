from lettuce import step, world
from nose.tools import assert_equals

from src.mysoundex import MySoundex


@step("A soundex instance")
def given_a_soundex_instance(step):
    """
    :type step: lettuce.core.Step
    """
    world.soundex = MySoundex()
    print "given_a_soundex_instance ", "\n"


@step('I enter a word as "(?P<word>.+)"')
def when_i_enter_a_word_as(step, word):
    """
    :type step: lettuce.core.Step
    :type word: str
    """
    print "when_i_enter_a_word_as ", word, "\n"
    world.encoded = world.soundex.encode(word)


@step('it is encoded to "(?P<encoded>.+)"')
def then_it_is_encoded_to(step, encoded):
    """
    :type step: lettuce.core.Step
    :type encoded: str
    """
    print "then_it_is_encoded_to ", encoded,  "\n",  "\n"
    assert_equals(encoded, world.encoded)


@step('I enter the word \"([^\"]*)\"$')
def when_i_enter_the_word_as(step, word):
    """
    :type step: lettuce.core.Step
    """
    print "when_i_enter_the_word_as ", word, "\n"
    world.encoded = world.soundex.encode(word)


@step('the encoded length is equal to \"([^\"]*)\"$')
def then_the_encoded_length_is_equal_to(step, length):
    """
    :type step: lettuce.core.Step
    """
    print "then_the_encoded_length_is_equal_to ", length, "\n"
    assert_equals(length, len(world.encoded))


@step('I enter the lower case word \"([^\"]*)\"$')
def when_i_enter_the_lower_case_word(step, word):
    """
    :type step: lettuce.core.Step
    """
    print "when_i_enter_the_lower_case_word ", word, "\n"
    world.encoded = world.soundex.encode(word)


@step('the encoded first letter is equal to "([^\"]*)\"$')
def then_the_encoded_first_letter_is_equal_to(step, expect):
    """
    :type step: lettuce.core.Step
    """
    print "then_the_encoded_first_letter_is_equal_to", expect, "\n"
    assert_equals(expect, world.encoded[0])


@step('I enter the character "(?P<character>.+)"')
def when_i_enter_the_character(step, character):
    """
    :type step: lettuce.core.Step
    :type character: str
    """
    print "when_i_enter_the_character ", character, "\n"
    world.encoded = world.soundex.encodedDigit(character)


@step('it is equal to other encoded character "(?P<other_character>.+)"')
def then_it_is_equal_to_other_encoded_character(step, other_character):
    """
    :type step: lettuce.core.Step
    :type other_character: str
    """
    print "then_it_is_equal_to_other_encoded_character ", other_character, "\n"
    other_encoded_char = world.soundex.encodedDigit(other_character)
    assert_equals(world.expected, other_encoded_char)


@step('I enter the string "(?P<string>.+)"')
def when_i_enter_the_string(step, string):
    """
    :type step: lettuce.core.Step
    :type string: str
    """
    print "when_i_enter_the_string ", string, "\n"
    world.encoded = world.soundex.encode(string)


@step('it is equal to other encoded string "(?P<other_string>.+)"')
def then_it_is_equal_to_other_encoded_string(step, other_string):
    """
    :type step: lettuce.core.Step
    :type other_string: str
    """
    print "then_it_is_equal_to_other_encoded_string ", other_string, "\n"
    other_encoded_string = world.soundex.encode(other_string)
    assert_equals(world.encoded, other_encoded_string)

