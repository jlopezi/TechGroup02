package main.java;

import java.util.ArrayList;

public class Rhombus extends Figure {

    public Rhombus(int height, char sign) {
        this.height = height;
        this.sign = sign;
        this.createBodyFigure();
    }

    @Override
    protected void createBodyFigure() {
        for(int row = 0; row < this.height; row++) {
            ArrayList<Character> array = new ArrayList<>();
            for(int column = 0; column < this.height; column++){
                array.add(this.isFigureSpace(row, column) ? this.sign : ' ');
            }
            this.figureBody.add(array);
        }
    }

    private boolean isFigureSpace(int row, int position) {
        int midPoint = this.getMidPoint();
        int limit = this.getLimit(midPoint, row);
        return row <= midPoint ? (midPoint + row >= position) && (midPoint - row <= position) :
                (midPoint + limit >= position) && (midPoint - limit <= position);
    }

    private int getMidPoint() {
        return this.height / 2;
    }

    private int getLimit(int midpoint, int row) {
        return row - (2 * (row - midpoint));
    }
}