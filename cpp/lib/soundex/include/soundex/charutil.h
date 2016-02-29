/**
 * @author andy
 * @copyright (c) 2016 andy. All rights reserved.
 */

#ifndef GHERKIN_DEMO_CHARUTIL_H_
#define GHERKIN_DEMO_CHARUTIL_H_

namespace gherkin_demo {

class CharUtil {

 public:
  static char lower(const char letter);
  static bool isVowel(const char letter);
};

} /* namespace gherkin_demo */

#endif  // GHERKIN_DEMO_CHARUTIL_H_
