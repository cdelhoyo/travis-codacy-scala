package com.autentia.traviscodacyscala.services

import com.autentia.traviscodacyscala.PropertiesBundle
import com.autentia.traviscodacyscala.model.Greeting
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class GreetingService @Autowired()(properties: PropertiesBundle) {

  def get: Greeting = new Greeting(s"Hey!, ${properties.greeting1}")

}
