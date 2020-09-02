package org.bd720.erjob.io.configuration
import scala.beans.BeanProperty
class FlowSetting {
  def getOptionValue(key: String): Any = {
    options.filter(_.key == key).head.value
  }
  @BeanProperty var name: String = ""
  @BeanProperty var options: Array[FlowSettingOption] = Array()
  override def toString: String = s"FlowSetting(name: $name options: ${options.toList})"
}
