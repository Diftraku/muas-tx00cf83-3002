package task19;

/**
 * muas-tx00cf83-3002
 *
 * @author diftraku
 * @package muas-tx00cf83-3002
 * @copyright Copyright (c) 2016, Diftraku
 * @license https://opensource.org/licenses/MIT The MIT License (MIT)
 */

public interface Mediator {
    public void sendEvent(ContestEntity sender, String message);

    public void addListener(ContestEntity reference);
}
