package exampleSimulations;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

import httpProtocols.HttpProtocol;
import io.gatling.javaapi.core.*;
import io.gatling.javaapi.http.*;
import scenarios.ComputerSearchScenario;

public class withFeederSimulation extends Simulation{

    // Http Protocol
    HttpProtocolBuilder httpProtocol = HttpProtocol.httpProtocol;

    // Scenario
    ScenarioBuilder scn = ComputerSearchScenario.scn;

    //Set Up
    {
        setUp(
                scn.injectOpen(rampUsers(1).during(1))
        ).protocols(httpProtocol)
                .assertions(forAll().failedRequests().count().is(0L));
    }

}
