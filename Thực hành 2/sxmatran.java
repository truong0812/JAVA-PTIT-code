import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sxmatran {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("MATRIX.in"));
        int t = Integer.parseInt(in.nextLine());
        while(t-- >0)
        {
            ArrayList <ArrayList <Integer> > matrix = new ArrayList<>();
            int n = in.nextInt();
            int m = in.nextInt();
            int k = in.nextInt();
            ArrayList <Integer> sx = new ArrayList<>();
            for(int i =0 ;i < n;i++)
            {
                ArrayList <Integer> x = new ArrayList<>();
                for(int j = 0; j < m;j++)
                {
                    int z = in.nextInt();
                    x.add(z);
                    if(j == k-1) sx.add(z);
                }
                matrix.add(x);
            }
            Collections.sort(sx);
            for(int i =0 ;i < n;i++)
            {
                for(int j = 0; j < m;j++)
                {
                    if(j == k-1) System.out.print(sx.get(i) + " ");
                    else System.out.print(matrix.get(i).get(j) + " "); 
                }
                System.out.println();
            }
        }

    }
}
