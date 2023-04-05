package ProxyPattern;

import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException {
        FileDownloaderProxy fileDownloaderProxy = new FileDownloaderProxy();
        fileDownloaderProxy.download("https://tim.codegym.vn/home", "D:\\CNTT\\Codegym\\Module2\\22. Structural Design Pattern\\Example\\src\\main\\java\\ProxyPattern\\text.txt");
    }
}