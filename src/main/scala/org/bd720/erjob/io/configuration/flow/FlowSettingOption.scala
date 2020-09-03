package org.bd720.erjob.io.configuration.flow
import scala.beans.BeanProperty
class FlowSettingOption {
  def option(key: String, value: Any) = {
    val opt = new FlowSettingOption
    opt.setKey(key)
    opt.setValue(value)
    opt
  }
  @BeanProperty var key: String = ""
  @BeanProperty var value: Any = Nil
  override def toString: String = s"FlowSettingOption(key: $key value: $value)"
}
