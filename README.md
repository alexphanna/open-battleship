# Open-Battleship
## Requirements
- Ships may be placed beside each other, but may NOT overlap
- Each player has five ships (2, 3, 3, 4, 5)
- Each player takes one shot per turn (no streaks)

## How it works
After arranging their ships, player 1 sends their targeted square (e.g.: A4, C6, F2) encoded in bytes to the opponent and waits to recieve a response. Player 2 recieves their targeted sqaure and sends back a boolean of whether a ship is on the targeted square encoded in bytes. The same steps happen again, but the order swaps and the player 2 sends their targeted square to player 1.

| Value  | Bytes  |
| ------ | ------ |
| false  | 0      |
|  true  | 1      |
| (0, 0) | {0, 0} |

## Basic Implementation
### Receiving

```java
byte[] buffer = new byte[512];
DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
socket.receive(packet); // pauses until recieved
System.out.println(new String(buffer, 0, buffer.length));
```

### Sending

```java
String str = "hello world";
byte[] buffer = str.getBytes();
DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address);
socket.send(packet);
```
## Contributions
- [Alex Hanna](https://github.com/alexphanna)
- [Brayden Hanna](https://github.com/braydenphanna)
- [Edward Akselrud](https://github.com/Efaks)
- [Matt Romano](https://github.com/MatthewDRomano)
