package drivers;

import inventory.InventoryLog;

public class InventoryLogDriver {
    public static void main(String[] args) {
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
        System.out.println(log);
        log.subtract('z');
        System.out.println(log);
    }
}
