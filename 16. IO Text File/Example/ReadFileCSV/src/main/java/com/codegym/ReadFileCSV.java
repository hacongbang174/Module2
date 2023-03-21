package com.codegym;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadFileCSV {
    public static  List<String> readFile(String filePath) {
        List<String> strings = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
//            if(filePath != null) {
//                String[] splitData = filePath.split(",");
//                for (int i = 0; i < splitData.length; i++) {
//                    strings.add(splitData[i]);
//                }
//            }
            String str = "";
            while ((str = br.readLine()) != null) {
                strings.add(str);
            }
            br.close();
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
        return strings;
    }
    private static void printCountry(String[] strings) {
        System.out.println(
                "Country [id= "
                        + strings[0]
                        + ", code= " + strings[1]
                        + " , name=" + strings[2]
                        + "]");
    }

    public static void main(String[] args) {
        ReadFileCSV readFileCSV = new ReadFileCSV();
        List<String> strings = readFileCSV.readFile("D:\\CNTT\\Codegym\\Module2\\16. IO Text File\\Example\\ReadFileCSV\\src\\main\\java\\com\\codegym\\countries.csv");
        List<String> result = new ArrayList<>();
        for (int i = 0; i < strings.size(); i++) {
            result.add(Arrays.toString(strings.get(i).split(",")));
        }
        System.out.println(result);
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(result.get(i));
        }
    }
}
