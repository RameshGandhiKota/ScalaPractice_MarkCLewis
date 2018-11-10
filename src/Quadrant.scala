object Quadrant extends App{
  
  println("Enter X-coordinate:")
  val x=readDouble
 
  println("Enter Y-coordinate:")
  val y=readDouble
  
  if(x>=0 && y>=0) println(s"X and Y values ($x,$y) are in 1st Quadrent")
  else if(x<0 && y>=0) println(s"X and Y values ($x,$y) are in 2nd Quadrent")
  else if(x<0 && y<0) println(s"X and Y values ($x,$y) are in 3rd Quadrent")
  else if(x>=0 && y<0) println(s"X and Y values ($x,$y) are in 4th Quadrent")
  else println(s"X and Y values ($x,$y) are invalid numbers to fit in Quadrent")
  
  /*
   * OR
   */
 
  val results=if(x>=0){
    if(y>=0)
      s"X and Y values ($x,$y) are in 1st Quadrent"
    else
      s"X and Y values ($x,$y) are in 4th Quadrent"
  } else{
    if(y>=0)
      s"X and Y values ($x,$y) are in 2nd Quadrent"
    else
      s"X and Y values ($x,$y) are in 3rd Quadrent"
  }
  println(results)
}