

object matchCase extends App{
  
  def status(x:Int):Boolean= x match { 
    case 0 => true
    case 1 => true
    case _ => false
  }
  
  println("Enter status code:")
  val x=readInt
  
  if(status(x)) println("Your program executed successfully")
  else println("Program execution failed. It has some issues in executing the code.")
  
}