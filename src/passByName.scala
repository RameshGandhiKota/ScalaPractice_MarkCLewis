
object passByName extends App{
  
  def defineList(n:Int,x:Double):List[Double] = {
    if(n<1) Nil else x::defineList(n-1,x)
  }
  
  def defineListF(n:Int,x: ()=> Double):List[Double] = {
    if(n<1) Nil else x() :: defineListF(n-1, x)
  }
  
  def defineListN(n:Int,x: => Double):List[Double] = {
    if(n<1) Nil else x :: defineListN(n-1,x)
  }
  
  
  var i=0
  //passByValue function call
  println(defineList(5,{i+=1;println(i);math.random}))
  
  //passByFunction example
  i=0
  println(defineListF(5,{i+=1;println(i);() => math.random}))
  
  //passByName example
  i=0
  println(defineListN(5,{i+=1;println(i);math.random}))
  
  // reading from STDIN
  println(defineList(3,readDouble))
  println(defineListF(3,readDouble))
  println(defineListN(3,readDouble))
  
}