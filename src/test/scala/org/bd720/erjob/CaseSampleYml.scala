package org.bd720.erjob
import java.util
import scala.beans.BeanProperty
case class CaseSampleYml(title: String, date: String, owner: String, tags: util.ArrayList[String]) {
  override def toString: String = s"title: $title, owner: $owner, tags: $tags"
}