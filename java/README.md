JAVA demo project for gherkin
========

This project implements the soundex algorithm:
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
