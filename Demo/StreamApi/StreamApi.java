package Demo.StreamApi;

import java.util.Arrays;
import java.util.List;

public class StreamApi {
    static void main(String[] args) {
        List<Integer> nums = Arrays.asList(4, 2, 7, 6, 5);
        nums.forEach(x -> System.out.print(x + " "));

        System.out.println();
        nums.stream().forEach(x -> System.out.print(x + " "));
        System.out.println();
        
        nums = nums.stream().map(x -> x * 2).toList();
        System.out.println(nums.getFirst());
    }
}
