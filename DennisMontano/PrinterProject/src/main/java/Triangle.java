package main.java;

import java.util.ArrayList;

public class Triangle extends  Figure {

    public Triangle(int height, char sign) {
        this.height = height;
        this.sign = sign;
        this.createBodyFigure();
    }

    @Override
    protected void createBodyFigure() {
        for(int row = 0; row < this.height; row++) {
            ArrayList<Character> array = new ArrayList<>();
            for(int column = 0; column < ((2 * this.height) - 1); column++){
                array.add(this.isFigureSpace(row, column) ? this.sign : ' ');
            }
            this.figureBody.add(array);
        }
    }

    protected boolean isFigureSpace(int row, int position) {
        int midPoint = this.getMidPoint();
        return (midPoint + row >= position) && (midPoint - row <= position);
    }

    protected int getMidPoint() {
        return this.height - 1;
    }
}