package intern.schu.patterns.Endboss;

import java.util.concurrent.ThreadLocalRandom;

public class Münze {

    public static int werfeMünze() {
        return ThreadLocalRandom.current().nextInt(0, 2);
    }
}
