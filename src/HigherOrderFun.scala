
object HigherOrderFun extends App{
  
  val sqr = (x:Double) => x*x
  val addOne = (x:Double) => x+1
  
  /*
   * function(func1:func1InputType => func1ReturnType,
   *          func1:func2InputType => func2ReturnType):(functionInputType => functionReturnType) = {
   *             (x:Double) => func1(func2(x)) //returning function
   *          }
   */
  def compose(sqr:Double => Double,addOne:Double => Double):(Int => Double) = {
    //returning function
    (x:Int) => addOne(sqr(x.toDouble))
  }
  
  //Passing functions inside the function
  val res = compose(sqr,addOne)
  println(res('d'))
  
}