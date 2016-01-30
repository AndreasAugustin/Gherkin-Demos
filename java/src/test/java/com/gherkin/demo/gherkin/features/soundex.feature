Feature: Soundex algorithm

  Scenario Outline: A word is given to soundex algorithm
    Given A soundex instance
    When I enter a word as "<word>"
    Then it is encoded to "<encoded>"

    # the word is the given word
    # encoded is the expected encoded value
    Examples:
      | word        | encoded |
      | A           | A000    |
      | I           | I000    |
      | Ab          | A100    |
      | Ac          | A200    |
      | Ad          | A300    |
      | Ax          | A200    |
      | A#          | A000    |
      | Acdl        | A234    |
      | Baeiouhycdl | B234    |

  Scenario: A word is given to soundex algorithm
    Given A soundex instance
    When I enter the word as "Dcdlb"
    Then the encoded length is equal to "4u"