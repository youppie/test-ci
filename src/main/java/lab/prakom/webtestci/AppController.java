package lab.prakom.webtestci.controller

import org.springframework.stereotype.controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class AppController{
	@RequestMapping(value = ["/"])
	fun getHome(): String = "awal"
}