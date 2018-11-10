import java.util.Locale._
object StringEx1 extends App{
  
  def LastNmFirstNm(x:String):String = {
    
    val pos = x.lastIndexOf(" ")
    val LName = x.substring(pos+1)
    val FName = x.substring(0, pos)
   
    LName.toUpperCase+", "+FName
  }
  
  println("Whats your name:")
  val x=readLine.trim
  println(LastNmFirstNm(x))  
}