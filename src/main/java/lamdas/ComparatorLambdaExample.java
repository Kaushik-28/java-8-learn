package lamdas;

import java.util.Comparator;
import java.util.List;

public class ComparatorLambdaExample {
    public static void main(String[] args) {
       //old
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);// 0 -> equal, 1 -> o1>o2 ,-1 o1<o2
            }
        };

        System.out.printf("comparison of 2 and 3 : %d",comparator.compare(2,3));
        //new
        Comparator<Integer> comparatorLambda = (o1,o2) -> o1.compareTo(o2);
        System.out.printf("\ncomparison of 2 AND 3 : %d",comparatorLambda.compare(2,3));
        //this is a test comment.t
    }

}
