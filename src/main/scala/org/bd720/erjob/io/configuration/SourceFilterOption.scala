package org.bd720.erjob.io.configuration
import scala.beans.BeanProperty
class SourceFilterOption {
  @BeanProperty var field: String = ""
  @BeanProperty var value: String = ""
  override def toString: String = s"SourceFilterOption(field: $field, value: $value)"
}
