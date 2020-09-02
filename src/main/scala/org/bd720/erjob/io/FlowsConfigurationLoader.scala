package org.bd720.erjob.io
import java.io.{File, FileInputStream}
import org.bd720.erjob.io.configuration.FlowsConfiguration
import org.yaml.snakeyaml.Yaml
import org.yaml.snakeyaml.constructor.Constructor
import scala.collection.mutable
object FlowsConfigurationLoader {
  def load(yamlPath: String) = {
    val file = new FileInputStream(new File(yamlPath))
    val yaml = new Yaml(new Constructor(classOf[FlowsConfiguration]))
    val erJobConf = yaml.load(file).asInstanceOf[FlowsConfiguration]
    erJobConf
  }
}
