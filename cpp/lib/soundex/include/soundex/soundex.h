/**
 * @author andy
 * @copyright (c) 2016 andy. All rights reserved.
 */

#ifndef CPP_LIB_SOUNDEX_SOUNDEX_H_
#define CPP_LIB_SOUNDEX_SOUNDEX_H_

#include <string>

namespace gherkin_demo {

class Soundex {
 public:
  std::string encode(const std::string &word) const;

  std::string encodedDigit(const char character) const;

 private:
  std::string encodedDigits(const std::string &word) const;

  void encodeHead(std::string *encoding, const std::string &word) const;

  void encodeTail(std::string *encoding, const std::string &word) const;

  void encodeLetter(std::string *encoding, char letter, char lastLetter) const;

  std::string lastDigit(const std::string &encoding) const;

  bool isComplete(const std::string &encoding) const;

  const std::string m_notADigit{"*"};
  static const size_t s_MaxCodeLength{4};
};

} /* namespace gherkin_demo */

#endif  // CPP_LIB_SOUNDEX_SOUNDEX_H_
