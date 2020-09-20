@Testfeature
Feature: Assignment1

  Scenario Outline: Verifying Registration scenario
    Given Page for navigation is "<url>" for "<browser>"
    When clicked on registration
    Then Enter the details for registration like "<FIRSTNAME>" "<LAST NAME>" "<EMAIL>" "<PASSWORD>" "<CONFIRM PASSWORD>" "<BIRTHDATE-month>" "<BIRTHDATE-year>" "<ZIP CODE>"

    Examples:
      | url                              | browser | FIRSTNAME | LAST NAME | EMAIL              | PASSWORD | CONFIRM PASSWORD | BIRTHDATE-month | BIRTHDATE-year | ZIP CODE |
      | https://www.gillette.co.in/en-in | chrome  | manasa    | g         | manasagp@gmail.com | Spark123 | Spark123         | 10              | 1997           | 500010   |
      #| https://www.gillette.de/ | chrome  | manasa           | g         | manasa@gmail.com | Spark123 | Spark123         |                 |                |          |
      #| https://www.gillette.fr/ | chrome  | manasa@gmail.com | Spark123  | Spark123         |          |                  |                 |                |          |

  Scenario Outline: Verifying Login scenario
    Given Page for navigation
    When clicked on login
    Then Enter the details for login like  "<EMAIL>" "<PASSWORD>"

    Examples:
      | EMAIL              | PASSWORD |
      | manasagp@gmail.com | Spark123 |


  Scenario Outline: Verifying Forgot Password scenario and Password Reset
    Given Page for navigation
    When clicked on Forgot password
    And Enter the details for password reset like  "<EMAIL>"
    Then clicked on password reset

    Examples:
      | EMAIL              |
      | manasagp@gmail.com |