
object patternMatch extends App{
  
  def findWhat(x:Any){
    x match {
      case 31 => println("its my number 31!")
      case "ramesh" => println("Its my name Ramesh!")
      case "RGK" => println("Still Its me")      
      case 'a' => println("Its char a")
      case p:Char => println("Its a Character:"+p)
      case p:Int => println("Its an Integer :"+p)
      case p:Double => println("Its a Double value:"+p)
      case m:Any => println("Hmm, no luck what it is:"+m.toString())
    }        
  }  
  
  //println("Enter what you think:")
  //var input:Any= readLine
  //findWhat(input)
  
  findWhat(31)
  findWhat("ramesh")
  findWhat("RGK")
  findWhat('a')
  findWhat('R')
  findWhat(252)
  findWhat(5.548)
  findWhat("fwfwwgq")
  findWhat(42125)
  
}