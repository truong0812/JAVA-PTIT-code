package J07048;

class Product implements Comparable<Product>{
    private String code, name;
    private int sellPrice, period;
    public Product(String code, String name, int sellPrice, int period){
        this.code = code;
        this.name = name;
        this.sellPrice = sellPrice;
        this.period = period;
    }
    
    @Override
    public int compareTo(Product t){
        if(t.sellPrice != this.sellPrice) return t.sellPrice - this.sellPrice;
        return this.code.compareTo(t.code);
    }
    
    @Override
    public String toString(){
        return this.code + " " + this.name + " " + this.sellPrice + " " + this.period;
    }
}