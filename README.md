GHERKIN with CUCUMBER demos
========

[![Join the chat at https://gitter.im/AndreasAugustin/Gherkin-Demos](https://badges.gitter.im/AndreasAugustin/Gherkin-Demos.svg)](https://gitter.im/AndreasAugustin/Gherkin-Demos?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

This repository contains some demonstrations for gherkin in combination with cucumber in different programming languages, included as submodules.

	$ git submodule update --init

Every demo uses the same gherkin file for implementing the soundex algorithm:

```markdown
- keep the first letter and remove all further
    a, e, i, o, u, y, h, w
- Replace every consonant through numbers:
    - b, f, p, v: 1
    - c, g, j, k, q, s, x, z: 2
    - d, t: 3
    - l: 4
    - m, n: 5
    - r: 6
- If two following letters are replaced by the same number,
they should only replaced through one number.
Same rule applies if two letters with same related number are split by h or w.
This rule also applies for the first letter.
- Stop if the result is one letter and three numbers. Fill remaining with nulls.
```


## Status of Subprojects:

### Gherkin-Demos-coffee
[![Windows build status](https://ci.appveyor.com/api/projects/status/l7h3fhq2ur1vnayf?svg=true)](https://ci.appveyor.com/project/AndreasAugustin/gherkin-demos-coffee)

[![Linux build Status](https://travis-ci.org/AndreasAugustin/Gherkin-Demos-coffee.svg?branch=master)](https://travis-ci.org/AndreasAugustin/Gherkin-Demos-coffee)

### Gherkin-Demos-cpp

[![Build Status](https://travis-ci.org/AndreasAugustin/Gherkin-Demos-cpp.svg?branch=master)](https://travis-ci.org/AndreasAugustin/Gherkin-Demos-cpp)

### Gherkin-Demos-csharp

[![Build status](https://ci.appveyor.com/api/projects/status/firtfxmnlo0k16rn?svg=true)](https://ci.appveyor.com/project/AndreasAugustin/gherkin-demos-csharp)

### Gherkin-Demos-java

[![Build Status](https://travis-ci.org/AndreasAugustin/Gherkin-Demos-java.svg?branch=master)](https://travis-ci.org/AndreasAugustin/Gherkin-Demos-java)

### Gherkin-Demos-mono

[![Build Status](https://travis-ci.org/AndreasAugustin/Gherkin-Demos-mono.svg?branch=master)](https://travis-ci.org/AndreasAugustin/Gherkin-Demos-mono)

### Gherkin-Demos-python

[![Build Status](https://travis-ci.org/AndreasAugustin/Gherkin-Demos-python.svg?branch=master)](https://travis-ci.org/AndreasAugustin/Gherkin-Demos-python)

### Gherkin-Demos-ruby

[![Windows build status](https://ci.appveyor.com/api/projects/status/58panoqw87wdlsug?svg=true)](https://ci.appveyor.com/project/AndreasAugustin/gherkin-demos-ruby)

[![Linux build Status](https://travis-ci.org/AndreasAugustin/Gherkin-Demos-ruby.svg?branch=master)](https://travis-ci.org/AndreasAugustin/Gherkin-Demos-ruby)


