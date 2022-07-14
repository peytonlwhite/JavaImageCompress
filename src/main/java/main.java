import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class main {

    public static void main(String[] args) throws IOException {
        System.out.println("Image Util - compress");

        //get an image from file
        //3MB
        File file = new File("/Users/peytonwhite/Documents/largeimage.jpeg");

        //get the bytes
        byte[] orgImage = Files.readAllBytes(file.toPath());

        //3MB
        System.out.println("Org Image Bytes(KB): " + orgImage.length / 1024f);

        //compress image below 2MB
        orgImage = ImageUtil.compressImage(orgImage,1);

        System.out.println("After Image Bytes(KB): " + orgImage.length / 1024f);

    }


}
