object Homework {
  def foo = "foo"
  
  val naughtyWords = List("Celery", "Megatron")

  // attempt #1 - one liner
  def xisNaughty(text: String) : Boolean = {
    naughtyWords.map(s => text.toLowerCase.contains(s.toLowerCase)).contains(true)
  }

  // attempt #2 - case insensitive regex 
  def isNaughty(text: String) : Boolean = {
      naughtyWords.filter { case s: String =>
        (("(?i)" + s).r findFirstMatchIn text) != None
      }.length > 0
    }

}
