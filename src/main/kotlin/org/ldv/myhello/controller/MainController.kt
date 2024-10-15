package org.ldv.myhello.controller

import jakarta.servlet.http.HttpServletRequest
import org.intellij.lang.annotations.Language
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.ui.Model
import org.springframework.ui.set

@Controller
class MainController {
/*  @GetMapping("/")
    @ResponseBody
    fun myResponse(): String{
        return "Hello World du Controler !"
    }
*/
    @GetMapping("/hello")
    @ResponseBody
    fun querryString(@RequestParam querry : Map< String, String>): String{
        val nom = querry["nom"] ?: ""
        val prenom = querry["prenom"] ?: ""
        return "Hellods ${nom} ${prenom}!"
    }

    @GetMapping("/hello-{language}")
    @ResponseBody
    fun findLanguage(@PathVariable("language") language: String, request: HttpServletRequest) : String{
        return "vous connaissez le langage ${language}"
    }

    @GetMapping("/test")
    fun index(model: Model): String{
        model["monTitre"] = "Exemple d'une"
        model["monParagraphe"] = "Ce paragraphe a été généré ghhdynamiqeument avec Thymeleaf."
        return "index"
    }

}