import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;


public class ListTests{

    @Test
    public void testFilter(){
        List<String> list = new ArrayList<String>();
        list.add("test");
        list.add("tes");
        list.add("te");
        list.add("te1");
        ListExamples sc = new ListExamples();

        assertArrayEquals(new String[]{"tes", "te1"}, ListExamples.filter(list, sc).toArray());
    }
}