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

public class EveryLineStrategy implements ListConverterStrategy {
    @Override
    public String listToString(List<String> data) {
        StringBuilder output = new StringBuilder();
        for (String element : data) {
            output.append(element + "\n");
        }
        return new String(output);
    }
}
