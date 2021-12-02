Feature: SmartBear Login
  Scenario: Navigate to SmartBear and login
     Given  chrome is launched
     When the user enter username password and click login
     When the user select view all orders
     When the user select view all products
     When the user select order
     Then the user click logout

