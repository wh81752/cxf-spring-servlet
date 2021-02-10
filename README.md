# CXF Demo Spring
The goal of this demo is to set up a W3C Webservice (SOAP) featuring _Dependency Injection_ via [Spring](https://en.wikipedia.org/wiki/Spring_Framework).

Compared with other samples, this demo does not focus on configuring such a webservice by means of some magic annotations. The focus
is rather on how to _inject_ a given (business logic) bean in a SOAP webservice. In other words, how to get this working?

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

## Technologies

* [Spring Framework](https://spring.io/)
* [Apache CXF](https://cxf.apache.org/)
* [Java](https://en.wikipedia.org/wiki/Java_(programming_language))
* [(Jakarta) Servlet](https://en.wikipedia.org/wiki/Jakarta_Servlet)

## Quickstart

From the base directory of this demo -- where this README.md  is
located --, the pom.xml can be used to build and run on either 
UNIX or Windows:
```shell
> mvn clean install    # builds the demo
> mvn -Pserver         # start server in a (fresh) command line window ; or
> mvn jetty:run        # use maven-jetty-plugin for server booting
```
Then in another command line window do:
```shell
> mvn -Pclient         # (from a second command line window)
[INFO] Scanning for projects...
[..]
INFO: Creating Service {http://service.spring.demo/}HelloWorldService from class demo.spring.service.HelloWorld
Response: Hello Joe
```
You may also want to query the WSDL file like:
```shell
> curl http://localhost:9002/services/HelloWorld?wsdl
<?xml version='1.0' encoding='UTF-8'?>
<wsdl:definitions ..</wsdl:definitions>
```

## Get It Working

Apache CXF uses Spring internally, so everyting is prepared for get going:
1. Write a WS as usualy (Java first, WSDL first, ..)
2. Inject beans in your WS-Impl using annotions like `@Inject` (see `HelloWorldImpl.java`)
3. Create XML file listing your *service* beans (see `service-beans.xml`)
4. Create `web.xml` and define a servlet using this class `org.apache.cxf.transport.servlet.CXFServlet`
5. Use servlet parameter `config-location` to tell `CXFServlet` where your service bean XML file is located within the classpath.

Everyting else is straight forward (let me know otherwise).

You can skip step 5 (parameter `config-location`) by putting your service beans in `WEB-INF/cxf-servlet.xml`.

## Requirements

* Java 8 or newer
* Apache CXF 3.x 
* Spring (already bundled with Apache's CXF)
