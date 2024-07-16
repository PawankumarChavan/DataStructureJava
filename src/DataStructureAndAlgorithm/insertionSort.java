package DataStructureAndAlgorithm;

public class insertionSort {
    public static void main(String[] args) {
            int a[]= new int[]{7,8,2,1,3,4,5};
            int res[]=insertionSrt(a);
            for (int i:res){
                System.out.print(i+"\t");
            }

    }

    // ascending order
    public static int[] insertionSrt(int a[]){
        for(int i=1;i<a.length;i++){
            int temp =a[i];
            int j=i-1;
            while(j>=0 && a[j]>temp){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
        }
        return a;
    }

    // descending order
//    public static int[] insertionSrt(int a[]){
//        for(int i=1;i<a.length;i++){
//            int temp =a[i];
//            int j=i-1;
//            while(j>=0 && a[j]>temp){
//                a[j+1]=a[j];
//                j--;
//            }
//            a[j+1]=temp;
//        }
//        return a;
//    }



}
