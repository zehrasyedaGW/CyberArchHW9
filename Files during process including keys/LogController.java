package 
import 
import 
com.example
 ;
 LogManager;
 org.apache.logging.log4j.
 org.apache.logging.log4j.
 org.springframework.web.bind.annotation.
 Logger;
 import 
@RestController
 public class LogController {
 private static final Logger logger = 
LogManager.getLogger(LogController.class);
 }
 *;
 @PostMapping("/log")
 public String logInput(@RequestBody String input) {
        logger.info("User input: " + input);
 return "Logged: " + input;
 }