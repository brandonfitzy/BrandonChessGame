package sample;

public class Pawn extends Piece {
    private boolean firstMove;


    public Pawn(boolean isWhite) {
        super(isWhite);
        this.firstMove = true;
    }

    @Override
    public boolean canMove(Board board, Spot startSpot, Spot endSpot) {
        if (firstMove){

        } else {

        }
    }

}
