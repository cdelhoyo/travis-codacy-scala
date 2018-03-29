package com.autentia.traviscodacyscala

import javax.validation.constraints.NotNull
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

import scala.beans.BeanProperty

@Component
@ConfigurationProperties("traviscodacyscala.properties")
class PropertiesBundle {

  @BeanProperty @NotNull var greeting1: String = _
  @BeanProperty @NotNull var greeting2: String = _
  @BeanProperty @NotNull var greeting3: String = _
  @BeanProperty @NotNull var greeting4: String = _

}
