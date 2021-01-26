package Ovnning.V1.Command.commands;

import java.awt.image.BufferedImage;

/**
 * @author Hamed Adeli,
 * h.adeli.meadeli@gmail.com
 * 1/21/2021
 */
public interface ImageProcessingCommand {
    public BufferedImage process(BufferedImage image);
}
