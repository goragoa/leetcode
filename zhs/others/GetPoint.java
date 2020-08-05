package others;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author zhangshuo
 * @Description 得到验证码图片需要填补方块的中心
 * @date 8/5/2020 4:04 PM
 */
public class GetPoint {
    public static void main(String[] args) throws IOException {
        HttpURLConnection connection = null;
        URL url = null;
        try {
            String myurl = "http://img3.duitang.com/uploads/item/201606/03/20160603120505_rwQJP.jpeg";
            url = new URL(myurl);
            connection = (HttpURLConnection) url.openConnection();
            int code = connection.getResponseCode();

            if (code == 200) {  //响应成功
                BufferedImage image = ImageIO.read(connection.getInputStream()); //读取图片文件流
                String path = "image.png";  //创建存储图片文件的路径
                File file = new File(path);
                ImageIO.write(image, "png", file);  //将图片写进创建的路径
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

