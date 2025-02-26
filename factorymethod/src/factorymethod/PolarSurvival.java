/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package factorymethod;

/**
 *
 * @author p0073862
 */
public class PolarSurvival extends SurvivalGame{
    public Patch createPatch() {return new Snow();}
    public Barrier createBarrier() {return new Crevasse();}
}
