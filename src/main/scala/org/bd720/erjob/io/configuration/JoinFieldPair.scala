package org.bd720.erjob.io.configuration
import scala.beans.BeanProperty
class JoinFieldPair {
  @BeanProperty var source1Field: String = ""
  @BeanProperty var source2Field: String = ""
  @BeanProperty var weight: Float = 0
  override def toString: String = s"JoinFieldPair(source1Field: $source1Field, source2Field: $source2Field, w: $weight)"
}
