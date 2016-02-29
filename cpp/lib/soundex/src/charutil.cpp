/**
 * @author andy
 * @copyright (c) 2016 andy. All rights reserved.
 */

#include "soundex/charutil.h"

#include <string>

namespace gherkin_demo {

char CharUtil::lower(const char letter) {
  return std::tolower(static_cast<unsigned char>(letter));
}

bool CharUtil::isVowel(const char letter) {
  static std::string vowels("aeiouy");
  return vowels.find(lower(letter)) != std::string::npos;
}

} /* namespace gherkin_demo */

