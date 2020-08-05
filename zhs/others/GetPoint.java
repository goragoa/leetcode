package others;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

/**
 * @author zhangshuo
 * @Description 得到验证码图片需要填补方块的中心
 * @date 8/5/2020 4:04 PM
 */
public class GetPoint {
    //jpg a300*200 b40*40
    public static void main(String[] args) throws IOException {
        BufferedImage oriImage = ImageIO.read(new FileInputStream("a.jpg"));
        BufferedImage partImage = ImageIO.read(new FileInputStream("b.jpg"));
        //https://www.pkulaw.com/VerificationCode/GetVerifiCodeResult
        int[] bgarray = new int[]{18, 15, 0, 7, 10, 6, 1, 3, 11, 19, 14, 13, 12, 8, 4, 2, 5, 9, 17, 16};
        HashMap<Integer, Integer> location = new HashMap<>();
        for (int i = 0; i < bgarray.length; i++) {
            location.put(bgarray[i], i);
        }
        BufferedImage imageNew = new BufferedImage(300, 200, BufferedImage.TYPE_INT_RGB);
        for (int i = 0; i < bgarray.length; i++) {
            int num = location.get(i);
            BufferedImage tmp = oriImage.getSubimage(0, 0, 30, 100);
            int[] imageArrays = new int[30 * 100];
            tmp.getRGB(0, 0, 30, 100, imageArrays, 0, 30);
            imageNew.setRGB(0, 0, tmp.getWidth(), tmp.getHeight(), imageArrays, 0, tmp.getWidth());
            System.out.println(num);
        }
        ImageIO.write(imageNew, "jpg", new File("ImageNew.jpg"));

    }
}

