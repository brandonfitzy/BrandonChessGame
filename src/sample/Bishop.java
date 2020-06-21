package sample;

public class Bishop extends Piece {

    public Bishop(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean canMove(Board board, Spot startSpot, Spot endSpot) {
        int Y_intercept;
        Y_intercept = startSpot.getY() - startSpot.getX();
        if ( (endSpot.getY() - Y_intercept) / endSpot.getX() != 1){
            return false;
        }

        Y_intercept = startSpot.getY() + startSpot.getX();
        if ( (endSpot.getY() - Y_intercept) / endSpot.getX() != 1){
            return false;
        }

        int startX = startSpot.getX();
        int startY = startSpot.getY();
        int endX = endSpot.getX();
        int endY = endSpot.getY();
        int checkX;
        int checkY;
        Spot checkSpot;

        if (endX > startX && endY > startY){
            for (int iter = 1; iter < Math.abs(endX-startX); iter++){
                checkX = startX + iter;
                checkY = startY + iter;
                checkSpot = board.getBox(checkX,checkY);
                checkSpot.getPiece();
                if (checkSpot.getPiece() != null){
                    return false;
                    break;
                }
            }
        } else if (endX < startX && endY > startY){
            for (int iter = 1; iter < Math.abs(endX-startX); iter++){
                checkX = startX + iter*(-1);
                checkY = startY + iter;
                checkSpot = board.getBox(checkX,checkY);
                checkSpot.getPiece();
                if (checkSpot.getPiece() != null){
                    return false;
                    break;
                }
            }
        } else if (endX > startX && endY < startY) {
            for (int iter = 1; iter < Math.abs(endX-startX); iter++){
                checkX = startX + iter;
                checkY = startY + iter*(-1);
                checkSpot = board.getBox(checkX,checkY);
                checkSpot.getPiece();
                if (checkSpot.getPiece() != null){
                    return false;
                    break;
                }
            }
        } else if (endX < startX && endY < startY) {
            for (int iter = 1; iter < Math.abs(endX-startX); iter++){
                checkX = startX + iter*(-1);
                checkY = startY + iter*(-1);
                checkSpot = board.getBox(checkX,checkY);
                checkSpot.getPiece();
                if (checkSpot.getPiece() != null){
                    return false;
                    break;
                }
            }
        }

    }
}
