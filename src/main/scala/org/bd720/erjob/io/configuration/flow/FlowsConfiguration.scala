package org.bd720.erjob.io.configuration.flow
import scala.beans.BeanProperty
class FlowsConfiguration {
  def lookupFlow(flow: String): Option[FlowSetting] = {
    getFlows.filter(_.name == flow).headOption
  }
  @BeanProperty var flows: Array[FlowSetting] = Array()
  override def toString: String = s"FlowsConfiguration(flows: ${flows.toList})"
}
