package APIcollection;

import feeders.CSVFeeder;
import io.gatling.javaapi.core.ChainBuilder;
import io.gatling.javaapi.core.FeederBuilder;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

public class SearchQuery {

    public static ChainBuilder search = feed(CSVFeeder.feeder)
            .exec(
                    http("Action Search")
                    .get("/computers?f=#{searchCriterion}")
                    .check(css("a:contains('#{searchComputerName}')","href").saveAs("computerURL"))
            ).pause(1);
}
