package sample;

abstract class Piece {
    private boolean killed;
    private boolean white;

    public Piece(){
        this.white = true;
        this.killed = false;
    }

    public void setKilled(boolean killed) {
        this.killed = killed;
    }

    public void setWhite(boolean white) {
        this.white = white;
    }

    public boolean isKilled() {
        return killed;
    }

    public boolean isWhite() {
        return white;
    }
}
