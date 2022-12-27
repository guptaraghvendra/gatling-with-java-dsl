package APIcollection;

import io.gatling.javaapi.core.ChainBuilder;

import static io.gatling.javaapi.core.CoreDsl.*;
import static io.gatling.javaapi.http.HttpDsl.*;

public class GetHomePageQuery {
    public static ChainBuilder getHomePage = exec(
            http("HomePage")
            .get("/")
    ).pause(1);
}
