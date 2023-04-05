package ProxyPattern;

import java.io.IOException;

public interface Downloader {
    void download(String url, String filePath) throws IOException;
}
