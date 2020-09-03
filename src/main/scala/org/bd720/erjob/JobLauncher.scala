package org.bd720.erjob
import java.io.File
import org.apache.spark.sql.{SaveMode, SparkSession}
import org.bd720.erjob.JobLauncherLocally.{createLocalSparkSession, getClass, log}
import org.bd720.erjob.io.configuration.flow.FlowSetting
import org.bd720.erjob.io.configuration.{Input, Output, SourcePair}
import org.bd720.erjob.io.{ApplicationConfigurationLoader, ERJobConfigurationLoader, FlowsConfigurationLoader}
import org.bd720.ercore.ERFlowLauncher
import org.bd720.ercore.common.SparkEnvSetup
import org.bd720.ercore.methods.util.CommandLineUtil
object JobLauncher extends SparkEnvSetup {
  def main(args: Array[String]): Unit = {
    val appConfPath = CommandLineUtil.getParameter(args, "appConfig", "src/main/resources/application.yml")
    val sparkConf = ApplicationConfigurationLoader.loadSparkConf(appConfPath)
    log.info("sparkConf=" + sparkConf)
    val spark = createSparkSession(getClass.getName, appConf = sparkConf)
    BaseJobLauncher.main(args)
  }
}
