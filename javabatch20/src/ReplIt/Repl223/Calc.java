package ReplIt.Repl223;

public class Calc {
    private int x;
    private int y;
    private int result;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void plus(){
        result=x+y;
    }

    public void minus(){
        result=x-y;
    }
}
