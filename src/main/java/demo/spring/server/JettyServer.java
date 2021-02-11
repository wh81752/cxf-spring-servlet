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
package demo.spring.server;

/**
 * Server main starting point.
 *
 * Here we simply deploy a "war" file onto a servlet-container (Jetty). Every other servlet-container like tomcat,
 * undertow (??), you name is also fine.
 *
 * Be aware that there is no Spring here and neither CXF. So all we do here is starting up and arbitrary webapp by
 * deploying a given WAR into a servlet-container.
 */
public class JettyServer {
    // static final Logger logger = LoggerFactory.getLogger(JettyServer.class);
    // static int PORT = 9002;
    //
    // private static WebAppContext webappcontext() {
    // WebAppContext wac;
    // wac = new WebAppContext();
    // wac.setContextPath("/");
    // wac.setWar("target/helloworld.war");
    // return wac;
    // }
    //
    // private static Handler[] handler() {
    // return new Handler[] { webappcontext(), new DefaultHandler() };
    // }
    //
    // private static HandlerCollection handlers() {
    // HandlerCollection handlers = new HandlerCollection();
    // handlers.setHandlers(handler());
    // return handlers;
    // }
    //
    // public static void main(String[] args) throws Exception {
    // org.eclipse.jetty.server.Server server;
    //
    // logger.info("Starting Server at port {}", PORT);
    // server = new org.eclipse.jetty.server.Server(PORT);
    // server.setHandler(handlers());
    // server.start();
    // logger.info("Server ready at port {}, please go ahead ..", PORT);
    // server.join();
    // logger.info("good-by world.");
    // }
    //
}
