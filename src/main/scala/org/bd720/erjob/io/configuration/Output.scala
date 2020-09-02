package org.bd720.erjob.io.configuration
import scala.beans.BeanProperty
class Output {
  @BeanProperty var path: String = ""
  @BeanProperty var dataType: String = ""
  @BeanProperty var overwriteOnExist: Boolean = false
  @BeanProperty var showSimilarity: Boolean = false
  override def toString: String = s"Output(path: $path, dataType: $dataType, " +
    s"overwriteOnExist: $overwriteOnExist, showSimilarity: $showSimilarity)"
}
