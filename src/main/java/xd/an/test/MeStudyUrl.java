package xd.an.test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class MeStudyUrl {
    public static void main(String[] args)throws Exception {
        URL url = new URL("http://localhost:8080/emps?pn=1");
        URLConnection urlConnection = url.openConnection();
        InputStream inputStream = urlConnection.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String line = null;
        StringBuffer stringBuffer = new StringBuffer();
        while((line=bufferedReader.readLine())!=null){
            stringBuffer.append(line);
        }
        System.out.println(stringBuffer);

    }
}
