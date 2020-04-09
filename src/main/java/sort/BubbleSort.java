package sort;

/**
 * @author zl
 * 冒泡排序
 */
public class BubbleSort<S extends Number> {

    static public void sort(int[] arr) {

        int length = arr.length;

        /**
         * i 表示现在倒数来说 有几个数在他正确的位置上
         * j 控制的是每次排序的指针
         */
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length-1 -i; j++) {
                //判断i j 这俩相邻位置元素的大小
                int curr=j;
                int next=j+1;
                if(arr[curr]<arr[next]){
                    int temp=arr[curr];
                    arr[curr]=arr[next];
                    arr[next]=temp;
                }
            }
            //相当于每一个确定一个最大的放在最后边 所以减去i
        }
    }

    static public <T> void sort(Comparable<T>[] list) {

    }
}
