Feature: Elements page

  Background: The Actor is on page
    Given Actor is open url "https://demoqa.com"
    When he looks up Start Elements

  Scenario Outline:Open Home page for tools qa page
    Given Actor Go to elements page
    When he looks up Elements Menu Right
    Then Press Button Web Tables
    Then Press Button Add register
    Then Send data to register: firstname "<firstname>" lastname "<lastName>" userEmail "<userEmail>"  age "<age>" salary <salary>  departament "<department>"

    Examples:
      | firstname | lastName | userEmail         | age | salary   | department   | pagina   |
      | andres    | perez    | andres@mnnana.com | 15  | 1500000  | cartagena    | aaa.com  |
      | camila    | perez    | perez@aaa.com     | 25  | 15645562 | cundinamarca | aaaa.com |