package J04017;

import java.util.*;

public class Matrix {
    private int[][] matrix;
    private int n,m;
    public Matrix(int n,int m)
    {
        matrix = new int[n+5][m+5];
        this.n = n;
        this.m = m;
    }

    public int sohang(){return n;}
    public int socot(){return m;}

    public void nextMatrix(Scanner in)
    {
        for(int i = 0;i < n;i++)
        {
            for(int j = 0;j < m;j++)
            {
                matrix[i][j] = in.nextInt();
            }
        }
    }

    public Matrix trans()
    {
        int x = this.socot(),y = this.sohang();
        Matrix b = new Matrix(x,y);
        for (int i = 0;i < x;i++)
        {
            for(int j = 0;j < y;j++)
            {
                b.matrix[i][j] = this.matrix[j][i]; 
            }
        }
        return b;

    }

    public Matrix mul(Matrix that)
    {
        Matrix kq = new Matrix(this.sohang(), that.socot());
        for(int i = 0;i < this.sohang();i++)
        {
            for(int j = 0;j < that.socot();j++)
            {
                int x = 0;
                for(int k =0; k < this.socot();k++)
                {
                    x += this.matrix[i][k] * that.matrix[k][j];
                }
                kq.matrix[i][j] = x;
            }
        }
        return kq;
    }
    @Override
    public String toString()
    {
        for(int i =0;i < n;i++)
        {
            for(int j = 0;j < m;j++)
            {
                System.out.printf("%d ",matrix[i][j]);
            }
            System.out.println();
        }
        return "";
    }
}
