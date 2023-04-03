package IOBinaryFileSerialization;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File source = new File("D:\\CNTT\\Codegym\\Module2\\Optional\\src\\main\\java\\IOBinaryFileSerialization\\source.txt");
        File dest = new File("D:\\CNTT\\Codegym\\Module2\\Optional\\src\\main\\java\\IOBinaryFileSerialization\\target.txt");
        try {
            copyFile(source,dest);
            System.out.printf("Copy completed \n");
        } catch (IOException ioe) {
            System.out.printf("Can't copy that file");
                System.out.printf(ioe.getMessage());
        }
        try {
            readDataFromFile("D:\\CNTT\\Codegym\\Module2\\Optional\\src\\main\\java\\IOBinaryFileSerialization\\target.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    private static void copyFile(File source, File dest) throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(source);
            outputStream = new FileOutputStream(dest);
            byte[] bytes = new byte[1024];
            int length;
            while ((length = inputStream.read(bytes)) > 0) {

                outputStream.write(bytes,0,length);
            }
        }finally {
            inputStream.close();
            outputStream.close();
        }
    }
    public static void readDataFromFile(String path) throws IOException {
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try{
            fileReader = new FileReader(path);
            bufferedReader = new BufferedReader(fileReader);
//
            String str = null;
            while ((str = bufferedReader.readLine()) != null) {
//                String s = new String(bytes,0,length);
                System.out.println(str);
            }

        }catch(Exception ex){
            ex.printStackTrace();
        }finally {
            fileReader.close();
            bufferedReader.close();
        }
    }
}
