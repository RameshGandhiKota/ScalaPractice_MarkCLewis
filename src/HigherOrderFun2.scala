
object HigherOrderFun2 extends App{
  
/*  def readAndSum(n:Int):Int={
    if(n<1) 0 else{
      readInt + readAndSum(n-1)
    }
  }
  
  def readAndProd(n:Int):Int={
    if(n<1) 1 else
      readInt * readAndProd(n-1)
  }*/
 
  // Abstract recursive function
  def readAndCombine(n:Int,base:Int,combineFunc:(Int,Int)=> Int):Int={
    if(n<1) base else combineFunc(readInt,readAndCombine(n-1,base,combineFunc))
  }
  
  println("Enter number of values:")
  val n=readInt
  println("Enter operation to perform:")
  val base=readLine
  println("Enter the values:")
  //if (base==0) println(readAndCombine(n,base, (x,y) => x+y))
  //if (base==1) println(readAndCombine(n,base, (x,y) => x*y))
  
  //OR
  if (base=="sum") println("Results are :"+readAndCombine(n,0, _+_))
  if (base=="product") println("Results are :"+readAndCombine(n,1, _*_))  
  
}