

object factorial extends App{
  
  def fact(x:BigInt):BigInt= if(x>1) x*fact(x-1) else x
  
  val Zero = BigInt(0)
  val One = BigInt(1)
  
  def factM(n:BigInt):BigInt= n match {
    case Zero => 1
    case One => 1
    case _ => (n*factM(n-1))
  }
  
  def readIntWithDefault(default:Int):Int= try {
    readInt
  } catch {
    case ex:NumberFormatException => default
  }
  
  println("Enter number to show factorial value:")
  
  val x = readIntWithDefault(-1)
  if(x>=0){
    println(fact(x))
    println(factM(x))
  } else {
    println("Try again and please input a non-negetive integer value!")
  }
  
  
}