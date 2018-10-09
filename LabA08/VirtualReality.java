/**
 * Adjusts the quality level of the simulation beased on the frame times for 3 previous frames
 * @author Prabhdeep Kainth
 *period 4
 */

public class VirtualReality {
	private double frame0;
	private double frame1;
	private double frame2;
	
	private double qualityLevel;
	
	private double targetFrameTime;
	private final double LOW_THRESHOLD;
	private final double EXTRAPOLATE_THRESHOLD;
	private final double HIGH_THRESHOLD;
	
	/**
	 * Constructor to initialize the three previous frame processing
	 * times, current quality level of the video, and the target frame time
	 * It also initializes all the threshold values
	 * @param f0 - processing time for frame 0 (two frames ago) in ms
	 * @param f1 - processing time for frame 1 (frame before last) in ms
	 * @param f2 - processing time for frame 2 (last frame) in ms
	 * @param ql - quality level of the video (ranges from 1 to 10)
	 * @param frames - desired frames per second
	 * pre-condition: 1 <= ql <= 10
	 * pre-condition: f0, f1, f2 > 0
	 */
	
	public VirtualReality(double f0, double f1, double f2, double ql, double frames) {
		
		if(f0 > 0 && f1 > 0 && f2 > 0) {
			frame0 = f0;
			frame1 = f1;
			frame2 = f2;
			
		}
		
		qualityLevel = ql;
		
		
		double myTime = 1000.0  / 90;
		targetFrameTime = myTime;
		
		LOW_THRESHOLD = 0.7 * targetFrameTime;
		EXTRAPOLATE_THRESHOLD = 0.7 * targetFrameTime;
		HIGH_THRESHOLD = 0.9 * targetFrameTime;
		
	}
	
	/**
	 * Adjusts the quality level based on previous 3 frame times
	 */
	private void adaptiveQualityAlgorithm() {
		//int test = 0;
		double testQual = qualityLevel;
		
		if(frame2 > HIGH_THRESHOLD) {
			qualityLevel -= 2;
			
			//test = 1;
			
		} else if(frame2 > EXTRAPOLATE_THRESHOLD) {
			/*System.out.println(this.extrapolate(0, frame0, 2, frame2, 3));
			System.out.println(this.extrapolate(1, frame1, 2, frame2, 3));
			System.out.println(frame2);
			System.out.println(EXTRAPOLATE_THRESHOLD);
			*/
			if(Math.max(this.extrapolate(0, frame0, 2, frame2, 3), this.extrapolate(1, frame1, 2, frame2, 3)) > HIGH_THRESHOLD) {
				qualityLevel -= 2;
			}
			
			//test = 2;
			
		} else if(frame0 < LOW_THRESHOLD && frame1 < LOW_THRESHOLD && frame2 < LOW_THRESHOLD) {
			qualityLevel++;
			//test = 3;
			
		}
		
		//return test;
		
	}	
	/**
	 * Returns the y coordinate of the extrapolated point using linear 
	 * extrapolation of two data points (x1, y1) and (x2, y2)
	 * @param x1 - first frame number
	 * @param y1 - first frame time
	 * @param x2 - second frame number
	 * @param y2 - second frame time
	 * @param x - extrapolated frame
	 * @return - extrapolated frame value
	 */
	private double extrapolate(double x1, double y1, double x2, double y2, double x) {
		double extrapolate = y1 + ((x - x1) / (x2 - x1)) * (y2 - y1);
		
		return extrapolate;
	}
	
	/**
	 * Calculates the adjusted quality level by applying the adaptive quality
	 * algorithm
	 * @return the adjusted quality level
	 */
	public double getAdjustedQualityLevel() {
		//System.out.println(adaptiveQualityAlgorithm());
		//System.out.println("test");
		adaptiveQualityAlgorithm();
		
		return qualityLevel;
	}
	
	/*public static void main(String args[]) {
		VirtualReality myVirt = new VirtualReality(7.6, 7.3, 7.7, 5.0, 5);
		System.out.println(myVirt.getAdjustedQualityLevel());
	}
	*/
	
}
