import com.eight.CountParentheses;
import com.eight.Functions;
import com.eight.SummaryOfNumbers;
import com.eight.SummaryRecursion;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Functions eight = new CountParentheses();
        eight.countParentheses("asdas()()()))))))))))))))))))))((");

        SummaryRecursion summaryRecursion = new SummaryOfNumbers();
        LinkedList linkedList = summaryRecursion.generateList(3, 1, 10);
        summaryRecursion.printList(linkedList);
        summaryRecursion.summaryList(linkedList);
    }
}
