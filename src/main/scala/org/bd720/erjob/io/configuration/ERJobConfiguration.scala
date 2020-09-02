package org.bd720.erjob.io.configuration
import scala.beans.BeanProperty
class ERJobConfiguration {
  @BeanProperty var input: Input = new Input()
  @BeanProperty var output: Output = new Output()
  @BeanProperty var sourcesPairs: Array[SourcePair] = Array()
  @BeanProperty var useFlow: String = ""
  override def toString: String = s"ERJobConfiguration(input: $input, " +
    s"output: $output, " +
    s"useFlow: $useFlow, " +
    s"sourcesPairs: ${sourcesPairs.toList}" +
    s")"
}
