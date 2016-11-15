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

public class EveryThirdLineStrategy implements ListConverterStrategy {
    @Override
    public String listToString(List<String> data) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < data.size(); i++) {
            output.append(data.get(i));
            if ((i+1) % 3 == 0) {
                output.append("\n");
            }
        }
        return new String(output);
    }
}
