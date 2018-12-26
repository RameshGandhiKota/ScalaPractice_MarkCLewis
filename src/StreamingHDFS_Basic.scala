

import org.apache.spark.streaming.Seconds
import org.apache.spark.streaming.StreamingContext

object StreamingHDFS_Basic{
  def operations(fileName:String, microBatchfreq:Int){
    val ssc = new StreamingContext(sc, Seconds(microBatchfreq))
    val fileDStream = ssc.textFileStream(fileName)

    fileDStream.foreachRDD { x => { x.foreach { record => println(record) } } }
  
 }
  
  def main(args:Array[String]) {
      val streaming = operations("file:///usr/spark-2.2.0/data/streaming",5)
      streaming.start()
      streaming.awaitTermination()
      //streaming.stop()    
  }

}




