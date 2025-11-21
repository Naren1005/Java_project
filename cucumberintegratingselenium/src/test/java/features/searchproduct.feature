
Feature: Search for a product
@Offerpage
Scenario: searching for an existing product
Given user is on the green cart landing page
When user searched with the short name <Name> and extracted the full name
Then  search in top deals with the shortname <Name>
And validte the name from product and offer page

Examples:
| Name |
| Tom |
| Beet |