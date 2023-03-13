import java.util.Arrays;

public class Lab3 {
    public static int randomizePartition(int[] A, int p, int r){
        int memor,ran;
        ran=(int) (Math.random()*(r-p)+p);

        memor=A[ran];
        A[ran]=A[r];
        A[r]=memor;

        int x = A[r];
        int i = p - 1;
        for (int j = p; j <=r - 1; j++) {
            if (A[j] <= x) {
                ++i;
                memor = A[i];
                A[i] = A[j];
                A[j] = memor;


            }


        }
        memor = A[r];
        A[r] = A[i + 1];
        A[i + 1] = memor;
        return i + 1;
    }

    public static void randomizeQuickSort(int[] A, int p, int r) {
        if (p < r) {
            int q = randomizePartition(A, p, r);
            randomizeQuickSort(A, p, q - 1);
            randomizeQuickSort(A, q + 1, r);
        }
    }

    public static void main(String[] args) {
        int[] my_ary = new int[100];


        for (int i = 0; i < 100; i++) {
            my_ary[i] =(int) (Math.random() * 101);
            System.out.print(my_ary[i] + " ");
        }

        randomizeQuickSort(my_ary,0,my_ary.length-1);

        System.out.println();
        for (int i = 0; i < 100; i++) {
            System.out.print(my_ary[i] + " ");

        }


    }


}
