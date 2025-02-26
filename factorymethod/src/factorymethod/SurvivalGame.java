/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package factorymethod;

/**
 *
 * @author p0073862
 */
public abstract class SurvivalGame {

   private Segment currentPosition; //I put this in for testing

    SurvivalGame() {
            setUpEnvironment();
	}

	void setUpEnvironment() {
        Patch westPatch = createPatch();
        Barrier barrier = createBarrier();
        Patch eastPatch = createPatch();

        westPatch.setEast(barrier);
        barrier.setWest(westPatch);
        barrier.setEast(eastPatch);
        eastPatch.setWest(barrier);

        currentPosition = barrier;
    }

    public abstract Patch createPatch();
    public abstract Barrier createBarrier();
    
    public Segment getCurrentPosition() {return currentPosition;}
}
