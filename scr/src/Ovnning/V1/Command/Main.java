package Ovnning.V1.Command;

import Ovnning.V1.Command.commands.BlurCommand;
import Ovnning.V1.Command.commands.GrayscaleCommand;
import Ovnning.V1.Command.commands.RotateCommand;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @author Hamed Adeli,
 * h.adeli.meadeli@gmail.com
 * 1/21/2021
 */

public class Main {

    public static void main(String[] args) {
        ImageProcessingPipeline processingPipeline = new ImageProcessingPipeline();
        processingPipeline.addCommand(new BlurCommand());
        processingPipeline.addCommand(new GrayscaleCommand());
        processingPipeline.addCommand(new RotateCommand());

        try {
            BufferedImage image = ImageIO.read(new File("C:\\temp\\command\\image.png"));
            image = processingPipeline.execute(image);
            ImageIO.write(image, "png", new File("C:\\temp\\command\\image_out.png"));
        } catch (IOException exception) {

        }
    }
}