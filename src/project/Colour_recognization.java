package project;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Colour_recognization {

	public static void main(String[] args) throws Exception
	{
		
		Color ec = Color.RED;
		File f = new File("C:\\Users\\Admin\\Downloads\\red.jpg");
		BufferedImage bimg=ImageIO.read(f);
		int w = bimg.getWidth();
		int h = bimg.getHeight();
		int count = 0;
		for(int i=0; i<=h; i++)
		{
			for(int j=0;j<w;j++)
			{
				Color ac = new Color(bimg.getRGB(i, j));
				if(ac.getRed() ==ec.getRed() && ac.getGreen() == ec.getGreen() && ac.getBlue()==ec.getBlue())
				{
					count = count++;
				}
			}
		}
		System.out.println(count);
		
		
	}

}
