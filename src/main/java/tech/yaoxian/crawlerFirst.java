package tech.yaoxian;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class crawlerFirst {
    public static void main(String[] args) throws IOException {
        //打开浏览器
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //请求
        HttpGet httpGet=new HttpGet("http://www.baidu.com");
        String s=null;
        CloseableHttpResponse response=null;
        //接收
        try{
           response = httpClient.execute(httpGet);
            //判断
            if (response.getStatusLine().getStatusCode()==200){
                 s= EntityUtils.toString(response.getEntity(),"UTF-8");
                System.out.println(s);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (response==null){
                try {
                    response.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                    httpClient.close();
            }
        }
    }
}
