package com.happytown.entrypoints.jobs;

import com.happytown.core.use_cases.AttribuerCadeaux;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
public class AttributionCadeauxJob {

    private final AttribuerCadeaux attribuerCadeaux;

    private static final Logger LOGGER = LoggerFactory.getLogger(AttributionCadeauxJob.class);

    public AttributionCadeauxJob(AttribuerCadeaux attribuerCadeaux) {
        this.attribuerCadeaux = attribuerCadeaux;
    }

    @Scheduled(cron = "0 0/2 * * * *")
    public void execute() {
        LOGGER.info("Start Task execute");
        attribuerCadeaux.execute();
        LOGGER.info("End Task execute");
    }
}
