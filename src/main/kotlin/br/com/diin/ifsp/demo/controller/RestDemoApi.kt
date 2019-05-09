package br.com.diin.ifsp.demo.controller

import br.com.diin.ifsp.demo.data.HelloDTO
import br.com.diin.ifsp.demo.services.HelloService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/demo")
class RestDemoApi {

	@Autowired
	lateinit var helloService: HelloService

	@GetMapping("/hello")
	fun hello(): String {
		return "Hey Hoo"
	}

	@GetMapping("/hello/{valor}")
	fun valor(@PathVariable("valor") valor: String) : String {
		return "---> " + valor
	}

	@GetMapping("/hellodto")
	fun helloDTO(): HelloDTO {
		return HelloDTO("Hello DTO")
	}

	@GetMapping("/helloservice")
	fun helloService() : HelloDTO {
		return helloService.getHello()
	}

}