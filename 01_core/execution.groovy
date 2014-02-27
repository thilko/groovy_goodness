["Hannes", "Sebastian", "Nils", "Sina"].collect{"/usr/bin/say 'Hello $it'"}
                .each{it.execute().waitFor()}
