
object RecursiveFun extends App{
  
  def recFun(x:Int){
    println(x)
    Thread.sleep(1000)
    if(x>0) recFun(x-1)
  }
  
  println("Enter number for Countdown:")
  recFun(readInt)
}