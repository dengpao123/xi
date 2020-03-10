public class 二进制 {
    public int countBitDiff(int m, int n) {
        return  Integer.bitCount(m^n);
    }
}
