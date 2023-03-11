

public class Lab1 {
    public static int[] insertionSort(int[] my_list) {
        for (int j = 1; j < my_list.length; j++) {
            int key = my_list[j];
            int i = j-1;

            while (i > -1 && my_list[i] >= key) {
                my_list[i+1]=my_list[i];
                i=i-1;
            }
            my_list[i+1]=key;
        }

        return my_list;
    }


    public static void main(String[] args) {

        int my_list[] = new int[10];

        for (int i = 0; i < my_list.length; i++) {
            my_list[i] = (int) (Math.random()*10);
        }
        for (int i = 0; i < my_list.length; i++) {
            System.out.println(my_list[i]);
        }



        Lab1.insertionSort(my_list);

        System.out.println();

        for (int i = 0; i < my_list.length; i++) {
            System.out.println(my_list[i]);
        }

    }
}