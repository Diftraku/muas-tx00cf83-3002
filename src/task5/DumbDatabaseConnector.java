package task5;

/**
 * muas-tx00cf83-3002
 *
 * @author diftraku
 * @package muas-tx00cf83-3002
 * @copyright Copyright (c) 2016, Diftraku
 * @license https://opensource.org/licenses/MIT The MIT License (MIT)
 */

public class DumbDatabaseConnector {
    private String dsn = "sqlite:/tmp/tmp.db";
    private static DumbDatabaseConnector ourInstance = new DumbDatabaseConnector();

    public static DumbDatabaseConnector getInstance() {
        return ourInstance;
    }

    private DumbDatabaseConnector() {
        // Dummy
    }

    public static void configure(String dsn) {
        DumbDatabaseConnector.ourInstance.dsn = dsn;
    }

    public String getDsn() {
        return this.dsn;
    }
}
