#Author: manco.5@hotmail.com
@tag
Feature: buy in alkomprar
  As a Web User  
  I want to buy a product into alkomprar web store
  To should see product in the shopping car

  @serchProduct @smokeTest
  Scenario: adds the product to the shopping car
    Given that Stiven wants search a product in alkomprar page
    When he enters the product
      | product |
      | huawei  |
    When he adds the product number
      | number |
      |      3 |
    Then he should see the results page
