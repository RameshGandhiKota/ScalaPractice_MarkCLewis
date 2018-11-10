

object PointInRect extends App{
  
  /*
   * Example for && and || operators
   */
  
  println("Enter X point value:")
  val pX = readDouble
  println("Enter Y point value:")
  val pY = readDouble
  
  println("Enter X Min value:")
  val rX = readDouble
  println("Enter Y Min value:")
  val rY = readDouble
  
  println("Enter width of X value:")
  val wX = readDouble
  println("Enter width of Y value:")
  val wY = readDouble
  
  val insideX = (rX <= pX) && (pX <= (rX+wX))
  val insideY = (rY <= pY) && (pY <= (rY+wY))
  
  if(insideX && insideY) println("Point is inside Rectangle")
  else println("Point is outside Rectangle")

  //OR
  val outsideX = (rX > pX) || (pX > (rX+wX))
  val outsideY = (rY > pY) || (pY > (rY+wY))
  
  if(outsideX && outsideY) println("Point is outside Rectangle")
  else println("Point is inside Rectangle")

}