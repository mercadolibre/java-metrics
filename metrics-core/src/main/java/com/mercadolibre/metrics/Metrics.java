package com.mercadolibre.metrics;

import java.util.ServiceLoader;


public enum Metrics implements MetricCollector {
    INSTANCE;

    private static MetricCollector metricCollector;

    private static ServiceLoader<MetricCollector> metricLoader = ServiceLoader.load(MetricCollector.class);

    static {
        loadMetricEngine();
    }

    private static void loadMetricEngine() {
        for (MetricCollector m : metricLoader) {
            if (metricCollector != null) throw new IllegalStateException("Many metrics collectors implementations found");

            metricCollector = m.newInstance();
        }

        if (metricCollector == null) metricCollector = DummyMetricCollector.INSTANCE;
    }


    @Override @Deprecated
    public void measureTime(String name, Number time, String... tags) {
        metricCollector.measureTime(name, time, tags);
    }

    @Override @Deprecated
    public void incrementCounter(String name, int value, String... tags) {
        metricCollector.incrementCounter(name, value, tags);
    }

    @Override
    public void count(String var1, long var2, String... var4) {
        metricCollector.count(var1, var2, var4);
    }

    @Override
    public void incrementCounter(String var1, String... var2) {
        metricCollector.incrementCounter(var1, var2);
    }

    @Override
    public void increment(String var1, String... var2) {
        metricCollector.incrementCounter(var1, var2);
    }

    @Override
    public void decrementCounter(String var1, String... var2) {
        metricCollector.decrementCounter(var1, var2);
    }

    @Override
    public void decrement(String var1, String... var2) {
        metricCollector.decrement(var1, var2);
    }

    @Override
    public void recordGaugeValue(String var1, double var2, String... var4) {
        metricCollector.recordGaugeValue(var1, var2, var4);
    }

    @Override
    public void gauge(String var1, double var2, String... var4) {
        metricCollector.gauge(var1, var2, var4);
    }

    @Override
    public void recordGaugeValue(String var1, long var2, String... var4) {
        metricCollector.recordGaugeValue(var1, var2, var4);
    }

    @Override
    public void gauge(String var1, long var2, String... var4) {
        metricCollector.gauge(var1, var2, var4);
    }

    @Override
    public void recordExecutionTime(String var1, long var2, String... var4) {
        metricCollector.recordExecutionTime(var1, var2, var4);
    }

    @Override
    public void time(String var1, long var2, String... var4) {
        metricCollector.time(var1, var2, var4);
    }

    @Override
    public void recordHistogramValue(String var1, double var2, String... var4) {
        metricCollector.recordHistogramValue(var1, var2, var4);
    }

    @Override
    public void histogram(String var1, double var2, String... var4) {
        metricCollector.histogram(var1, var2, var4);
    }

    @Override
    public void recordHistogramValue(String var1, long var2, String... var4) {
        metricCollector.recordHistogramValue(var1, var2, var4);
    }

    @Override
    public void histogram(String var1, long var2, String... var4) {
        metricCollector.histogram(var1, var2, var4);
    }

    @Override
    public MetricCollector newInstance() {
        return INSTANCE;
    }

}