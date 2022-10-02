package J04020;

public class Pair <K,V> {
    private K a;
    private V b;
    public Pair(K a, V b)
    {
        this.a = a;
        this.b = b;
    }
    public boolean isPrime(){
        int n = (Integer)(this.a);
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0)
                return false;
        }
        int m = (Integer)(this.b);
        for(int i = 2; i <= Math.sqrt(m); i++){
            if(m % i == 0)
                return false;
        }
        return n > 1 && m > 1;
    }
    @Override
    public String toString(){
        return this.a + " " + this.b;
    }
}
