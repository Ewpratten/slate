# slate
Text-based aadventure game for ICS4U

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