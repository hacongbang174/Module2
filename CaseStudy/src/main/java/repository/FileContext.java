package repository;

import service.FileService;

public class FileContext<T> {
    protected Class<T> tClass;
    protected String filePath;
    private FileService fileService;
    public FileContext () {
        fileService = new FileService();
    }
}
