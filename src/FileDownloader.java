import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class FileDownloader implements Downloader{

    @Override
    public void download(URL url, String path) {
        try {
            URLConnection urlConnection = url.openConnection();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
