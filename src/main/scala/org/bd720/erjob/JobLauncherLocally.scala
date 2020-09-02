package org.bd720.erjob
import java.io.File
import org.apache.spark.sql.{SaveMode, SparkSession}
import org.bd720.erjob.io.configuration.{FlowSetting, Input, Output, SourcePair}
import org.bd720.erjob.io.{ERJobConfigurationLoader, FlowsConfigurationLoader}
import org.wumiguo.ser.ERFlowLauncher
import org.wumiguo.ser.common.SparkEnvSetup
import org.wumiguo.ser.methods.util.CommandLineUtil
object JobLauncherLocally extends SparkEnvSetup {
  def main(args: Array[String]): Unit = {
    log.info("start to run er job locally")
    val outputDir = new File("/tmp/data-er")
    if (!outputDir.exists()) {
      outputDir.mkdirs()
    }
    val jobConfPath = CommandLineUtil.getParameter(args, "jobConfPath", "src/main/resources/er-job-configuration.yml")
    val erJobConf = ERJobConfigurationLoader.load(jobConfPath)
    val output = erJobConf.getOutput
    val spark = createLocalSparkSession(getClass.getName, outputDir = output.path)
    JobLauncher.main(args)
  }
}
