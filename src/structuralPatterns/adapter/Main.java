package structuralPatterns.adapter;

import structuralPatterns.adapter.adapters.SquarePegAdapter;
import structuralPatterns.adapter.model.*;

public class Main {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5d);
        RoundPeg rpeg = new RoundPeg(5d);

        if (hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        } // OUTPUT: Round peg r5 fits round hole r5.

        SquarePeg smallSqPeg = new SquarePeg(2d);
        SquarePeg largeSqPeg = new SquarePeg(20d);
        // hole.fits(smallSqPeg); // Not compiled.

        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);

        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }// OUTPUT: Square peg w2 fits round hole r5.

        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }// OUTPUT: Square peg w20 does not fit into round hole r5.
    }
}
