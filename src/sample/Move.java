package sample;

public class Move {
    private Spot startSpot;
    private Spot finishSpot;
    private Piece movePiece;
    private Piece killPiece;

    public Move(Spot startSpot, Spot finishSpot, Piece movePiece, Piece killPiece) {
        this.startSpot = startSpot;
        this.finishSpot = finishSpot;
        this.movePiece = movePiece;
        this.killPiece = killPiece;
    }

    public Spot getStartSpot() {
        return startSpot;
    }

    public void setStartSpot(Spot startSpot) {
        this.startSpot = startSpot;
    }

    public Spot getFinishSpot() {
        return finishSpot;
    }

    public void setFinishSpot(Spot finishSpot) {
        this.finishSpot = finishSpot;
    }

    public Piece getMovePiece() {
        return movePiece;
    }

    public void setMovePiece(Piece movePiece) {
        this.movePiece = movePiece;
    }

    public Piece getKillPiece() {
        return killPiece;
    }

    public void setKillPiece(Piece killPiece) {
        this.killPiece = killPiece;
    }
}
