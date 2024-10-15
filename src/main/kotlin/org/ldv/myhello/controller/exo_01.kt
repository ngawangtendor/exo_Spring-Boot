package org.ldv.myhello.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.ui.Model
import org.springframework.ui.set




@Controller
class CommandFastFood{
    @GetMapping("/wonderfast/mycommand")
    fun food(@RequestParam params : Map<String, String>, model: Model): String{
        model["nom"] = params["name"] ?: ""
        model["prenom"] = params["surname"] ?: ""
        model["starter"] = params["starter"] ?: ""
        model["maincourse"] = (params["maincourse"] ?: "").replace('_', ' ')
        model["desert"] = (params["desert"] ?: "").replace('_', ' ')
        model["drink"] = params["drink"] ?: ""
        return "exo_01/index_exo_01"
    }

}


