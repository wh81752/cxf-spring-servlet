package demo.spring.service;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Class Documentation
 *
 * <p>What is the point of this class?
 *
 * @author geronimo1
 */
@Component
public class Foobar {
    @PostConstruct
    protected void postConstruct() {
        System.out.println("*** wiring up Foobar ..");
    }
}
