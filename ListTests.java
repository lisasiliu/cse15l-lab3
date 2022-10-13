import static org.junit.Assert.*;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

public class ListTests {
    @Test
    public void testFilter() {
        List<String> input1 = new ArrayList<String>();
        input1.add("yes");
        input1.add("alrighty");
        input1.add("yepyep");
        StringChecker sc = new StringChecker() {
            public boolean checkString(String s) {
                return s.length() > 5;
            }
        };
        input1 = ListExamples.filter(input1, sc);
        List<String>ans = new ArrayList<String>();
        ans.add("alrighty");
        ans.add("yepyep");

        assertEquals(ans, input1);
    }

    @Test
    public void testMerge() {
        List<String> input1 = new ArrayList<String>();
        input1.add("alright");
        input1.add("no");
        input1.add("yes");
        List<String> input2 = new ArrayList<String>();
        input2.add("yak");
        input2.add("zebra");
        List<String>ans = new ArrayList<String>();
        ans.add("alright");
        ans.add("no");
        ans.add("yak");
        ans.add("yes");
        ans.add("zebra");

        assertEquals(ans, ListExamples.merge(input1, input2));
    }
}
