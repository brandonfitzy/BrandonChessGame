package sample;

public class Knight extends Piece{

    public Knight(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean canMove(Board board, Spot startSpot, Spot endSpot) {
        int startX = startSpot.getX();
        int startY = startSpot.getY();
        int endX = endSpot.getX();
        int endY = endSpot.getY();
        int checkX;
        int checkY;
        Spot[] checkSpot = new checkSpot[8];

        checkSpot[0] = board.getBox(startX-1,startY+2);
        checkSpot[1] = board.getBox(startX-1,startY-2);
        checkSpot[2] = board.getBox(startX-2,startY+1);
        checkSpot[3] = board.getBox(startX-2,startY-1);
        checkSpot[4] = board.getBox(startX+1,startY+2);
        checkSpot[5] = board.getBox(startX+1,startY-2);
        checkSpot[6] = board.getBox(startX+2,startY+1);
        checkSpot[7] = board.getBox(startX+2,startY-1);

        for ( int iter = 0; iter<8; iter++){
            if (checkSpot[iter] != endSpot || checkSpot[iter].getPiece().isWhite()){
                return false;
            }
        }
    }


}
