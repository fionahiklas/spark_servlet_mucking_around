## Overview

Example code that makes use of the Spark framework with Spring to construct a quick and easy REST service

## Help

### JAVA_HOME on MacOS

Both Linux and MacOS have weird-ass layouts for their native JVM installations, for the latter the JAVA_HOME environment variable (that axis2 needs to run) is as follows

```
/Library/Java/JavaVirtualMachines/jdk1.8.0_40.jdk/Contents/Home/
```

## Creating Basic Project


### Maven Project Creation

Using maven to generate the basic layout run the following command

```
mvn archetype:generate -DgroupId=com.hiklas.mucking.around -DartifactId=SparkAndSpringServlet -Dversion=0.0.1 -DarchetypeArtifactId=maven-archetype-webapp -DinteractiveMode=false
```



## References

### Generating Webapp with Maven

Command from this [page](http://www.mkyong.com/maven/how-to-create-a-web-application-project-with-maven/)
