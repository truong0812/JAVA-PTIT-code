package J05056;

import java.text.ParseException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException{
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        ArrayList<VanDongVien> list = new ArrayList<>();
        ArrayList<VanDongVien> tmp = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            VanDongVien thiSinh = new VanDongVien(i + 1, input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine());
            list.add(thiSinh);
            tmp.add(thiSinh);
        }
        HashMap<String, Integer> cmp = new HashMap<>();
        Collections.sort(list);
        boolean[] used = new boolean[n];
        for(int i = 0; i < n; i++) {
            if(used[i] == false) {
                cmp.put(list.get(i).getCode(), i + 1);
                used[i] = true;
            }
            for(int j = i + 1; j < n; j++) {
                if(list.get(i).getTtxh().equals(list.get(j).getTtxh())) {
                    if(used[j] == false) {
                        cmp.put(list.get(j).getCode(), i + 1);
                        used[j] = true;
                    }
                }
            }
        }
        Set<String> keySet = cmp.keySet();
        for(String key : keySet) {
            for(VanDongVien thiSinh : tmp) {
                if(thiSinh.getCode().equals(key)) {
                    thiSinh.setRank(cmp.get(key));
                    break;
                }
            }
        }
        Collections.sort(tmp);
        for(VanDongVien thiSinh : tmp) {
            System.out.println(thiSinh);
        }
        input.close();
    }
}
