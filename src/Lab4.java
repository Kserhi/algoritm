public class Lab4 {
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
    public static int randomizeSelekt(int[] A, int p, int r,int i){
        if (p==r){
            return A[p];
        }
        int q=randomizePartition(A,p,r);
        int k =q-p+1;

        if(i==k){
            return A[q];
        }else if (i<k){
            return randomizeSelekt(A,p,q-1,i);
        }else {
            return randomizeSelekt(A,q+1,r,i-k);
        }

    }

    public static void main(String[] args) {
        int[] my_ary = new int[5];


        for (int i = 0; i < 5; i++) {
            my_ary[i] =(int) (Math.random() * 6);
            System.out.print(my_ary[i] + " ");
        }
        System.out.println();

        System.out.println(randomizeSelekt(my_ary, 0, my_ary.length-1, 3));

        Lab3.randomizeQuickSort(my_ary,0,my_ary.length-1);

        for (int i = 0; i < 5; i++) {

            System.out.print(my_ary[i] + " ");
        }

    }
}
