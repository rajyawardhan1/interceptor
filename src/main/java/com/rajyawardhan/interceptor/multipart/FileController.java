package com.rajyawardhan.interceptor.multipart;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/file")
@CrossOrigin("http://localhost:8080")
public class FileController {

    @PostMapping
    public void file(@ModelAttribute Test test) {
        System.out.println(
                test.getName() + " " +
                        test.getFile().getOriginalFilename()
        );
    }
}
