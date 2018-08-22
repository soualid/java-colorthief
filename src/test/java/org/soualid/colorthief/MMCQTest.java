package org.soualid.colorthief;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

import javax.imageio.ImageIO;

import junit.framework.TestCase;

import org.soualid.colorthief.MMCQ.CMap;
import org.soualid.colorthief.MMCQ.DenormalizedVBox;


public class MMCQTest extends TestCase {

	public void testMMCQ() throws IOException {
		BufferedImage img = ImageIO.read(MMCQTest.class.getResourceAsStream("/photo3.JPG"));
		CMap result = MMCQ.computeMap(img, 10);
		Iterator<DenormalizedVBox> boxes = result.getBoxes().iterator();
		while (boxes.hasNext()) {
			MMCQ.DenormalizedVBox denormalizedVBox = (MMCQ.DenormalizedVBox) boxes.next();
			int[] is = denormalizedVBox.getColor();
			String s = "<div style=\"width:50px; height: 50px; background: rgb("+is[0] + "," + is[1] + "," + is[2] + ");\"></div> " + is[0] + "," + is[1] + "," + is[2]+ " for a volume of " + (denormalizedVBox.getVbox().getVolume(false) + " || on " + denormalizedVBox.getVbox().count(false)) + " pixels, the VBox was ("+denormalizedVBox.getVbox()+")<br/>"+(denormalizedVBox.getVbox().count(false)*denormalizedVBox.getVbox().getVolume(false))+"<br/><br/>";
			System.out.println(s);  
		}
	}
}
 
