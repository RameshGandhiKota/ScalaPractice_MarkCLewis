
object dynamicLengthArgsToFunction extends App{
  
  def averages(nums:Double*) = nums.sum / nums.length
  
  println(averages(1,2,4))
  println(averages(2,5))
  
  val grades = List(2.4,5.8,3.6)
  println(averages(grades:_*))
  
}