package com.imz1.service.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Properties specific to Utdb Sample 2.
 * <p>
 * Properties are configured in the {@code application.yml} file.
 * See {@link io.github.jhipster.config.JHipsterProperties} for a good example.
 */
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {}
