package tech.yaoxian.post;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class postcrea {
    public static void main(String[] args) throws IOException {

        CloseableHttpClient httpClient = HttpClients.createDefault();

        HttpPost httpPost=new HttpPost("http://www.baidu.com");
        String s=null;
        CloseableHttpResponse response=null;

        try{
            response = httpClient.execute(httpPost);

            if (response.getStatusLine().getStatusCode()==200){
                s= EntityUtils.toString(response.getEntity(),"UTF-8");
                System.out.println(s.length());
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
