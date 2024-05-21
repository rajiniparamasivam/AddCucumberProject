Feature: Verifying Adactin hotel login page

  Scenario Outline: Verifying Adactin hotel valid login page
    Given User is on Adactin login page
    When User enter the "<userName>","<password>"
    Then User should verify the after login success message "Hello Rajini47!"

    Examples: 
      | userName | password |
      | Rajini47 | 7V1367   |

  Scenario Outline: Verifying Adactin hotel login user Enter
    Given User is on Adactin login page
    When User enter the "<userName>","<password>" with Enter key
    Then User should verify the after login success message "Hello Rajini47!"

    Examples: 
      | userName | password |
      | Rajini47 | 7V1367   |

  Scenario Outline: Verifying Adactin hotel Invalid login page
    Given User is on Adactin login page
    When User enter the "<userName>","<password>"
    Then User should verify the after login with Invalid credential error message contains "Invalid Login details or Your Password might have expired. "
    Examples: 
      | userName | password |
      | Rajini47 | @9898    |
