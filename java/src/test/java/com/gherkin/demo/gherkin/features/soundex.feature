Feature: Soundex algorithm

  Scenario Outline: A word is given to soundex algorithm
    Given A soundex instance
    When i enter a word as "<word>"
    Then it is encoded to "<encoded>"

    Examples:
      | word | encoded |
      | A    | A000    |
      | I    | I000    |
      | Ab   | A100    |


