class Bread {
  private String mood

  private String getMood(){this.mood}
}

Bread bernd = new Bread(mood: "bad")
println bernd.@mood  // access the property directly
println bernd.mood



// http://jira.codehaus.org/browse/GROOVY-3010
