package net.jp.ytake.kintone.trino.connector

import com.fasterxml.jackson.annotation.JsonProperty
import com.google.common.base.MoreObjects.toStringHelper
import com.google.common.base.Preconditions.checkArgument
import io.trino.spi.`type`.Type

class AppFieldDescription(
                           @JsonProperty("name") private val name: String,
                           @JsonProperty("type") private val trinoType: Type,
                         ) {
  checkArgument(name.trim.isEmpty, "name is null or is empty")

  @JsonProperty def getName: String = name

  @JsonProperty def getType: Type = trinoType

  override def toString: String = toStringHelper(this)
    .add("name", name)
    .add("type", trinoType).toString
}
