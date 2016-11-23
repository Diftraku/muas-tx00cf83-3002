package task16;

/**
 * muas-tx00cf83-3002
 *
 * @author diftraku
 * @package muas-tx00cf83-3002
 * @copyright Copyright (c) 2016, Diftraku
 * @license https://opensource.org/licenses/MIT The MIT License (MIT)
 */

public class NonsenseDemo {
    public static void main(String[] args) {
        Nonsense nonsense = new Fizz(new FizzBuzz());
        nonsense.spew();

        // Jossain muussa todellisuudessa
        nonsense = new Buzz(new BuzzFizz());
        nonsense.spew();

    }
}
