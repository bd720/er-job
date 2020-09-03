package org.bd720.erjob.io
import org.scalatest.flatspec.AnyFlatSpec
import org.bd720.erjob.TestDirs
class ApplicationConfigurationLoaderTest extends AnyFlatSpec {
  it should "load app config" in {
    val yamlPath = TestDirs.resolveTestResourcePath("sample/yml/application.yml")
    val flowsConf = ApplicationConfigurationLoader.load(yamlPath)
    assertResult(1)(flowsConf.spark.size)
  }
}
