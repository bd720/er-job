package org.bd720.erjob.io.configuration
import scala.beans.BeanProperty
class SourcePair {
  @BeanProperty var name: String = ""
  @BeanProperty var sourcePair: Array[String] = Array()
  @BeanProperty var idFields: Array[String] = Array()
  @BeanProperty var source1AdditionalExtractFields: Array[String] = Array()
  @BeanProperty var source2AdditionalExtractFields: Array[String] = Array()
  @BeanProperty var joinFields: Array[JoinFieldPair] = Array()
  @BeanProperty var source1Filters: Array[SourceFilterOption] = Array()
  @BeanProperty var source2Filters: Array[SourceFilterOption] = Array()
  @BeanProperty var statePath: String = ""
  @BeanProperty var forcedRun: Boolean = false
  @BeanProperty var joinResultFile: String = ""
  override def toString: String = s"SourcePair(name: $name," +
    s" statePath: $statePath," +
    s" forcedRun: $forcedRun," +
    s" joinResultFile: $joinResultFile," +
    s" sourcePair: ${sourcePair.toList}," +
    s" joinFields: ${joinFields.toList}, " +
    s" idFields: ${idFields.toList}" +
    s")"
}
