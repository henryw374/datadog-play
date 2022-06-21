#!/bin/bash

java -javaagent:resources/dd-java-agent.jar \
-Dclojure.server.repl="{:port 5555 :accept clojure.core.server/repl}" \
-Ddd.profiling.enabled=true -XX:FlightRecorderOptions=stackdepth=256 \
-Ddd.logs.injection=true -Ddd.trace.sample.rate=1 -Ddd.service=my-app -Ddd.env=staging \
-jar target/standalone.jar 
