@Grab("io.ratpack:ratpack-groovy:0.9.0")
import static ratpack.groovy.Groovy.*

ratpack {
  handlers {
    get {
      render "Hello world!"
    }
  }
}
