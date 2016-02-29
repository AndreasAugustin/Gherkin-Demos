/**
 * @author andy
 * @copyright (c) 2016 andy. All rights reserved.
 */

#ifndef GHERKIN_DEMO_STRINGUTIL_H_
#define GHERKIN_DEMO_STRINGUTIL_H_

#include <string>

namespace gherkin_demo {

class StringUtil {
 public:
  static std::string tail(const std::string &word);
  static std::string head(const std::string &word);
  static std::string upperFront(const std::string &word);
  static std::string zeroPad(
      const std::string &word, const size_t maxCodeLength);
};

} /* namespace gherkin_demo */

#endif  // GHERKIN_DEMO_STRINGUTIL_H_
