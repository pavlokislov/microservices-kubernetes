package org.pkislov.senderservice.service;

import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.stereotype.Component;

@Component
public class NotificationMetricsService {

    private final Counter customMetricCounter;

    public NotificationMetricsService(MeterRegistry meterRegistry) {
        customMetricCounter = Counter.builder("notification_messages_to_rabbitmq_total")
                .description("Total number of messages that have been sent to rabbitmq")
                .tags("type", "custom_metric")
                .register(meterRegistry);
    }

    public void incrementCustomMetric() {
        customMetricCounter.increment();
    }
}
