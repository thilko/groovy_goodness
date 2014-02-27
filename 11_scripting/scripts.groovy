groovy -e "Locale.availableLocales.displayName.findAll { it =~ args[0] }.each { println it }” English
groovy -l 9000 -e "println 'You say: ' + line"
