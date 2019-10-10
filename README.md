# *SLATE* : Infiltration
A text-based adventure game by: @mosefrey085, @exvacuum, and @ewpratten

## Software design

### Command parsing
Slate's command parsing system is based off [ANTLR v4](), and follows this general flow:
```
-- User input
|
+-> Lexical analysis & Parsing
|
+-> Tokenization
|
+-> Command processing
```

This system allows us to define our own "control language" with it's own grammar and syntax for user inputs during gameplay. 

### Game design

## Notes
 - Random gen map
 - Enter, grab item, leave
 - Player can only move to new rooms (no backtracking. Just as an interesting mechanic)

## Components
 - Room
   - May contain items
   - May contain mysteries
   - Contains doorways to other rooms
 - Mystery
   - Anything that requires a key to open and contains an inventory
 - Map (Collection of rooms)
 - Inventory
   - Contains items
 - Guard
   - Someone you don't want to see
 - Item
   - Something you can pick up and use
