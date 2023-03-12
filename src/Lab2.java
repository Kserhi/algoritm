import java.util.Random;

public class Lab2 {
    public static void  merge(int[]A,int p,int q,int r){
        int n1=q-p+1;
        int n2=r-q;

        int[]L=new int[n1+1];
        int[]R=new int[n2+1];

        for(int i=0;i<n1;i++){
            L[i]=A[i+p];
        }
        for(int j=0;j<n2;j++){
            R[j]=A[j+q+1];
        }

        L[n1]=(int) Double.POSITIVE_INFINITY;
        R[n2]=(int) Double.POSITIVE_INFINITY;

        int i=0,j=0;

        for (int k=p;k<=r;k++){
            if(L[i]<=R[j]){
                A[k]=L[i];
                ++i;
            }else {
                A[k]=R[j];
                ++j;
            }
        }




    }
    public static void mergeSort(int[]A,int p,int r){
        if (p<r){
            int q=(p+r)/2;
            Lab2.mergeSort(A, p, q);
            Lab2.mergeSort(A, q+1, r);
            Lab2.merge(A, p, q, r);
        }
    }

    public static void main(String[] args) {
        int [] my_array=new int[100];

        for(int i=0;i<my_array.length;i++){
            my_array[i]=(int) (Math.random()*101);
            System.out.print(my_array[i]+" ");
        }
        System.out.println();

        Lab2.mergeSort(my_array,0,my_array.length-1);


        for(int i=0;i<my_array.length;i++){
            System.out.print(my_array[i]+" ");
        }
    }
}
