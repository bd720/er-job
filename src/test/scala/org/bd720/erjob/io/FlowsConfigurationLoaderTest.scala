package org.bd720.erjob.io
import org.scalatest.flatspec.AnyFlatSpec
import org.bd720.erjob.TestDirs
class FlowsConfigurationLoaderTest extends AnyFlatSpec {
  it should "load flows config" in {
    val yamlPath = TestDirs.resolveTestResourcePath("sample/yml/flows-sample.yml")
    val flowsConf = FlowsConfigurationLoader.load(yamlPath)
    assertResult(1)(flowsConf.flows.size)
    assertResult(None)(flowsConf.lookupFlow("AA"))
    assertResult("EdJoin")(flowsConf.lookupFlow("EdJoin").get.name)
  }
}
