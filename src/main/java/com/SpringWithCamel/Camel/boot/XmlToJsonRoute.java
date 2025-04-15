package com.SpringWithCamel.Camel.boot;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class XmlToJsonRoute extends RouteBuilder {
    @Override
    public void configure() {
        from("file:input?noop=true")
                .log("Processing file: ${file:name}")
                .unmarshal().jaxb("com.SpringWithCamel.Camel.boot.model")
                .marshal().json()
                .to("file:output?fileName=output.json")
                .log("Saved JSON file to output directory");
    }
}

