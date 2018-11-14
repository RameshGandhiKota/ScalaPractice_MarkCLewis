

object listExample extends App{
  
  //Read list of given length
  def readList(n:Int):List[Int]= if(n>0) readInt :: readList(n-1) else Nil
  
  //Read list of unknown length
  def readNList:List[Int] = {
    val word = readLine
    if(word.toLowerCase == "quit") Nil else {
      try {
         word.toInt::readNList  
      } catch {
        case ne:NumberFormatException  => println("System accepts only Integers. You entered:\"" + word + "\"\nPlease enter Int value or quit" )
        //Stopped reading inputs!
        //Nil
        readNList
      }
      
    }
  }
  
  // Sum List
  def sumList(list:List[Int]):Int = if(list.isEmpty) 0 else list.head.toInt + sumList(list.tail) 
  
  //List of tuples with names and age
  def detailsList:(List[(String,Int)]) = {
    val word = readLine
    if(word.toLowerCase == "quit" ) {
      println("QUIT")
      Nil
    }
    else {
      try{
        val age = readLine
        (word,age.toInt) :: detailsList
      } catch {
        case ne:NumberFormatException => println("You entered non-integer as age. \nPlease enter name and age again!")
        detailsList
      }
      
    }
  }
  
  //Find youngest person
  /*def yngrList(lst:List[(String,Int)],name:String,age:Int):(String,Int) = {
    if(lst.isEmpty) ( name, age )
    else {
      if(age < lst.head._2) yngrList(lst.tail,name,age) else yngrList(lst.tail,lst.head._1,lst.head._2)
    }      
  }*/
  def yngrList(lst:List[(String,Int)]):(String,Int) = {
    if(lst.length == 1) lst.head
    else{
      val yng = yngrList(lst.tail)
      if(lst.head._2 <= yng._2) lst.head else yng
    }
    
  }
  
    
  println("Enter inputs:")   // /list range
  //println("List values are:" + readList(readInt).toString) 
  val list = readNList
  println("List values are:" + list.toString)
  println("Sum of the List values are:" + sumList(list).toString)
 
  println("Please enter Name and age till quit:")
  val dList = detailsList
  println("Valid List values are "+dList.toString)
  
  //val prsn = yngrList(dList,"hi",999999)
  val prsn = yngrList(dList)
  println("Youngest person age is :" + prsn._2 + " and the name is :" + prsn._1)
}