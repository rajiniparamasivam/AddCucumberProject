Feature: Verifying the Adactin hotel select page

  Scenario Outline: Verifying Adactin Select Hotel and continue
    Given User is on Adactin login page
    When User enter the "<userName>","<password>"
    Then User should verify the after login success message "Hello Rajini47!"
    When User perform search hotel "<location>","<hotels>","<roomType>","<noOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childrenPerRoom>"
    Then User should verify after search hotel success message "Select Hotel"
    When User perform the select hotel and click the continue button
    Then User should verify after continue success message "Book A Hotel"

    Examples: 
      | userName | password | location | hotels      | roomType | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom |
      | Rajini47 | 7V1367   | Sydney   | Hotel Creek | Deluxe   |         2 | 24/04/2024  | 25/04/2024   |             3 |               1 |

  Scenario Outline: Verifying Adactin without Select Hotel and continue
    Given User is on Adactin login page
    When User enter the "<userName>","<password>"
    Then User should verify the after login success message "Hello Rajini47!"
    When User perform search hotel "<location>","<hotels>","<roomType>","<noOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childrenPerRoom>"
    Then User should verify after search hotel success message "Select Hotel"
    When User perform the without select hotel and click the continue button
    Then User should verify after continue error message "Please Select a Hotel"

    Examples: 
      | userName | password | location | hotels      | roomType | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom |
      | Rajini47 | 7V1367   | Sydney   | Hotel Creek | Deluxe   |         2 | 24/04/2024  | 25/04/2024   |             3 |               1 |
