## Overview

Example code that makes use of the Spark framework with Spring to construct a quick and easy REST service.

Having looked at the internals of Spark I'm not entirely happy with all of the static's that are floating around all over the place!  For [example](https://github.com/perwendel/spark/blob/master/src/main/java/spark/staticfiles/StaticFilesConfiguration.java)

I think to be any real use there needs to be a version of Spark that doesn't make use of statics unless it really has to (when there is no container for example).  Actually thinking about it the whole point is that alot of the applications now use a built-in web server.



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


### Example Spark Servlet

There is some code that gives an example of creating a [servlet with Spark](https://github.com/simonrice/SparkServletExample)

