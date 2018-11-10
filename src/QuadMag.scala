

object QuadMag extends App{
  
  def Quadrant(x:Double,y:Double):Int = {
    if(x<0)
      if(y<0) 3 else 2
    else
      if(y<0) 4 else 1
  }
  
  def fQuadMag(x:Double,y:Double):(Int,Double) = (Quadrant(x,y),math.sqrt(x*x + y*y))

  val iX = readDouble
  val iY = readDouble
  val (quad,mag) = fQuadMag(iX,iY)
  println("Quadrant:"+quad+"\nMagnitude as :"+mag)
  
}