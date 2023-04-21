import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EducationApp {
    @Test
    public void testMyMethod() {
        EducationApp myClass = new EducationApp();
        int result = myClass.myMethod();
        assertEquals(42, result);
    }

    private int myMethod() {
        int i = 0;
        return i;
    }
}



