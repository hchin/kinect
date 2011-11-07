import processing.core.*;
public class ForceTracker extends PApplet {
    /**
	 * 
	 */
	public DarthTracker viewer ;
	private static boolean shouldRun = true;
	

	public static void main(String args[]) {
		    PApplet.main(new String[] { "--present", "MyProcessingSketch" });
		  }

    public void setup()
    {
        viewer = new DarthTracker(this);
        rect(0,0,100,100);
    }
    
    public void draw()
    {
    
    	viewer.getDepthMap();
    	viewer.paintUsers();
    	
    }

   
    
}
