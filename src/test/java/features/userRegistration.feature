Feature: User Registration
  Scenario Outline: user can register using valid email
    Given user in the home page
    When  user click on signIn button
    When  enter valid "<email>" and click on create account
    When  enter "<firstname>" & "<lastname>" & "<password>" and "<address>"
    When  enter  "<city>" & "<postCode>" & "<mobile>" and "<refAddress>"
    Then  user register successfully
    When  user click on women Tab page
    When  user choose item and add it to cart
    When  user complete check out
    Then  user confirm order



  Examples:

    | email  |firstname | lastname |  password | address | city | postCode | mobile | refAddress|
    |testsIo3778@gmail.com| mohamed | hassan |  123456#14 | Somoha | alex | 11145 |01236415315| kelobatra |



