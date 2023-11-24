package com.techmarket.productservice.utils;

import org.springframework.beans.factory.annotation.Value;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonConverter {

    @Value("${pathJson}")
    public static final String fileAbsolutePath = "src/test/resources/json/";

    private JsonConverter(){}

    public static String loadJsonFromFile(String fileName) throws IOException {
        String fileLocation = fileAbsolutePath + fileName;
        byte[] fileBytes = Files.readAllBytes(Paths.get(fileLocation));
        return new String(fileBytes, StandardCharsets.UTF_8);
    }


}
