# Metrics

Metrics interface for Java 1.7+.<br/>

For questions and support please contact [services@mercadolibre.com](mailto:services@mercadolibre.com)

# Contents

   * [Dependencies](#dependencies)

# Dependencies

You must define the repository resolver

```xml
<repository>
	<id>java-metrics-mvn-repo</id>
	<url>https://raw.github.com/mercadolibre/java-metrics/mvn-repo/</url>
	<snapshots>
	    <enabled>true</enabled>
	    <updatePolicy>always</updatePolicy>
	</snapshots>
</repository>
```

and the dependency itself

```xml
<dependency>
    <groupId>com.mercadolibre.metrics</groupId>
    <artifactId>metrics-core</artifactId>
    <version>0.0.1</version>
</dependency>
```