package com.autentia.traviscodacyscala

import com.autentia.traviscodacyscala.model.Greeting
import com.autentia.traviscodacyscala.services.GreetingService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, RestController}

@RestController
class Controller @Autowired()(greetingService: GreetingService) {

  @RequestMapping(value = Array("/greeting"), method = Array(RequestMethod.GET))
  def greeting: Greeting = greetingService.get

}