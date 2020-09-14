# Design Document: PokemonViewer
Tristan Palmer

Devin Williams

James Moore

## Introduction

This mobile friendly Pokémon web application allows the user to view all of the original Pokémon and their details such as:
- Evolutions 
- Height 
- Weight 
- Type

The user will also be able to search for a specific Pokémon so that instead of having to browse through a long list, the user can simply search, for instance, “Charizard” and receive the expected result of Charizard and the various details listed above. All of this can be done either at the comfort of ones home or on the go!

## Storyboard

## Functional Requirements

- **Requirement 1: Display Pokémon Details**
  - As a user, I want to be able to see the details associated with each Pokémon, so that I can look at a Pokémon and see accurate data.
  - **Examples**
    - ***Example #1***
      - **GIVEN** Pokémon data has been fetched from a JSON endpoint properly, 
      - **WHEN** I launch the application, 
      - **THEN** I should see details associated with the Pokémon.
    - ***Example #3***
      - **GIVEN** Pokémon data has not been fetched from a JSON endpoint properly, 
      - **WHEN** I launch the application, 
      - **THEN** a message and/or text should be displayed and logged to the console giving error information.

- **Requirement 2: Search Pokémon**
  - As a user, I want to be able to search for a specific Pokémon, so that I don't have to manually find a Pokémon.
  - **Examples**
    - ***Example #1***
      - **GIVEN** Pokémon data has been fetched from a JSON endpoint properly, 
      - **WHEN** I search for Charizard, 
      - **THEN** I should see a picture of Charizard in the list along with the details associated with Charizard.
    - ***Example #2***
      - **GIVEN** Pokémon data has been fetched from a JSON endpoint properly, 
      - **WHEN** I search for "burgers", 
      - **THEN** nothing should happen.
    - ***Example #3***
      - **GIVEN** Pokémon data has not been fetched from a JSON endpoint properly, 
      - **WHEN** I search for Golduck, 
      - **THEN** nothing should happen. 
    
  
## Class Diagram
![Pokemon-Viewer-Class-Diagram](https://user-images.githubusercontent.com/38698098/92495217-a60d6080-f1c4-11ea-9616-00bf2377f71a.png)
## Class Diagram Description

## JSON Schema

{  
  "type" : "object",  
  "properties" : {  
    "pokemonName" : {  
      "type" : "string"  
    },  
    "pokemonId" : {  
      "type" : "integer"  
    },  
    "pokemonWeight" : {  
      "type" : "integer"  
    },  
    "pokemonNum" : {  
      "type" : "integer"  
    },  
    "pokemonWeakness" : [  
      "type" : "string",  
      "type" : "string",  
      "type" : "string",  
      "type" : "string"  
    ],  
    "pokemonHeight" : {  
      "type" : "integer"  
    },  
    "pokemonType" : [  
      "type" : "string",  
      "type" : "string"  
    ]  
  }  
}  

## Team Members and Roles

UI Specialist: **James Moore**  
Business Logic/Persitence: **Devin Williams**  
DevOps/Product Owner/Scrum Master/GitHub Admin: **Tristan Palmer**  

## Project Link

To view our Github repository, click [here](https://github.com/palmertt-uc/PokemonViewer)

## Scrum/Kanban Board & Product Backlog

To view our product backlog and or the scrum/kanban board, navigate to the "Projects" section of our Github repository.

## Standup

- Sunday afternoons from 2:00 PM to 2:30 PM
- Click [here](https://teams.microsoft.com/l/meetup-join/19%3ameeting_YjJlYjA2YWEtMTY5NS00MTlhLWE5ZjYtNzZmNGE2YTE4ODJj%40thread.v2/0?context=%7b%22Tid%22%3a%22f5222e6c-5fc6-48eb-8f03-73db18203b63%22%2c%22Oid%22%3a%22f3fcca4c-d338-4a57-b92c-8f9d0d544b27%22%7d) to access our Microsoft Teams meeting room.
