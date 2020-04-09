import org.junit.Test;
import sort.BubbleSort;

import java.util.Arrays;

/**
 * @author zl
 */
public class SortTest {

    @Test
    public void test(){
        int[] arr=new int[]{1,2,3,6,5};
        BubbleSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
