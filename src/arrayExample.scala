

object arrayExample extends App{
  
  def fillArray(ar1:Array[Int],value:Int,index:Int){
    if(index<ar1.length){
      ar1(index) = value
      fillArray(ar1,5,index+1)
    } else println("End of fillArray")
  }
  
  def readArray(ar2:Array[Int],index:Int){
    if(index<ar2.length){
      ar2(index) = readInt
      readArray(ar2,index+1)
    }else println("end of readArray.")
  }
  
  def printArray(ar1:Array[Int],index:Int){
    if(index<ar1.length){
      println(ar1(index))
      printArray(ar1,index+1)
    }
  }
  
  def sumArray(arr:Array[Int],index:Int):Int = if(arr.length <= index) 0 else arr(index) + sumArray(arr,index+1)
  
  
  val arr=new Array[Int](5)
  fillArray(arr,5,0)
  printArray(arr,0)
  readArray(arr,0)
  printArray(arr,0)
  println(sumArray(arr,1))
  
  
}