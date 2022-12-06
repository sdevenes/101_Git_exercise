import java.net.URL
import java.nio.file.{FileSystems, Files, Paths}
import scala.jdk.CollectionConverters.ListHasAsScala

object OpenAllFiles extends App {
  var s:String=""
  for (fileName <- Files.list(Paths.get("res/")).toList.asScala.sorted) {
    println(s"fileName:$fileName")
    s += scala.io.Source.fromFile(fileName.toFile).mkString+","
  }
  println(s"s:$s")
}
