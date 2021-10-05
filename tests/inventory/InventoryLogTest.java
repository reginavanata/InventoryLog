package inventory;


import org.junit.Test;

import static org.junit.Assert.*;

public class InventoryLogTest {

    @Test
    public void testAdd(){
        InventoryLog log = new InventoryLog();
        log.add('a');
        log.add('b');
        log.add('c');
        assertEquals(true, log.contains('a'));

    }

    @Test
    public void testSubtract(){
        InventoryLog log = new InventoryLog();
        log.add('a');
        log.add('b');
        log.add('c');
        log.add('a');
        log.add('b');
        log.add('c');
        log.add('a');
        log.add('b');
        log.add('c');
        System.out.println(log);
        log.subtract('b');
        assertEquals(false, log.contains('b'));
        System.out.println(log);
        assertEquals(true, log.contains('a'));
        log.subtract('z');

    }

}