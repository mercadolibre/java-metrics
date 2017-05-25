package com.mercadolibre.metrics;

public enum DummyMetricCollector implements MetricCollector {
    INSTANCE;

    @Override @Deprecated
    public void measureTime(String name, Number time, String... tags) {
    }

    @Override @Deprecated
    public void incrementCounter(String name, int value, String... tags) {
    }

    @Override
    public void count(String var1, long var2, String... var4) {

    }

    @Override
    public void incrementCounter(String var1, String... var2) {

    }

    @Override
    public void increment(String var1, String... var2) {

    }

    @Override
    public void decrementCounter(String var1, String... var2) {

    }

    @Override
    public void decrement(String var1, String... var2) {

    }

    @Override
    public void recordGaugeValue(String var1, double var2, String... var4) {

    }

    @Override
    public void gauge(String var1, double var2, String... var4) {

    }

    @Override
    public void recordGaugeValue(String var1, long var2, String... var4) {

    }

    @Override
    public void gauge(String var1, long var2, String... var4) {

    }

    @Override
    public void recordExecutionTime(String var1, long var2, String... var4) {

    }

    @Override
    public void time(String var1, long var2, String... var4) {

    }

    @Override
    public void recordHistogramValue(String var1, double var2, String... var4) {

    }

    @Override
    public void histogram(String var1, double var2, String... var4) {

    }

    @Override
    public void recordHistogramValue(String var1, long var2, String... var4) {

    }

    @Override
    public void histogram(String var1, long var2, String... var4) {

    }


    @Override
    public MetricCollector newInstance() {
        return INSTANCE;
    }

}
