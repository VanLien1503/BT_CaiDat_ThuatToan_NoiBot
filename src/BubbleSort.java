import java.sql.Array;

public class BubbleSort {
    public static void bubbleSort(int[] list){
        boolean needNext = true;
        for (int k = 1; k<list.length&&needNext;k++){
            needNext=false;
            for (int i= 0;i<list.length-1;i++){
                if (list[i]>list[i+1]){
                    int temp =list[i];
                    list[i]=list[i+1];
                    list[i+1] = temp;

                    needNext=true;
                }
            }
        }
    }

    public static void main(String[] args) {
         int [] list = { 2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
for (int lt : list){
    System.out.print(lt+" ");
}
        System.out.println();
        bubbleSort(list);
        for (int lt :list) {
            System.out.print(lt+" ");

        }
    }
}
