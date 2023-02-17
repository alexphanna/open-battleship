public class Convert {
    public static byte[] toBytes(int row, int column) {
        return new byte[] { (byte)row, (byte)column };
    }
    public static byte toBytes(boolean temp) {
        if (temp) return 1;
        return 0;
    }
}