package hbCar.carBox;

import hbCar.carException.HsbcCarException;
import hbCar.carException.HsbcCarExceptionSeverity;

public class CarBox {

    /**
     * 车库大小 宽度
     */
    Integer maxX = 1;
    /**
     * 车库大小 高度
     */
    Integer maxY = 1;


    public CarBox(Integer maxX, Integer maxY) {
        if(maxX!=null&&maxX>0&&maxY!=null&&maxY>0) {
            this.maxX = maxX;
            this.maxY = maxY;
        }else{
            throw new HsbcCarException(HsbcCarExceptionSeverity.BoxException);
        }
    }

    public Integer getMaxX() {
        return maxX;
    }

    public void setMaxX(Integer maxX) {
        this.maxX = maxX;
    }

    public Integer getMaxY() {
        return maxY;
    }

    public void setMaxY(Integer maxY) {
        this.maxY = maxY;
    }
}
