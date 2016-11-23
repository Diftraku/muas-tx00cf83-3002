package task16;

/**
 * muas-tx00cf83-3002
 *
 * @author diftraku
 * @package muas-tx00cf83-3002
 * @copyright Copyright (c) 2016, Diftraku
 * @license https://opensource.org/licenses/MIT The MIT License (MIT)
 */

public class Buzz extends Nonsense {
    public Buzz(FizzBuzzAPI fizzBuzzAPI) {
        super(fizzBuzzAPI);
    }

    @Override
    public void spew() {
        fizzBuzzAPI.fizzbuzz();
    }
}
