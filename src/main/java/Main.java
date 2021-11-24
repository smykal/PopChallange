import com.eight.CountParentheses;
import com.eight.Functions;
import com.eight.SummaryOfNumbers;
import com.eight.SummaryRecursion;
import com.six.AddArrays;
import com.six.GetArray;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        GetArray getArray = new GetArray();
        int[][] array1 = getArray.getArray();
        int[][] array2 = getArray.getArray();

        getArray.insertValuesToArray(array1);
        getArray.insertValuesToArray(array2);

        AddArrays addArrays = new AddArrays();
        addArrays.addArrays(array1, array2);

    }
}
