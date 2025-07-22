package com.avasthi.finance.capitalgains.calculator.services;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Optional;

@Service
public class FileUploadService {
    public Optional<String> save(MultipartFile file) {

        System.out.println(file.getName());
        return Optional.of("Hello World.");
    }
}
