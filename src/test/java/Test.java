import org.apache.commons.io.FileUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class Test {
    @org.junit.Test
    public  void testURl() throws Exception {
        Document document= (Document) Jsoup.parse(new URL("http://www.baidu.com"),1000);
        Element title = document.getElementsByTag("title").first();
        System.out.println(title.text());
    }
    //使用jsoup解析字符串
    @org.junit.Test
    public void testJsoupString() throws Exception {
        //读取文件获取
        Document document = Jsoup.parse(new File("D:\\xiaozai\\login.html"),"UTF-8");
        Element title = document.getElementsByTag("title").first();
        System.out.println(title.text());

    }
}
