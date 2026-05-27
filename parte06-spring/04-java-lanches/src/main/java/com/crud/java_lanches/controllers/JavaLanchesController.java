package com.crud.java_lanches.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.crud.java_lanches.models.Categoria;

@Controller
public class JavaLanchesController {
  @Autowired
  /** 
  * TODO Criar objeto da interface
  *
  */ 

  @RequestMapping("/")
  public String index() {
    return "index";
  }
  
  @RequestMapping(value = "/novaCategoria", method = RequestMethod.GET)
  public String novaCategoria()  {
    return "nova_categoria";
  }

  @RequestMapping(value = "/novaCategoria", method = RequestMethod.POST)
  public String novaCategoria( Categoria categoria ) {
    return "";
  }

  /**
   * @RequestMapping("/novaCategoria") 
   * public String novaCategoria() {
   *   return "nova_categoria";
   * }
  */
}
