package com.metrosys.rewards;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RewardController {
    
    @GetMapping("/getreward")
    public RewardReport getreward(){
        return new RewardReport();
    }

}
