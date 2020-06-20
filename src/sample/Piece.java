package sample;

abstract class Piece {
    private boolean isKilled;
    private boolean isWhite;

    public Piece(boolean isWhite){
        this.isWhite = isWhite;
        this.isKilled = false;
    }

    public abstract boolean canMove(Board board, Spot startSpot, Spot endSpot);

    public void setKilled(boolean isKilled) {
        this.isKilled = isKilled;
    }

    public void setWhite(boolean isWhite) {
        this.isWhite = isWhite;
    }

    public boolean isKilled() {
        return isKilled;
    }

    public boolean isWhite() {
        return isWhite;
    }
}
