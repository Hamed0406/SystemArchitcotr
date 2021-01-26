package Ovnning.V1.Command;

import Ovnning.V1.Command.commands.ImageProcessingCommand;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 * @author Hamed Adeli,
 * h.adeli.meadeli@gmail.com
 * 1/21/2021
 */
public class ImageProcessingPipeline {
    private ArrayList<ImageProcessingCommand> pipeline=new ArrayList<>();

    public void addCommand(ImageProcessingCommand command) {
        this.pipeline.add(command);

    }
    public BufferedImage execute(BufferedImage image)
    {
        BufferedImage result=image;
        for(ImageProcessingCommand command:pipeline)
        {
            result=command.process(result);
        }
        return result;
    }
}
