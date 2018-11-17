
object avgGroup extends App{
  
  def averageGroups(lst:List[Double],size:Int):List[Double] = {
    if(lst.size <= size) List(lst.sum/lst.length)
    else (lst.take(size).sum / size) :: averageGroups(lst.drop(size),size)
  }
  
  def averageGroups1(lst:List[Double],size:Int):List[Double] = {
    if(lst.size <= size) List(lst.sum/lst.length)
    else {
      val (first,rest) = lst.splitAt(size)
      (lst.take(size).sum / size) :: averageGroups(rest,size)
    }
  }
  
  val list = List(1.5,3.5,3.4,5.4,5.2,6,8)
  println(averageGroups(list,2).toString)
  println(averageGroups1(list,2).toString)
  
}