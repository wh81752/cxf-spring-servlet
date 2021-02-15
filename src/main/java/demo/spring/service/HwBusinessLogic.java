package demo.spring.service;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

/**
 * HwBusinessLogic
 *
 * <p>
 * Simple business logic class, able to 'say hi'..
 */
@Component
@RequestScope
public class HwBusinessLogic {
    static final Logger logger = LoggerFactory.getLogger(HwBusinessLogic.class);

    @PostConstruct
    protected void postConstruct() {
        logger.info("*** wiring up HwBusinessLogic ..");
    }

    public String sayHi(String text) {
        logger.info("sayHi called with arg {}", text);
        return String.format("Hello %s", text);
    }
}
