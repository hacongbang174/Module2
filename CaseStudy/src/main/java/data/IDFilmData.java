package data;

import java.io.*;
import java.net.URL;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FilmData {
    public static void main(String[] args) throws IOException {
        Set<String> filmList = new HashSet<>();
        String urlName = "https://cinestar.com.vn/phimdangchieu";
//        String regex = "film-item-txt\"><h3>(.*?)</h3>";
        String regex = "<a href=\"https://cinestar.com.vn/phim/(.*?)\">";
        String filePath = "D:\\CNTT\\Codegym\\Module2\\CaseStudy\\src\\main\\data\\text.txt";
        readInfoUrl(urlName,regex,filePath, filmList);
    }
    public static void readInfoUrl(String urlName, String regex, String filePath, Set<String> sets) throws IOException {
        try {
            URL url = new URL(urlName);
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream(), "UTF-8"));
            scanner.useDelimiter("\\Z");
            String content = scanner.next();
            scanner.close();
            content.replaceAll("\\n+", "");
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(content);
            while (matcher.find()) {
                System.out.println(matcher.group(1));
                sets.add(matcher.group(1));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        writeToFile(filePath, sets);
    }
    public static void writeToFile(String filePath, Set<String> sets) throws IOException {

        try (
                Writer fos = new OutputStreamWriter(
                        new FileOutputStream(filePath), "UTF-8");
                BufferedWriter oos = new BufferedWriter(fos)
        ) {
            for (String s : sets) {
                oos.write(s.toString());
                oos.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
