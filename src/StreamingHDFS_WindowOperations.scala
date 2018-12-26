

import org.apache.spark.streaming.Seconds
import org.apache.spark.streaming.StreamingContext
import org.apache.spark.streaming.Duration

object StreamingHDFS_WindowOperations{
  
  def operations(fileName:String, microBatchScnds:Int) {
    val ssc = new StreamingContext(sc, Seconds(microBatchScnds))
    val windowLength = new Duration(20 * 1000)
    val slideInterval = new Duration(10 * 1000)
    
    val fileDStream = ssc.textFileStream(fileName)
    val window = fileDStream.window(windowLength,slideInterval)
    fileDStream.foreachRDD { x => { x.foreach { record => println(record) } } }
    window.print    
  }
  
  
  def main(args:Array[String]){  
    val streaming = operations("file:///usr/spark-2.2.0/data/streaming",5)
    streaming.start()
    streaming.awaitTermination()
    //ssc.stop() 
  }

}