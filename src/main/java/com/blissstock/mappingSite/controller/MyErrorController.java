// package com.blissstock.mappingSite.controller;

// import javax.servlet.RequestDispatcher;
// import javax.servlet.http.HttpServletRequest;

// import org.springframework.boot.web.servlet.error.ErrorController;
// import org.springframework.http.HttpStatus;
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.RequestMapping;

// @Controller
// public class MyErrorController implements ErrorController {

//     @RequestMapping("/error")
//     public String handleError(HttpServletRequest request) {
//         // get error status
//         Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
//         System.out.println("Error Status"+status);

//         if (status != null) {
//             int statusCode = Integer.parseInt(status.toString());

//             // display specific error page
//             if (statusCode == HttpStatus.NOT_FOUND.value()) {
//                 System.out.println("404 Error"+HttpStatus.NOT_FOUND.value());
//                 return "404";
//             } else if (statusCode == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
//                 System.out.println("500 Error"+HttpStatus.INTERNAL_SERVER_ERROR.value());
//                 return "500";
//             } 
//             // else if (statusCode == HttpStatus.FORBIDDEN.value()) {
//             //     return "403";
//             // }
//         }

//         // display generic error
//         return "error";
//     }
// }