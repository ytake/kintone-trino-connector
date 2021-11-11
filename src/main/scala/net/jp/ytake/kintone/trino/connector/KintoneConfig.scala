package net.jp.ytake.kintone.trino.connector

import io.airlift.configuration.Config

final class KintoneConfig {

  private var domain: String = ""
  private var basicUsername: String = ""
  private var basicPassword: String = ""
  private var username: String = ""
  private var password: String = ""
  private var query: String = ""

  @Config("kintone.domain")
  def setDomain(domain: String): this.type = {
    this.domain = domain
    this
  }

  @Config("kintone.username")
  def setUsername(name: String): this.type = {
    this.username = name
    this
  }

  @Config("kintone.password")
  def setPassword(password: String): this.type = {
    this.password = password
    this
  }

  @Config("kintone.basic_username")
  def setBasicUsername(name: String): this.type = {
    this.basicUsername = name
    this
  }

  @Config("kintone.basic_password")
  def setBasicPassword(password: String): this.type = {
    this.basicPassword = password
    this
  }

  @Config("kintone.query")
  def setQuery(query: String): this.type = {
    this.query = query
    this
  }
}
