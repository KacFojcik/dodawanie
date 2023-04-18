package dodawanie;

import static org.junit.Assert.*;

public class MainTest {

    @org.junit.Test
    public void added() {
       Main main = new Main();
       assertEquals(10, main.added(5,5));
    }
}