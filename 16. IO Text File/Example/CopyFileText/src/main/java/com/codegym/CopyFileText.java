package com.codegym;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileText {
    public List<String> redFile(String filePath) {
        List<String> strings = new ArrayList<>();
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
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
    public void writeFile(String filePath, List<String> strings) {
        try {
            FileWriter fileWriter = new FileWriter(filePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (int i = 0; i < strings.size(); i++) {
                bufferedWriter.write(strings.get(i) + "\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        CopyFileText copyFileText = new CopyFileText();
        List<String> strings = copyFileText.redFile("D:\\CNTT\\Codegym\\Module2\\16. IO Text File\\Example\\CopyFileText\\src\\main\\java\\com\\codegym\\text.txt");
        copyFileText.writeFile("D:\\CNTT\\Codegym\\Module2\\16. IO Text File\\Example\\CopyFileText\\src\\main\\java\\com\\codegym\\copyText.txt", strings);
    }
}
