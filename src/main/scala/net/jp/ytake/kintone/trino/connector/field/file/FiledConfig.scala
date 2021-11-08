package net.jp.ytake.kintone.trino.connector.field.file

import io.airlift.configuration.{Config, ConfigDescription}
import java.io.File
import javax.validation.constraints.NotNull

class FiledConfig {

  private var fieldDes : File = new File("etc/kintone/")

  @NotNull def getFiledDescriptionDir: File = fieldDes

  @Config("kintone.filed-description-dir")
  @ConfigDescription("Folder holding JSON description files for kintone fileds")
  def setFiledDescriptionDir(filedDescriptionDir: File): FiledConfig = {
    fieldDes = filedDescriptionDir
    this
  }
}
