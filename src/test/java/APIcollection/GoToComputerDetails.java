package APIcollection;

import io.gatling.javaapi.core.ChainBuilder;
import io.gatling.javaapi.core.ChainBuilder;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

public class GoToComputerDetails {
    public static ChainBuilder goToComputerDetails = exec(
            http("GotoComputerDetails")
            .get("#{computerURL}")
            .check(status().in(200,201,301,302))
    );
}
