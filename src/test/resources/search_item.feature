#language:en 

@searchItem
Feature: Search item

    Background:
        Given that it is on the homepage of Mercado Livre

    Scenario: Search by item
        When I search for "Golf"
        Then I view items according to my search
@run
    Scenario: Item search filter by state
        When I search for "Golf"
        And filter by state of "São Paulo"
        Then I view items according to my filtered search