/**
 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE
 * file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package demo.spring.service;

import javax.annotation.PostConstruct;
import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

@WebService(targetNamespace = "service.spring.demo", endpointInterface = "demo.spring.service.HelloWorld")
public class HelloWorldImpl implements HelloWorld {
    static final Logger logger = LoggerFactory.getLogger(HelloWorldImpl.class);

    @Autowired
    HwBusinessLogic hwBusinessLogic;

    @PostConstruct
    protected void postConstruct() {
        logger.info("*** wiring up {} ..", this.getClass().getName());
        logger.info("*** hwBusinessLogic => " + (this.hwBusinessLogic != null));
    }

    public String sayHi(String text) {
        return this.hwBusinessLogic.sayHi(text);
    }
}
