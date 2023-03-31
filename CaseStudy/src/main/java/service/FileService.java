package service;

import repository.IModel;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.lang.Class;
import java.util.PrimitiveIterator;

public class FileService {

    public <T> List<T> readData(String filePath, Class<T> tClass) throws IOException {
        List<T> list = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(filePath);
            bufferedReader = new BufferedReader(fileReader);
            String str = "";
            while ((str = bufferedReader.readLine()) != null) {
                IModel<T> iModel = (IModel<T>) tClass.getDeclaredConstructor().newInstance();
                T temp = iModel.parseData(str);
                list.add(temp);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } finally {
            bufferedReader.close();
            fileReader.close();
        }
        return list;
    }
    public static <T> void writeData(String filePath, List<T> list) throws IOException {
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;
        try {
            fileWriter = new FileWriter(filePath);
            printWriter = new PrintWriter(fileWriter);
            for (int i = 0; i < list.size(); i++) {
                printWriter.write(list.get(i).toString());
                if(i != (list.size() - 1)) {
                    printWriter.write("\n");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            printWriter.close();
            fileWriter.close();
        }
    }
}
