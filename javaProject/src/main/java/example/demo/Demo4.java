package example.demo;

import java.util.Arrays;

public class Demo4 {
    public static void sortedMerge(int[] a, int[] b, int[] res, int n, int m){
        int i = 0, j = 0, k = 0;
        while(i < n){
            res[k] = a[i];
            i++;
            k++;
        }
        while(j < m){
            res[k] = b[j];
            j++;
            k++;
        }
        Arrays.sort(res);
    }

    public static void main(String[] args){
        int[] a = {1,2,30,4};
        int[] b = {500,60,7,8,9};
        int n = a.length, m = b.length;
        int[] res = new int[n+m];
        sortedMerge(a,b,res,n,m);
        for(int i = 0; i < n + m; i++){
            System.out.print(" " +res[i]);
        }
    }
}
