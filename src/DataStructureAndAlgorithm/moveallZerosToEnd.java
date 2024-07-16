package DataStructureAndAlgorithm;

public class moveallZerosToEnd {
    public static void main(String[] args) {
        int res[]=movezeroesEnd(new int[]{0,1,0,2,0,4,4,0});
        for(int i:res){
            System.out.print(i+"\t");
        }
    }
    public static int[] movezeroesEnd(int a[]){

        int nz=0;
        int z=0;
        while(nz<a.length){
            if(a[nz]!=0){
                int temp=a[nz];
                a[nz]=a[z];
                a[z]=temp;
                nz++;
                z++;
            }else{
                nz++;
            }
        }
        return a;

    }
}
