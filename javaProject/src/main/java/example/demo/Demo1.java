package example.demo;

public class Demo1 {
    public static int secondHighest(int[] a){
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for(int i = 0; i<a.length; i++){
            if(a[i]>highest){
                secondHighest = highest;
                highest = a[i];
            }else if(a[i]>secondHighest){
                secondHighest = a[i];
            }
        }
        return  secondHighest;
    }
    public static void main(String[] args){
        int[] array = {1,2,3,4,55,64};
        System.out.print(secondHighest(array));
    }
}
