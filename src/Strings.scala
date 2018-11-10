
object Strings extends App{
  
  println("Tell me what are you thinking ?")
  val input=readLine
  if(input.toLowerCase.contains("the game")) println("You Lose!") else println("You Win!")
  
}