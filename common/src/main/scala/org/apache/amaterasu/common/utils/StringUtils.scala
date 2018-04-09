package org.apache.amaterasu.common.utils

import java.util.regex.Pattern

object StringUtils {

  def containsIgnoreCase(str : String, searchStr : String) : Boolean = {
    Pattern.compile(Pattern.quote(searchStr), Pattern.CASE_INSENSITIVE).matcher(str).find()
  }


  def indexOfIgnoreCase(strs : Seq[String],search : String) : Int = {
    strs.map(_.toLowerCase).indexOf(search)
  }

}
