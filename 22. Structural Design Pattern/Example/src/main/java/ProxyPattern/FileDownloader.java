package ProxyPattern;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class FileDownloader implements Downloader{
    private String userAgent;

    public FileDownloader() {
    }

    public FileDownloader(String userAgent) {
        this.userAgent = userAgent;
    }

    @Override
    public void download(String userAgent, String filePath) throws IOException {
        URL url = new URL(userAgent);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestProperty("User-Agent", userAgent);
        try (InputStream in = connection.getInputStream();
             FileOutputStream out = new FileOutputStream(filePath)) {
            byte[] buffer = new byte[1024];
            int len;
            while ((len = in.read(buffer)) > 0) {
                out.write(buffer, 0, len);
            }
        }
    }
}
