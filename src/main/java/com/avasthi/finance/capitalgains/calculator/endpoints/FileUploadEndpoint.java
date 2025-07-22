package com.avasthi.finance.capitalgains.calculator.endpoints;

import com.avasthi.finance.capitalgains.calculator.services.FileUploadService;
import com.avasthi.finance.capitalgains.calculator.utils.Paths;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.Optional;

@RestController
@RequestMapping(Paths.AY202425.FileUpload.fullPath)
public class FileUploadEndpoint {
    private final FileUploadService fileUploadService;

    FileUploadEndpoint(@Autowired FileUploadService fileUploadService) {
        this.fileUploadService = fileUploadService;
    }
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public Optional<String> save(@RequestParam("file") MultipartFile file) {
        return fileUploadService.save(file);
    }
}
