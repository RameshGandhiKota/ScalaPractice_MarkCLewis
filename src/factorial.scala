

object factorial extends App{
  
  def fact(x:BigInt):BigInt= if(x>1) x*fact(x-1) else x
  
  println("Enter number to show factorial value:")
  val x = readInt
  println(fact(x))
  
}