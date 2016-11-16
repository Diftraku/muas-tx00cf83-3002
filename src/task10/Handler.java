package task10;

/**
 * muas-tx00cf83-3002
 *
 * @author diftraku
 * @package muas-tx00cf83-3002
 * @copyright Copyright (c) 2016, Diftraku
 * @license https://opensource.org/licenses/MIT The MIT License (MIT)
 */

abstract public class Handler {
    private Handler successor;

    public Handler(Handler successor) {
        this.successor = successor;
    }

    public void handle(WageRaiseRequest request) {
        if (this.successor != null) {
            this.successor.handle(request);
        }
    }
}
