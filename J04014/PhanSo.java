package J04014;

class PhanSo{
    private long tuSo, mauSo;

    public PhanSo(long tuSo, long mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    protected long getTuSo() {
        return tuSo;
    }

    protected long getMauSo() {
        return mauSo;
    }
    public static long gcd(long a, long b){
        if(b == 0) return a;
        return gcd(b, a % b);
    }
    public void toiGian(){
        long g = PhanSo.gcd(this.tuSo, this.mauSo);
        this.tuSo /= g;
        this.mauSo /= g;
    }
    public static PhanSo mul(PhanSo a, PhanSo b){
        a.toiGian(); b.toiGian();
        long tu = a.getTuSo() * b.getTuSo();
        long mau = a.getMauSo() * b.getMauSo();
        long g = PhanSo.gcd(mau, tu);
        return new PhanSo(tu/g, mau/g);
    }
    public static PhanSo add(PhanSo a, PhanSo b){
        a.toiGian(); b.toiGian();
        long tu = a.getTuSo() * b.getMauSo() + b.getTuSo() * a.getMauSo();
        long mau = a.getMauSo() * b.getMauSo();
        long g = PhanSo.gcd(mau, tu);
        return new PhanSo(tu/g, mau/g);
    }
    @Override
    public String toString(){
        return this.tuSo + "/" + this.mauSo;
    }
}
