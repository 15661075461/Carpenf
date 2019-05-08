import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

import java.io.File;

public class Testpay {
    @Test
    //id获取值
    public void show() throws Exception{
        Document document = Jsoup.parse(new File("D:\\xiaozai\\login.html"),"UTF-8");
        Element element = document.getElementById("mid");
        System.out.println(element.text());
    }
    @Test
    //标签获取值
    public void testGetElety()throws Exception{
        Document document = Jsoup.parse(new File("D:\\xiaozai\\login.html"),"UTF-8");
        Element element = document.getElementsByTag("title").first();
        System.out.println(element.text());
    }
    //class获取值
    @Test
    public void testElent()throws Exception{
        Document document = Jsoup.parse(new File("D:\\xiaozai\\login.html"),"UTF-8");
        Element element = document.getElementsByClass("page-container").last();
        System.out.println(element.text());
    }
    //获取属性值
    @Test
    public void Tested()throws Exception{
        Document document = Jsoup.parse(new File("D:\\xiaozai\\login.html"),"UTF-8");
        Element element = document.getElementsByAttribute("align").first();
        System.out.println(element.text());
    }
}
