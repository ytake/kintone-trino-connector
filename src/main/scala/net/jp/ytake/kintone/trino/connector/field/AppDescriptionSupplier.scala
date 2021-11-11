package net.jp.ytake.kintone.trino.connector.field

import io.trino.spi.connector.ConnectorSession
import io.trino.spi.connector.SchemaTableName
import net.jp.ytake.kintone.trino.connector.KintoneAppDescription

trait AppDescriptionSupplier {

  /**
   * @param session
   * @param schemaTableName
   * @return
   */
  def getTopicDescription(
                           session: ConnectorSession,
                           schemaTableName: SchemaTableName
                         ): Option[KintoneAppDescription]
}
