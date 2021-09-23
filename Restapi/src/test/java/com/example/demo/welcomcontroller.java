 package java.com.controller

 
 import org.springframework.web.bind.annotation.GetMapping;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RestController;


 @RestController
 @RequestMapping("api/welcom")
 public class welcomcontroller() {
     
    @GetMapping
    public string welcom(){
        return "welcom to Rest api"
    }
 }