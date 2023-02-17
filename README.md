# Open-Battleship
## Requirements
- Ships may be placed beside each other, but may NOT overlap
- Each player has five ships (2, 3, 3, 4, 5)
- Each player takes one shot per turn (no streaks)

## Implementation
### Server
#### Recieve

```
byte[] buffer = new byte[512];
sender = new DatagramPacket(buffer, buffer.length);
socket.receive(sender);
```
