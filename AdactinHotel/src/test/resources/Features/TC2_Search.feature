Feature: Verifying Adactin Search Hotel details

  Scenario Outline: Verifying Adactin Serach Hotel by select all fileds
    Given User is on Adactin login page
    When User enter the "<userName>","<password>"
    Then User should verify the after login success message "Hello Rajini47!"
    When User perform search hotel "<location>","<hotels>","<roomType>","<noOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childrenPerRoom>"
    Then User should verify after search hotel success message "Select Hotel"

    Examples: 
      | userName | password | location | hotels      | roomType | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom |
      | Rajini47 | 7V1367   | Sydney   | Hotel Creek | Deluxe   |         2 | 24/04/2024  | 25/04/2024   |             3 |               1 |

  Scenario Outline: Verifying Adactin Serach Hotel by select with only mandatory fields
    Given User is on Adactin login page
    When User enter the "<userName>","<password>"
    Then User should verify the after login success message "Hello Rajini47!"
    When User perform search hotel by selecting mandatory fields only "<location>","<noOfRooms>","<checkInDate>","<checkOutDate>" and "<adultsPerRoom>"
    Then User should verify after search hotel success message "Select Hotel"

    Examples: 
      | userName | password | location | noOfRooms | checkInDate | checkOutDate | adultsPerRoom |
      | Rajini47 | 7V1367   | London   |         1 | 24/04/2023  | 25/04/2023   |             1 |

  Scenario Outline: Verifying Adactin search hotel by date checking
    Given User is on Adactin login page
    When User enter the "<userName>","<password>"
    Then User should verify the after login success message "Hello Rajini47!"
    When User perform search hotel "<location>","<hotels>","<roomType>","<noOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childrenPerRoom>"
    Then User should verify after search hotel date error message  "Check-In Date shall be before than Check-Out Date" , "Check-Out Date shall be after than Check-In Date"

    Examples: 
      | userName | password | location | hotels      | roomType | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom |
      | Rajini47 | 7V1367   | Sydney   | Hotel Creek | Deluxe   |         2 | 11/02/2025  | 12/02/2023   |             3 |               1 |

  Scenario Outline: Verifying Adactin Serach Hotel without Enter any fileds
    Given User is on Adactin login page
    When User enter the "<userName>","<password>"
    Then User should verify the after login success message "Hello Rajini47!"
    When User should click search button without Enter any field
    Then User should verify error message after search hotel in location field "Please Select a Location"

    Examples: 
      | userName | password |
      | Rajini47 | 7V1367   |
