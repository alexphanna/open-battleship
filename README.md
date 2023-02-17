# Open-Battleship
## Requirements
- Ships may be placed beside each other, but may NOT overlap
- Each player has five ships (2, 3, 3, 4, 5)
- Each player takes one shot per turn (no streaks)

## Implementation
### Receiving

```java
byte[] buffer = new byte[512];
packet = new DatagramPacket(buffer, buffer.length);
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
