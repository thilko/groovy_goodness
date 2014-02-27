class Piano{
  def call(tone){
    "say $tone".execute()
    return this
  }

}

def play = new Piano()

play("a").("b")
