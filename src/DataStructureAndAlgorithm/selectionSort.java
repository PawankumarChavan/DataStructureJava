package DataStructureAndAlgorithm;

public class selectionSort {

    public static void main(String[] args) {
            int a[]= new int[]{6,7,5,4,3,1};
            int res[]=selectionSrt(a);
            for(int k:res){
                System.out.print(k+"\t");
            }
    }

    public static int[] selectionSrt(int a[]){

        for(int i=0;i<a.length;i++){
            int min=i;
            for(int j=(i+1);j<a.length;j++){
                if(a[j]<a[min]){
                    min=j;
                }
            }
            // swapping logic
            if(i!=min){
                int temp=a[i];
                a[i]=a[min];
                a[min]=temp;
            }

        }
        return a;
    }
}
