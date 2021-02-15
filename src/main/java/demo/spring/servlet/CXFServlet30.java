package demo.spring.servlet;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

import org.apache.cxf.transport.servlet.CXFServlet;

/**
 * CXFServlet30 Documentation
 *
 * <p>
 * The point of this class is to have class annotable as @WebServlet. By doing so we provide an equivalent for web.xml.
 *
 * <h2>My 2cents</h2> The @WebServlet usage appears strange. All the configuration is somehow buried in the annotation.
 * Why not an annotation that identifies a class *servlet configuration* equivalent?
 *
 * @WebServlet public MyServlet {
 *
 * @WebServlet.LoadOnStartup public int loadatstartup() { return 1; }
 * 
 * @WebServlet.Class public Class servletClass() { return CXFServlet.class; } }
 *
 *                   And so on.
 *
 *                   web.xml is the finally composed of all @WebServlet annotations around.
 */
@WebServlet(name = "cxfservlet", loadOnStartup = 1, description = "Apache CXF Endpoint", displayName = "cxfservlet", initParams = {
        @WebInitParam(name = "config-location", value = "/WEB-INF/service-beans.xml") }, urlPatterns = {
                "/services/*" })
public class CXFServlet30 extends CXFServlet {
    // TODO: what to do with session-timeout?
    // <session-config>
    // <session-timeout>60</session-timeout>
    // </session-config>

    public CXFServlet30() {
        System.out.println("***CXFServlet30***");
    }
}
