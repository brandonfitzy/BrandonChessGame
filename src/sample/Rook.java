package sample;

public class Rook extends Piece{

    public Rook(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean canMove(Board board, Spot startSpot, Spot endSpot) {
        if (startSpot.getX() != endSpot.getX() || startSpot.getX() != endSpot.getY()){
            return false;
        }

        if (board.getBox(endSpot.getX(),endSpot.getY()).getPiece().isWhite()){
            return false;
        }

        if (startSpot.getX() == endSpot.getX()){
            if (startSpot.getY()<endSpot.getY()){
                for (int yIter = startSpot.getY() + 1; yIter < 8; yIter++){
                    if(board.getBox(endSpot.getX(),endSpot.getY() + yIter).getPiece() != null){
                        return false;
                    }
                }
            } else {
                for (int yIter = startSpot.getY() - 1; yIter > 0; yIter--){
                    if(board.getBox(endSpot.getX(),endSpot.getY() - yIter).getPiece() != null){
                        return false;
                    }
                }
            }

        } else if (startSpot.getY() == endSpot.getY()){
            if (startSpot.getX()<endSpot.getX()){
                for (int xIter = startSpot.getX() + 1; xIter < 8; xIter++){
                    if(board.getBox(endSpot.getX()+xIter,endSpot.getX()+xIter).getPiece() != null){
                        return false;
                    }
                }
            } else {
                for (int xIter = startSpot.getX() - 1; xIter > 0; xIter--) {
                    if (board.getBox(endSpot.getX() - xIter, endSpot.getY()).getPiece() != null) {
                        return false;
                    }
                }
            }
        }
    }
}
