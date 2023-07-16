Feature: Search and place the order for products


@OffersPage
Scenario Outline: Search experience for product search in both home and offer pages


  Given User is on greencart landing page
  When user searched with shortname <VegName> and extracted actual name of product
  Then user searched for <VegName> shortname in offers page to check if product exist
  And Validate if the landing page product name and offer page product is same
  
  Examples:
  |VegName|
  |tom|
  |beet|