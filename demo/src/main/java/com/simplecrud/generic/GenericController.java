// package com.simplecrud.generic;

// import org.springframework.boot.web.servlet.error.ErrorController;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;

// @RestController
// public class GenericController implements ErrorController{

//     private static final String PATH = "/error";

//     @RequestMapping(value = PATH)
//     public String error() {
//         return "this path does not exist";
//     }

//     @Override
//     public String getErrorPath() {
//         return PATH;
//     }
// }