package inventory;

public class InventoryLogDriver {
    public static void main(String[] args) {
        InventoryLog log = new InventoryLog();
        log.add('c');
        System.out.println(log.isEmpty());

    }
}
