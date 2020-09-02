package org.bd720.erjob.io
import org.scalatest.flatspec.AnyFlatSpec
import org.bd720.erjob.TestDirs
class ERJobConfigurationLoaderTest extends AnyFlatSpec {
  it should "load er job configuration" in {
    val yamlPath = TestDirs.resolveTestResourcePath("sample/yml/er-job-configuration.yml")
    val erJobConf = ERJobConfigurationLoader.load(yamlPath)
    assertResult("csv")(erJobConf.input.dataType)
    assertResult("csv")(erJobConf.output.dataType)
    assertResult("SampleFLow")(erJobConf.useFlow)
    assertResult(2)(erJobConf.sourcesPairs.size)
    assertResult("Test Join")(erJobConf.sourcesPairs(0).name)
    assertResult(Array("t_id", "p_id"))(erJobConf.sourcesPairs(0).idFields)
    assertResult(true)(erJobConf.sourcesPairs(0).forcedRun)
    assertResult(false)(erJobConf.sourcesPairs(1).forcedRun)
  }
}
