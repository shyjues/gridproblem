package com.shyju.carParking;

public class ProcessMovement {


    int index = 0;


    public String process(int yPosition, int xPosition, String pattern) {

        int xx = xPosition;
        int yy = yPosition;

        char direction = 'N';

        for (char ch : pattern.toCharArray()) {
            switch (ch) {

                case 'R':
                    direction = setDirection(direction, ch);
                    break;
                case 'L':
                    direction = setDirection(direction, ch);
                    break;
                default:
                    {


                        switch(direction){
                            case 'N':
                                yy++;
                                break;
                            case 'S':
                                yy--;
                                break;
                            case 'E':
                                xx++;
                                break;
                            case 'W':
                                xx--;
                                break;
                        }
                    }
                    break;
            }

        }
        return yy+","+xx;

    }


    private char setDirection(char direction, char movement){

        char dir = ' ';

        switch(direction){

            case 'N':
                dir = (movement=='R')? 'E':'W';
                break;
            case 'E':
                dir = (movement=='R')?'S':'N';
                break;
            case 'W':
                dir = (movement=='R')?'N':'S';
                break;
            case 'S':
                dir = (movement=='R')?'W':'E';
                break;
        }

        return dir;
    }

}
