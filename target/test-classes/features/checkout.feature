Feature: Search and place the order for products

Scenario Outline: Search experience for product search in both home and offer pages


  Given User is on greencart landing page
  When user searched with shortname <VegName> and extracted actual name of product
  When increase the quantity of the product to <number> and add to cart
  And click on cart and proceed to checkout
  Then in checkout page make sure the correct product is displaying
  Then in checkout page Apply and Place Order buttons are displaying
  
  
  Examples:
  |VegName|number|
  |tom|3|
  #|beet|2|