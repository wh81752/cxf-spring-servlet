# CXF Demo Spring

The goal of this demo is set up a SOAP Webservice (CXF) featuring Dependency Injection via Spring.

It is (by far) not enough to just get a Webservice up and running. Every webservice beyond HelloWorld
depends on some middleware business logic and naturally available as injectable beans. So how can we get
this working?:

```java
@WebService
public class HelloWorldImpl implements HelloWorld {

    @Autowired
    HwBusinessLogic hw;

    @PostConstruct
    protected void postConstruct() {
        Objects.requireNonNull(this.hw); // !!!
    }

    public String sayHi(String text) {
        return this.hw.sayHi(text);
    }
}
```

## Quickstart

From the base directory of this demo -- where this README.md  is
located --, the pom.xml can be used to build and run: 

Using either UNIX or Windows:
```shell
> mvn clean install    # (builds the demo)
> mvn -Pserver         # (from one command line window)
> mvn -Pclient         # (from a second command line window)
```

## Requirements

* Java 8 or newer
* Apache CXF 3.x 
* Spring (already bundled with Apache's CXF)
