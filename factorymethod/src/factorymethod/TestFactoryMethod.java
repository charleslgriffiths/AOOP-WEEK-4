/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package factorymethod;

/**
 *
 * @author p0073862
 */
public class TestFactoryMethod {

    public static void main(String [] args) {
        SurvivalGame jungleGame = new JungleSurvival();
        System.out.println("JUNGLE");
        describe(jungleGame.getCurrentPosition());
        SurvivalGame polarGame = new PolarSurvival();
        System.out.println("\nPOLAR");
        describe(polarGame.getCurrentPosition());
    }

    static void describe(Segment seg) {
        System.out.print("You are in ");
        seg.display();
        System.out.print(". To the west is ");
        describeNeighbour(seg.getWest());
        System.out.print(". To the east is ");
        describeNeighbour(seg.getEast());
        System.out.print(". To the north is ");
        describeNeighbour(seg.getNorth());
        System.out.print(". To the south is ");
        describeNeighbour(seg.getSouth());
    }

    static void describeNeighbour(Segment seg) {
        if (seg==null) System.out.print("nothing");
        else seg.display();
    }
}