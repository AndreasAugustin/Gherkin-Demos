/**
 * @author andy
 * @copyright (c) 2016 andy. All rights reserved.
 */

#include <gtest/gtest.h>
#include <cucumber-cpp/defs.hpp>

#include <iostream>
#include <string>
#include <map>

#include "soundex/soundex.h"

namespace gherkin_demo {
namespace cucumber_test {


using cucumber::ScenarioScope;

struct SoundexCtx {
  Soundex soundex;
  std::string encoded;
};

GIVEN("^A soundex instance") {
  ScenarioScope<SoundexCtx> context;
}

WHEN("^I enter a word as (.+)$") {
  REGEX_PARAM(std::string, word);
  ScenarioScope<SoundexCtx> context;
  context->encoded = context->soundex.encode(word);
}

THEN("^it is encoded to (.*)$") {
  REGEX_PARAM(std::string, encoded);
  ScenarioScope<SoundexCtx> context;

  EXPECT_EQ(encoded, context->encoded);
}

WHEN("^I enter the word (.*)$") {
  REGEX_PARAM(std::string, word);
  ScenarioScope<SoundexCtx> context;
  context->encoded = context->soundex.encode(word);
}

THEN("^the encoded length is equal to (.*)$") {
  REGEX_PARAM(int, length);
  ScenarioScope<SoundexCtx> context;

  EXPECT_EQ(length, context->encoded.length());
}

WHEN("^I enter the lower case word (.*)$") {
  REGEX_PARAM(std::string, lowerCaseWord);
  ScenarioScope<SoundexCtx> context;
  context->encoded = context->soundex.encode(lowerCaseWord);
}

THEN("^the encoded first letter is equal to (.*)$") {
  REGEX_PARAM(char, expectedFirstLetter);
  ScenarioScope<SoundexCtx> context;

  EXPECT_EQ(expectedFirstLetter, context->encoded.at(0));
}

WHEN("^I enter the character (.*)$") {
  REGEX_PARAM(char, character);
  ScenarioScope<SoundexCtx> context;
  context->encoded = context->soundex.encodedDigit(character);
}

THEN("^it is equal to other encoded character (.*)$") {
  REGEX_PARAM(char, other_character);
  ScenarioScope<SoundexCtx> context;

  std::string expected = context->soundex.encodedDigit(other_character);
  EXPECT_EQ(expected, context->encoded);
}

WHEN("^I enter the string (.*)$") {
  REGEX_PARAM(std::string, string);
  ScenarioScope<SoundexCtx> context;
  auto result = context->soundex.encode(string);
  context->encoded = result;
}

THEN("^it is equal to other encoded string (.*)$") {
  REGEX_PARAM(std::string, other_string);
  ScenarioScope<SoundexCtx> context;

  std::string expected = context->soundex.encode(other_string);
  EXPECT_EQ(expected, context->encoded);
}

} /* cucumber_test */
} /* gherkin_demo */
