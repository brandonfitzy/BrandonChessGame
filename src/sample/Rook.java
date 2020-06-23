package sample;

public class Rook extends Piece{

    public Rook(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean canMove(Board board, Spot startSpot, Spot endSpot) {
        return false;
    }
}
