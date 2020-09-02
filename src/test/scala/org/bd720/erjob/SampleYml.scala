package org.bd720.erjob
import scala.beans.BeanProperty
class SampleYml {
  @BeanProperty var title = ""
  @BeanProperty var date = ""
  @BeanProperty var owner = ""
  @BeanProperty var tags = new java.util.ArrayList[String]()
  var comment = ""
  override def toString: String = s"title: $title, owner: $owner, tags: $tags"
}