public class Solution {
    public static void main(String[] args) {
        System.out.println(rectangleRotation(5, 8));
    }
    static int rectangleRotation(final int a, final int b) {
        int a1 = (int)(a / Math.sqrt(2)) * 2;
        int b1 = (int)(b / Math.sqrt(2)) * 2;
        int d;
        if ((a1 / 2) % 2 == (b1 / 2) % 2)
            d = 1;
        else
            d = 0;
        int c = (a1 + 1) * b1 / 2 + a1 / 2 + d;
        return c;
    }
}
