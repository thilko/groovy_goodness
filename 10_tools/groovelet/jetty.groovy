import org.mortbay.jetty.Server
import org.mortbay.jetty.servlet.*
import groovy.servlet.*
@Grab(group='org.mortbay.jetty', module='jetty-embedded', version='6.1.14')
def startJetty() {
    def jetty = new Server(9090)
    // Allow sessions.
    def context = new Context(jetty, '/', Context.SESSIONS)
    // Look in current dir for Groovy scripts.
    context.resourceBase = '.'
    // All files ending with .groovy will be served.
    context.addServlet(GroovyServlet, '*.groovy')
    // Set an context attribute.
    context.setAttribute('version', '1.0')
    jetty.start()
}

println "Starting Jetty, press Ctrl+C to stop."
startJetty()
