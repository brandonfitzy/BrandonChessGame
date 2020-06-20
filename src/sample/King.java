package sample;

public class King extends Piece {

    public King(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean canMove(Board board, Spot startSpot, Spot endSpot){
        if (endSpot.getPiece().isWhite()){
            return false;
        } else return Math.abs(startSpot.getX() - endSpot.getX()) <= 1 && Math.abs(startSpot.getY() - endSpot.getY()) <= 1;

        //method to check if king will be attacked
        //castling methods




    }

}
