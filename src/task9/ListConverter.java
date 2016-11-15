package task9;

import java.util.ArrayList;
import java.util.List;

/**
 * muas-tx00cf83-3002
 *
 * @author diftraku
 * @package muas-tx00cf83-3002
 * @copyright Copyright (c) 2016, Diftraku
 * @license https://opensource.org/licenses/MIT The MIT License (MIT)
 */

public class ListConverter {
    private ListConverterStrategy strategy;
    private List<String> list;

    public ListConverter(ListConverterStrategy strategy) {
        this.strategy = strategy;
        this.list = new ArrayList<>();
    }

    public void addToList(String data) {
        this.list.add(data);
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void printList() {
        System.out.println(strategy.listToString(list));
    }

    public void setStrategy(ListConverterStrategy strategy) {
        this.strategy = strategy;
    }
}
