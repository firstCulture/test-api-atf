package com.herokuapp.booker.restful.util;

import lombok.SneakyThrows;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileUtil {

    /**
     * Get file and parse it to string
     *
     * @param url path to the file
     * @return String with content of parsed file
     */
    @SneakyThrows
    public static String getFile(String url) {
        return new String(Files.readAllBytes(Paths.get(new File(url).getPath())));
    }

    /**
     * Get file and parse it to string
     *
     * @param url path to the file
     * @return String with content of parsed file
     */
    @SneakyThrows
    public static String readFileAsString(String url) {
        return new String(Files.readAllBytes(Paths.get(url)));
    }

    /**
     * Parse file to JSONObject
     *
     * @param fileName file to b parsed
     * @return JSONObject
     */
    @SneakyThrows
    public static JSONObject parseJsonFile(String fileName) {
        JSONParser parser = new JSONParser();
        return (JSONObject) parser.parse(new FileReader(fileName));
    }

}
