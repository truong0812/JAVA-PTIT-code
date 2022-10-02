package J07017;

class Pair<First, Second>{
    private First a;
    private Second b;
    public Pair(First a, Second b){
        this.a = a;
        this.b = b;
    }
    private boolean check_1(First a){
        if((Integer) a < 2) return false;
        if((Integer) a == 2) return true;
        for(int i = 2;i <= Math.sqrt((Integer) a);i++){
            if((Integer) a % i == 0) return false;
        }
        return true;
    }
    private boolean check_2(Second a){
        if((Integer) a < 2) return false;
        if((Integer) a == 2) return true;
        for(int i = 2;i <= Math.sqrt((Integer) a);i++){
            if((Integer) a % i == 0) return false;
        }
        return true;
    }
    public boolean isPrime(){
        if(check_1(this.a) && check_2(this.b)) return true;
        return false;
    }
    @Override
    public String toString(){
        return this.a + " " + this.b;
    }
}
