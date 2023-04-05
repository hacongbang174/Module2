package ProxyPattern;

import java.io.IOException;

public class FileDownloaderProxy implements Downloader{
    private FileDownloader fileDownloader;

    public FileDownloaderProxy() {
        fileDownloader = new FileDownloader();
    }

    public FileDownloaderProxy(FileDownloader fileDownloader) {
        this.fileDownloader = fileDownloader;
    }

    @Override
    public void download(String url, String filePath) throws IOException {
        fileDownloader.download(url,filePath);
    }
}
