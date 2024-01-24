package cn;
import java.util.*;
public class Distance {
    public static final int inf=999;
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of vertices:");
        int n=sc.nextInt();
        System.out.println("Enter the matrix:");
        int[][] c=new int[n][n];
        int[][] a=new int[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                c[i][j]=sc.nextInt();
                if(i!=j && c[i][j]==0) {
                    c[i][j]=inf;
                }
                a[i][j]=c[i][j];
            }
        }
        System.out.println("Source vertix: ");
        int s=sc.nextInt();
        for(int k=0;k<n;k++) {
            for(int i=0;i<n;i++) {
                for(int j=0;j<n;j++) {
                    if(a[i][j]>a[i][k]+a[k][j]) {
                        a[i][j]=a[i][k]+a[k][j];
                    }
                }
            }
        }
        for(int i=0;i<n;i++) {
        for(int j=0;j<n;j++) {
        System.out.print(a[i][j] + "\t");
           }
        System.out.println();
        }
    }
}