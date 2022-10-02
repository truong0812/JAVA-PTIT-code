package J04018;

public class SoPhuc {
    private int thuc, ao;

    public SoPhuc(int thuc, int ao) {
        this.thuc = thuc;
        this.ao = ao;
    }
    public static SoPhuc add(SoPhuc a, SoPhuc b) {
        return new SoPhuc(a.thuc + b.thuc, a.ao + b.ao);
    }
    // (a + bi)(c + di) = ac - bd + ad + bc
    public static SoPhuc mul(SoPhuc a, SoPhuc b){
        int t = a.thuc*b.thuc - a.ao * b.ao;
        int s = a.thuc * b.ao + a.ao * b.thuc;
        return new SoPhuc(t, s);
    }
    @Override
    public String toString(){
        if(this.ao < 0) return this.thuc + " - " + Math.abs(this.ao) +"i";
        return this.thuc + " + " + this.ao + "i";
    }
}
