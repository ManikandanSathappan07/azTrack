package com.mani.aztrack;

import com.mani.aztrack.config.AsyncSyncConfiguration;
import com.mani.aztrack.config.EmbeddedElasticsearch;
import com.mani.aztrack.config.EmbeddedKafka;
import com.mani.aztrack.config.EmbeddedSQL;
import com.mani.aztrack.config.JacksonConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { AztrackApp.class, JacksonConfiguration.class, AsyncSyncConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedSQL
@EmbeddedKafka
public @interface IntegrationTest {
}