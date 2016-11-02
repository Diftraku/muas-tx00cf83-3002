package task5;

/**
 * muas-tx00cf83-3002
 *
 * @author diftraku
 * @package muas-tx00cf83-3002
 * @copyright Copyright (c) 2016, Diftraku
 * @license https://opensource.org/licenses/MIT The MIT License (MIT)
 */

public class DumbDatabaseTester {
    public static void main(String[] args) {
        System.out.println("DumbDatabaseConnector");
        DumbDatabaseConnector dbc1, dbc2;

        System.out.println("Create new instance directly");
        //dbc1 = new DumbDatabaseConnector(); //
        System.err.println("constructor access private, javac fails to compile");
        //System.out.println(dbc1.getDsn());

        System.out.println("Get instance from static class");
        dbc1 = DumbDatabaseConnector.getInstance();
        System.out.println("DSN from dbc1: "+dbc1.getDsn());

        System.out.println("Set DSN and get an instance");
        DumbDatabaseConnector.configure("pgsql:host=localhost;port=5432;dbname=dumbdatabase");

        dbc2 = DumbDatabaseConnector.getInstance();
        System.out.println("DSN from dbc1: "+dbc1.getDsn());
        System.out.println("DSN from dbc2: "+dbc2.getDsn());


    }
}
