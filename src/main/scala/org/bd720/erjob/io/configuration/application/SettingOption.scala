package org.bd720.erjob.io.configuration.application
import scala.beans.BeanProperty
class SettingOption {
  @BeanProperty var key: String = ""
  @BeanProperty var value: String = ""
  override def toString: String = s"SettingOption(key: $key value: $value)"
}
