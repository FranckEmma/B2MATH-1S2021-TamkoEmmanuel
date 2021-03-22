package connectivity;

import java.awt.image.BufferedImage;
import graphics.Image;

public class EuroCoinsAnalysis {
	/**
	 * Constructor
	 * 
	 * @param image An image to analyze
	 */
	public EuroCoinsAnalysis(BufferedImage image) {
		// TODO
	}
	
	/**
	 * Total amount of the detected coins
	 * 
	 * @return Amount in cents
	 */
	public int getTotalAmount() {
		return 0; // TODO
	}

	/**
	 * Total number of detected coins
	 *  
	 * @return Number of coins
	 */
	public int getCount() {
		return 0; // TODO
	}

	/**
	 * Number of detected coins for the specified amount
	 *  
	 * @param faceValue Face value in cents
	 * @return Number of coins
	 */
	public int getCount(int faceValue) {
		return 0; // TODO
	}

	/**
	 * Main program - Analysis examples
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Euro coins : one of each [3.88€]
		 */
		analyzeImage("img/coins/Euro-coins-3.88.png");
		
		/*
		 * Euro coins : mix 1 [21.90€]
		 */
		analyzeImage("img/coins/Coin-mix-1-21.90.png");
		
		/*
		 * Euro coins : mix 2 [102.09€]
		 */
		analyzeImage("img/coins/Coin-mix-2-102.09.png");
		
		/*
		 * Euro coins : mix 3 [401.05€]
		 */
		analyzeImage("img/coins/Coin-mix-3-401.05.png");
	}
	 
	private static void analyzeImage(String filename) {
		// Load and display image
		BufferedImage image = Image.convertToType(Image.loadImage(filename), BufferedImage.TYPE_INT_RGB);
		Image.displayImage(image, filename);
		System.out.println("Image : " + filename);
		System.out.println("Image size : " + image.getWidth() + "x" + image.getHeight());

		// Perform analysis and display results
		EuroCoinsAnalysis eca = new EuroCoinsAnalysis(image);
		System.out.println("Number of coins : "+eca.getCount());
		for (int v : new int[]{1, 2, 5, 10, 20, 50, 100, 200}) {
			System.out.printf("% 3d -> %d\n", v, eca.getCount(v));
		}
		System.out.printf("Total value = %.2f\n", eca.getTotalAmount() / 100.0);
		System.out.println("\n------------------\n");
	}
}
