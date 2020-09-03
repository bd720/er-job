package org.bd720.erjob.io.configuration
import scala.beans.BeanProperty
class SourceFilterOption {
  @BeanProperty var field: String = ""
  @BeanProperty var values: Array[String] = Array()
  override def toString: String = s"SourceFilterOption(field: $field, values: ${values.toList})"
}
