package in.go2kart.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import jakarta.websocket.server.PathParam;

@RestController
public class FileUpload {
    @RequestMapping("/upload-file")
    public String addPathVar(
            @RequestParam("image") MultipartFile file
    ) {
        System.out.println("file name:" + file.getOriginalFilename());
        System.out.println("file size:" + file.getSize());
        System.out.println("file Type:" + file.getContentType());

        return "file uploaded successfully";
    }
}
