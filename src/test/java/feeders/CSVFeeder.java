package feeders;

import io.gatling.javaapi.core.FeederBuilder;

import static io.gatling.javaapi.core.CoreDsl.csv;

public class CSVFeeder {
    public static FeederBuilder<String> feeder = csv("data/search.csv").random();
}
