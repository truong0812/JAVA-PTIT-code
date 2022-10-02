import java.util.*;
import static java.lang.Math.*;

class Fraction {
    private long x;
    private long y;

    public Fraction(long x, long y) {
        this.x = x;
        this.y = y;
    }

    public long gcd(long a, long b) {
        return (b == 0 ? a : gcd(b, a % b));
    }

    public long lcm(long a, long b) {
        return (a * b) / gcd(a, b);
    }

    public Fraction add(Fraction other) {
        long resY = lcm(this.y, other.y);
        long resX = this.x * (resY / this.y) + other.x * (resY / other.y);
        long GCD = gcd(resY, resX);
        return new Fraction(resX / GCD, resY / GCD);
    }

    @Override
    public String toString() {
        return String.format("%d/%d", x, y);
    }
}

public class J04004 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        Fraction fr1 = new Fraction(sc.nextLong(), sc.nextLong());
        Fraction fr2 = new Fraction(sc.nextLong(), sc.nextLong());
        System.out.println(fr1.add(fr2));
    }
}