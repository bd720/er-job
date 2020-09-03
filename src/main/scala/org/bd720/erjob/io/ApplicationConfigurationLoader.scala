package org.bd720.erjob.io
import java.io.{File, FileInputStream}
import org.bd720.erjob.io.configuration.ERJobConfiguration
import org.bd720.erjob.io.configuration.application.ApplicationConfiguration
import org.bd720.ercore.common.SparkAppConfiguration
import org.yaml.snakeyaml.Yaml
import org.yaml.snakeyaml.constructor.Constructor
object ApplicationConfigurationLoader {
  def load(yamlPath: String): ApplicationConfiguration = {
    val file = new FileInputStream(new File(yamlPath))
    val yaml = new Yaml(new Constructor(classOf[ApplicationConfiguration]))
    val sparkAppConf = yaml.load(file).asInstanceOf[ApplicationConfiguration]
    sparkAppConf
  }
  def loadSparkConf(yamlPath: String): SparkAppConfiguration = {
    appConfig2SparkConfig(load(yamlPath))
  }
  def appConfig2SparkConfig(appConf: ApplicationConfiguration): SparkAppConfiguration = {
    val sparkAppConf = new SparkAppConfiguration()
    sparkAppConf.master = appConf.getSetting("master", "N/A")
    sparkAppConf.enableHiveSupport = appConf.getSetting("enableHiveSupport", "true").toBoolean
    sparkAppConf.options ++= appConf.spark.map(x => Map(x.key -> x.value)).reduce(_ ++ _)
    sparkAppConf
  }
  def main(args: Array[String]): Unit = {
    val a = load("/Users/mac/Development/learn/er-job/src/main/resources/application.yml")
    println(a)
    println(appConfig2SparkConfig(a))
  }
}
