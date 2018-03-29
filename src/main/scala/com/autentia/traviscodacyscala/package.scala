package com.autentia.traviscodacyscala

import scala.beans.BeanProperty

package object model {

  class Greeting(@BeanProperty var body: String)

}