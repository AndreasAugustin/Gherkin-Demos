/**
 * @author andy
 * @copyright (c) 2016 andy. All rights reserved.
 */

#include "soundex/stringutil.h"

namespace gherkin_demo {

std::string StringUtil::tail(const std::string &word) {
  return word.substr(1);
}

std::string StringUtil::head(const std::string &word) {
  return word.substr(0, 1);
}

std::string StringUtil::upperFront(const std::string &word) {
  return std::string(1, std::toupper(static_cast<unsigned char>(word.front())));
}
std::string StringUtil::zeroPad(
    const std::string &word,
    const size_t maxCodeLength) {
  auto zerosNeeded = maxCodeLength - word.length();
  return word + std::string(zerosNeeded, '0');
}

} /* namespace gherkin_demo */


