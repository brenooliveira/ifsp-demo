package br.com.diin.ifsp.demo.services

import br.com.diin.ifsp.demo.data.HelloDTO
import org.springframework.stereotype.Service

@Service
class HelloService {

	fun getHello(): HelloDTO {
		return HelloDTO (message = "hello service")
	}
}