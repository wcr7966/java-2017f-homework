package creature;

import java.util.ArrayList;
import java.util.Arrays;

public class CalabashFactory {
    private ArrayList<Calabash> calabashes = new ArrayList<>(Arrays.asList(
            new Calabash(Color.红, Order.一),
            new Calabash(Color.橙, Order.二),
            new Calabash(Color.黄, Order.三),
            new Calabash(Color.绿, Order.四),
            new Calabash(Color.青, Order.五),
            new Calabash(Color.蓝, Order.六),
            new Calabash(Color.紫, Order.七)
    ));

    public Calabash get(int i) {
        return calabashes.get(i);
    }
}
