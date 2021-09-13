import java.net.URL;

public class FileDownloadProxy implements Downloader{
    private FileDownloader fileDownloader;



    public FileDownloadProxy() {
        this.fileDownloader = new FileDownloader();
    }


    @Override
    public void download(URL url, String path) {
    fileDownloader.download(url,path);
    }
}
