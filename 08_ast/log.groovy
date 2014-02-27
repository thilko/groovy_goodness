@Grapes([
    @Grab(group='org.slf4j', module='slf4j-api', version='1.6.1'),
    @Grab(group='ch.qos.logback',module='logback-classic',version='0.9.29')
])

import org.slf4j.*
import groovy.util.logging.Slf4j
// Use annotation to inject log field into the class.
@Slf4j
class HelloWorldSlf4j {
    def execute() {
        log.debug 'Execute HelloWorld.'
        log.info 'Simple sample to show log field is injected.'
} }

def helloWorld = new HelloWorldSlf4j()
helloWorld.execute()
