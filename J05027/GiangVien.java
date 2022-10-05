package J05027;

public class GiangVien {
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

    public String getHoTen() {
        return hoTen;
    }
    
    @Override
    public String toString(){
        return this.maGV + " " + this.hoTen + " " + this.boMon;
    }
}
