package com.mercadolibre.metrics;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;


public interface MetricCollector {

    class Tags {
        Map<String, String> values;

        public Tags() {
            values = new HashMap<>();
        }

        public Tags add(String id, String value) {
            if(StringUtils.isNotBlank(id) && StringUtils.isNotBlank(value)) {
                values.put(id, value);
            }

            return this;
        }

        public Tags add(String id, Object value) {
            String s = value != null ? value.toString() : null;
            return add(id, s);
        }

        public Tags remove(String id) {
            values.remove(id);

            return this;
        }

        public String[] toArray() {
            String[] tags = new String[values.size()];

            Integer i = 0;
            for(Map.Entry<String, String> entry : values.entrySet()) {
                tags[i] = entry.getKey() + ":" + entry.getValue();

                i++;
            }

            return tags;
        }
    }

    MetricCollector newInstance();

    @Deprecated
    void measureTime(String name, Number time, String... tags);

    @Deprecated
    void incrementCounter(String name, int value, String... tags);

    void count(String var1, long var2, String... var4);

    void incrementCounter(String var1, String... var2);

    void increment(String var1, String... var2);

    void decrementCounter(String var1, String... var2);

    void decrement(String var1, String... var2);

    void recordGaugeValue(String var1, double var2, String... var4);

    void gauge(String var1, double var2, String... var4);

    void recordGaugeValue(String var1, long var2, String... var4);

    void gauge(String var1, long var2, String... var4);

    void recordExecutionTime(String var1, long var2, String... var4);

    void time(String var1, long var2, String... var4);

    void recordHistogramValue(String var1, double var2, String... var4);

    void histogram(String var1, double var2, String... var4);

    void recordHistogramValue(String var1, long var2, String... var4);

    void histogram(String var1, long var2, String... var4);

}
