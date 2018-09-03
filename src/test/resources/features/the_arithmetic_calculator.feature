Feature: The arithmetic calculator

  Scenario: The addition operation
    Given Bugs Bunny opens the arithmetic calculator
    When he perform the arithmetic operation 2 + 0
    Then he should see the result 2

  Scenario Outline: The addition operation 2
    Given Bugs Bunny opens the arithmetic calculator
    When he perform the arithmetic operation <operation>
    Then he should see the result <result>
    Examples:
      | operation | result |
      | 2 + 2     | 2      |
      | 2 + 1     | 2      |
      | 2 + 7     | 2      |