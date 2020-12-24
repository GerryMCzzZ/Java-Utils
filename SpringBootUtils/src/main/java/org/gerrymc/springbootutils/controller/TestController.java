package org.gerrymc.springbootutils.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author CXD
 * @Description
 * @date 2020/12/15
 */

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/hi")
    public String test() {
        return "Hello,World!";
    }
}
