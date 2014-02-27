@Grab(group='org.codehaus.gpars', module='gpars', version='1.1.0')

final SyncDataflowQueue channel = new SyncDataflowQueue()

def producer = task {
    (1..30).each {
        channel << it  //writing to a channel
        println "Just sent $it"
    }
}

def consumer = task {
    while (true) {
        sleep 500  //simulating a slow consumer
        final Object msg = channel.val
        println "Received $msg"
    }
}

producer.join()
