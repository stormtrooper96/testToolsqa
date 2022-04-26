Feature: Home page

  Scenario Outline: Open Home page for tools qa page
    Given Actor is open url "<url>"
    When he looks up Start Elements

    Examples:
      | url                 |  |
      | https://demoqa.com/ |  |
