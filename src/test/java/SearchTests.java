import base.BaseTests;
import org.junit.Test;

public class SearchTests extends BaseTests {

    @Test
    public void testSearchByFullTitle(){
        String title = "Test";
        page.search(title);
        validateWindow();
    }
}
