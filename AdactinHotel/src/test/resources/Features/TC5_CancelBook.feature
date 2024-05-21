Feature: Verifying the Adactin hotel Cancel page

  Scenario Outline: Verifying Adactin hotel cancel Booking by using booked order id
    Given User is on Adactin login page
    When User enter the "<userName>","<password>"
    Then User should verify the after login success message "Hello Rajini47!"
    When User perform search hotel "<location>","<hotels>","<roomType>","<noOfRooms>","<checkInDate>","<checkOutDate>","<adultsPerRoom>" and "<childrenPerRoom>"
    Then User should verify after search hotel success message "Select Hotel"
    When User perform the select hotel and click the continue button
    Then User should verify after continue success message "Book A Hotel"
    When User perform the "<firstName>","<lastName>" and "<billingAddress>"
      | creditCardNo     | creditCardType | expiryMonth | expiryYear | cVVNumber |
      | 8789876545678765 | VISA           |           1 |       2022 |      9875 |
      | 7689875435678906 | AMEX           |           2 |       2022 |      9376 |
      | 6689815535678906 | MAST           |           1 |       2022 |      1878 |
      | 8689815535678906 | OTHR           |           5 |       2022 |      4555 |
    Then User should verify after booking hotel success message "Booking Confirmation" and save the order id
    When User perform the cancel Booking
    Then User should verify after cancel Booking success message "The booking has been cancelled."

    Examples: 
      | userName | password | location | hotels      | roomType | noOfRooms | checkInDate | checkOutDate | adultsPerRoom | childrenPerRoom | firstName | lastName    | billingAddress |
      | Rajini47 | 7V1367   | Sydney   | Hotel Creek | Deluxe   |         2 | 24/04/2024  | 25/04/2024   |             3 |               1 | Rajini    | paramasivam | Thuraipakkam   |

  Scenario Outline: Verifying Adactin hotel cancel Booking by using exiting order id
    Given User is on Adactin login page
    When User enter the "<userName>","<password>"
    Then User should verify the after login success message "Hello Rajini47!"
    When User perform cancel Booking using exiting orderId "<orderId>"
    Then User should verify after cancel Booking success message "The booking has been cancelled."

    Examples: 
      | userName | password | orderId    |
      | Rajini47 | 7V1367   | O9RH40882T |
