package net.jp.ytake.kintone.trino.connector.field.file

import com.google.inject.Binder
import io.airlift.configuration.AbstractConfigurationAwareModule
import io.airlift.configuration.ConfigBinder.configBinder

final class FieldConfigModule extends AbstractConfigurationAwareModule{

  override def setup(binder: Binder): Unit = {
    configBinder(binder).bindConfig(classOf[FieldConfig])
  }
}
