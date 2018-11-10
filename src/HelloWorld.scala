object HelloWorld extends App{
  println("Hello, World!" + 50L)
  
  println("How many seconds?")
  val totalSeconds = scala.io.StdIn.readInt()
  val secondsInDay = 24*60*60 //This is the number of seconds in a day
  val secondsInYear = 365*secondsInDay
  val secondsInMonth = 30*secondsInDay
  val years = totalSeconds / secondsInYear
  val secondsLeftInYear = totalSeconds % secondsInYear
  val month = secondsLeftInYear / secondsInMonth
  val secondsLeftInMonth = secondsLeftInYear % secondsInMonth
  val day = secondsLeftInMonth / secondsInDay
  
  println("You will turn "+totalSeconds +" seconds at "+years+" years, "+month+" months, "+day+" days.")
  
  val age = readInt
  println(if(age<21) {println("hi"); println("You are yet to grow")} else "Your grown up!")
  
}