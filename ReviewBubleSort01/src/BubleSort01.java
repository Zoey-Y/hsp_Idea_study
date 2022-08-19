import java.util.Scanner;

public class BubleSort01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //新建一个类,复习编写冒泡排序,假设这里冒的是整数的泡
        int[] arr = {4, 2, 5, 1, 3};
        System.out.print("原数组: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        Bb b1 = new Bb();
        b1.BubSort(arr);
        b1.print(arr);
    }

}

class Bb {
    public void BubSort(int[] arr) {
        int tmp = 0;
        for (int i = 0; i < arr.length - 1; i++) {//总共对比的组数循环
            for (int j = 0; j < arr.length - 1 - i; j++) {//每组俩俩对比的对数
                if (arr[j] > arr[j + 1]) {//交换
                    tmp = arr[j];//暂时存放两者的最大值
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public void print(int[] arr) {
        System.out.print("冒泡完的顺序: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
