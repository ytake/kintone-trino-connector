package net.jp.ytake.kintone.trino.connector

import com.fasterxml.jackson.annotation.JsonProperty
import com.google.common.base.MoreObjects.toStringHelper

class AppDescription(
                      @JsonProperty val field: Option[AppFieldDescription]
                    ) {

  @JsonProperty def getField: Option[AppFieldDescription] = field

  override def toString: String = toStringHelper(this)
    .add("field", field)
    .toString
}
