package io.weli;

import org.glassfish.jersey.server.ResourceConfig;

public class RestApp extends ResourceConfig {
    public RestApp() {
        super();
        property("jersey.config.server.tracing.type", "ON_DEMAND");
        property("jersey.config.server.tracing.threshold", "VERBOSE");
    }
}
