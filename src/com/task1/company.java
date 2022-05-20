package com.task1;

public class company {
    enum Shapes{
        square,
        rectangle,
        circle,
        trapezoid,
        rhombus,
        triangle,
        oval,
        hexagon
    }
    static class Display{
        Shapes zzz =  Shapes.square;
        void changeShape(){
            switch(zzz) {
                case square:
                    zzz = company.Shapes.rectangle;
                    break;
                case rectangle:
                    zzz = company.Shapes.circle;
                    break;
                case circle:
                    zzz = company.Shapes.trapezoid;
                    break;
                case trapezoid:
                    zzz = company.Shapes.rhombus;
                    break;
                case rhombus:
                    zzz = company.Shapes.triangle;
                    break;
                case triangle:
                    zzz = company.Shapes.oval;
                    break;
                case oval:
                    zzz = company.Shapes.hexagon;
                    break;
                case hexagon:
                    zzz = company.Shapes.square;
                    break;
            }

        }
        public String toString(){
            return ""+zzz;
        }
    }
    public static void main(String[] args){
        Display ww = new Display();
        for (int i = 0; i < 10 ; i++) {
            System.out.println(ww);
            ww.changeShape();

        }

    }


}
