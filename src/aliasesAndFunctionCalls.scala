
object aliasesAndFunctionCalls extends App{
  
  def setInArray(arr:Array[Int],index:Int,val1:Int) = arr(index) = val1
  
  def setAllTo(arr:Array[Int],index:Int,val1:Int) {
    if(index<arr.length){
      arr(index)=val1
      setAllTo(arr,index+1,val1)
    }
  }
  
  val arr = Array(1,2,3,4,5)
  val arr2 = arr
  val arr3 = arr.map(f => f)
  
  println("arr is :" + arr.toList + " And arr2 is :" + arr2.toList + " And arr3 is :" + arr3.toList )
  arr3(3) = 44
  println("arr is :" + arr.toList + " And arr2 is :" + arr2.toList + " And arr3 is :" + arr3.toList )
  setInArray(arr3,3,81)
  println("arr is :" + arr.toList + " And arr2 is :" + arr2.toList + " And arr3 is :" + arr3.toList )
  setAllTo(arr3,3,99)
  println("arr is :" + arr.toList + " And arr2 is :" + arr2.toList + " And arr3 is :" + arr3.toList )
  
}