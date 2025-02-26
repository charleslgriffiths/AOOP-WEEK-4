/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package factorymethod;

/**
 *
 * @author p0073862
 */
public abstract class Segment {
    public Segment west, east, north, south;
    public Segment() {west = null; east = null; north=null; south=null;}
    public Segment getWest() {return west;}
    public void setWest(Segment w) {west=w;}
    public Segment getEast() {return east;}
    public void setEast(Segment e) {east=e;}
    public Segment getNorth() {return north;}
    public void setNorth(Segment n) {north=n;}
    public Segment getSouth() {return south;}
    public void setSouth(Segment s) {south = s;}
    public abstract void display();
}