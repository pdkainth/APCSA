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
	 * Parameter constructor
	 * @param frame0 - frame time for first frame
	 * @param frame1 - frame time for second frame
	 * @param frame2 - frame time for third frame
	 * @param quality - base quality
	 * @param frameTime - target frame time
	 */
	public VirtualReality(double frame0, double frame1, double frame2, double quality, double frameTime) {
		this.frame0 = frame0;
		this.frame1 = frame1;
		this.frame2 = frame2;
		
		qualityLevel = quality;
		
		targetFrameTime = frameTime;
		
		LOW_THRESHOLD = 0.7 * targetFrameTime;
		EXTRAPOLATE_THRESHOLD = 0.7 * targetFrameTime;
		HIGH_THRESHOLD = 0.9 * targetFrameTime;
	}
	
	/**
	 * Adjusts the quality level based on previous 3 frame times
	 */
	private void adaptiveQualityAlgorithm() {
		
		if(frame2 > HIGH_THRESHOLD) {
			qualityLevel -= 2;
		} else if(frame2 > EXTRAPOLATE_THRESHOLD) { 
			if(Math.max(this.extrapolate(0, frame0, 2, frame2, 3), this.extrapolate(1, frame1, 2, frame2, 3)) > HIGH_THRESHOLD) {
			qualityLevel -= 2;
			}
		} else if(frame0 < LOW_THRESHOLD && frame1 < LOW_THRESHOLD && frame2 < LOW_THRESHOLD) {
			qualityLevel++; 
		}
		
	}
	
	/**
	 * 
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
	 * 
	 * @return - adjusted quality level
	 */
	public double getAdjustedQualityLevel() {
		adaptiveQualityAlgorithm();
		
		return qualityLevel;
	}
	
	
	
}
