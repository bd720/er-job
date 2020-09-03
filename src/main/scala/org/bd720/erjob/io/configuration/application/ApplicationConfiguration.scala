package org.bd720.erjob.io.configuration.application
import org.bd720.erjob.io.configuration.flow.FlowSetting
import scala.beans.BeanProperty
import scala.collection.mutable
class ApplicationConfiguration {
  def getSetting(key: String, defaultValue: String): String = {
    spark.find(_.key == key).getOrElse(option(key, defaultValue)).value
  }
  @BeanProperty var spark: Array[SettingOption] = Array()
  override def toString: String = s"ApplicationConfiguration(spark: ${spark.toList})"
  def option(key: String, value: String) = {
    val opt = new SettingOption
    opt.setKey(key)
    opt.setValue(value)
    opt
  }
}
