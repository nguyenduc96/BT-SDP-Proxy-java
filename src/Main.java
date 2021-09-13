import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) {
        FileDownloadProxy fileDownloadProxy = new FileDownloadProxy();
        URL url;
        try {
            url = new URL("https://developer.chrome.com/docs/multidevice/user-agent/");
            fileDownloadProxy.download(url, "file.txt");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
