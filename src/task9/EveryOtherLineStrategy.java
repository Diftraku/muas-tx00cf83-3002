package task9;

import java.util.List;

/**
 * muas-tx00cf83-3002
 *
 * @author diftraku
 * @package muas-tx00cf83-3002
 * @copyright Copyright (c) 2016, Diftraku
 * @license https://opensource.org/licenses/MIT The MIT License (MIT)
 */

public class EveryOtherLineStrategy implements ListConverterStrategy {
    @Override
    public String listToString(List<String> data) {
        String[] list = new String[data.size()];
        list = data.toArray(list);
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < list.length; i++) {
            output.append(list[i]);
            if ((i+1) % 2 == 0) {
                output.append("\n");
            }
        }
        return new String(output);
    }
}
