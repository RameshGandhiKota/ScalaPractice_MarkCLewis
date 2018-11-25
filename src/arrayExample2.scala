

object arrayExample2 extends App{
  
  def readAllLines(index:Int,data:Array[String]) {
    if(index < data.length){
      data(index) = readLine
      readAllLines(index+1,data)
    }
    
  }
  
  println("""
  arr(0) = "1,2,3,4,5,6,7,71,45"
  arr(1) = "1,2,3,4,5,6,7,72,45"
  arr(2) = "1,2,3,4,5,6,7,73,45"
  arr(3) = "1,2,3,4,5,6,7,74,45"
  arr(4) = "1,2,3,4,5,6,7,75,45"
  arr(5) = "1,2,3,4,5,6,7,76,45"
  arr(6) = "1,2,3,4,5,6,7,..,45"
  arr(7) = "1,2,3,4,5,6,7,78,45"
  arr(8) = "1,2,3,4,5,6,7,79,45"
  arr(9) = "1,2,3,4,5,6,7,88,45"
  """)
  
  println("Enter no. of lines to read:")
  
  val numLines = readInt
  val lines = new Array[String](numLines)
  
  //Class object(above) VS Scala object(below)  
  //val line = Array[String](numLines.toString)
  
  println("Enter elements one by one:")
  readAllLines(0,lines)
  
  val highs = lines.filter(!_.contains(",..,")).map( x => {
    val parts = x.split(",")
    parts(7).toDouble
  })
  
  println("Max hot temperature :" + highs.max)
  println("Hot days >50 are :" + highs.count(_>50)) 
    
}