

Feature: Checkout the selected product
@Placeorder
Scenario: searching for an existing product and add to the cart
Given user is on the green cart landing page
When user searched with the short name "Tom" and extracted the full name
And add the no of quantity as "3" and add to cart
Then  user proceeds to checkout and validate the "Tom" item on the checkout page
And verify user is able to enter the promo code and place the order

