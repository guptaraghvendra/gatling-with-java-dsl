package scenarios;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

import APIcollection.GetHomePageQuery;
import APIcollection.GoToComputerDetails;
import APIcollection.SearchQuery;
import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;

public class ComputerSearchScenario {
    public static ScenarioBuilder scn = scenario("computer search scenario")
            .exec(GetHomePageQuery.getHomePage)
            .pause(2)
            .exec(SearchQuery.search)
            .exec(GoToComputerDetails.goToComputerDetails)
            .pause(2);
}
