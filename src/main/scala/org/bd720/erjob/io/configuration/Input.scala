package org.bd720.erjob.io.configuration
import scala.beans.BeanProperty
class Input {
  @BeanProperty var path: String = ""
  @BeanProperty var dataType: String = ""
  override def toString: String = s"Input(path: $path, dataType: $dataType)"
}
