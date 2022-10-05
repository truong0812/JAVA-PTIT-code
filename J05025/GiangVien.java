package J05025;

public class GiangVien implements Comparable<GiangVien> {
    private String maGV, hoTen, boMon;
    private static int id = 1;
    public GiangVien(String hoTen, String boMon) {
        this.maGV = "GV" + String.format("%02d", id++);
        this.hoTen = hoTen;
        this.boMon = "";
        String[] arr = boMon.split("\\s+");
        for(String x : arr){
            this.boMon += Character.toUpperCase(x.charAt(0));
        }
    }

    private String getTen() {
        String[] arr = hoTen.split("\\s+");
        return arr[arr.length - 1];
    }
    
    @Override
    public String toString(){
        return this.maGV + " " + this.hoTen + " " + this.boMon;
    }
    @Override
    public int compareTo(GiangVien that)
    {
        if(this.getTen().equals(that.getTen())) return this.maGV.compareTo(that.maGV);
        return this.getTen().compareTo(that.getTen());
    }
}
