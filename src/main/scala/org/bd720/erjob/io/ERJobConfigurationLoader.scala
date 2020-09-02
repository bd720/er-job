package org.bd720.erjob.io
import java.io.{File, FileInputStream, InputStream}
import org.bd720.erjob.io.configuration.ERJobConfiguration
import org.yaml.snakeyaml.Yaml
import org.yaml.snakeyaml.constructor.Constructor
object ERJobConfigurationLoader {
  def load(yamlPath: String) = {
    val file = new FileInputStream(new File(yamlPath))
    val yaml = new Yaml(new Constructor(classOf[ERJobConfiguration]))
    val erJobConf = yaml.load(file).asInstanceOf[ERJobConfiguration]
    erJobConf
  }
}
