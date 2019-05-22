package hbCar.carEntiy;

import hbCar.carBox.CarBox;
import hbCar.carException.CarException;
import hbCar.carException.HsbcCarException;
import hbCar.carException.HsbcCarExceptionSeverity;

public abstract  class HbBaseCar  implements Car {
    /**
     * 车辆坐标X
     */
    Integer positionX = 1;
    /**
     * 车辆坐标Y
     */
    Integer positionY = 1;
    /**
     * 车辆朝向
     */
    Integer orientation = CarRotationSeverity.NORTH;

    /**
     * 车库
     */
    CarBox carBox ;
    /**
     *构造器 默认车库大小为1X1
     */
    public HbBaseCar( ){
        carBox = new CarBox(1,1);
    }
    /**
     *构造器 传参车库大小
     */
    public HbBaseCar(CarBox carBox ){
       this.carBox = carBox;
    }
    /**
     /**
     * 构造器
     * @param maxX 车库宽度
     * @param maxY 车库高度
     * @param positionX 车辆坐标X
     * @param positionY 车辆坐标Y
     * @param orientation 车辆朝向
     */
    public HbBaseCar(Integer positionX,Integer positionY,Integer orientation ,Integer maxX,Integer maxY){
        if(maxX!=null&&maxX>0&&maxY!=null&&maxY>0){
            carBox = new CarBox(maxX,maxY);

        }else{
            carBox = new CarBox(1,1);

        }
        if(positionX!=null&&positionX>0&&positionX<=this.getMaxX()){
            this.positionX= positionX;
        }
        if(positionY!=null&&positionY>0&&positionY<=this.getMaxY()){
            this.positionY= positionY;
        }
        if(orientation!=null&&orientation>=0&&orientation<4){
            this.orientation= orientation;
        }

    }

    /**
     * 车辆转向控制
     * @param isClockwise 是否为顺时针  true为顺时针 false 为逆时针
    * @param times  旋转次数 一次为90°
     */
    public void rotation(boolean isClockwise,int times){
        if(times>0){
            if(isClockwise)
                this.orientation = (this.orientation+times)%4;
            else
                this.orientation = (this.orientation-times)%4;

        }
    }

    /***
     * 车辆位移 位移距离为一次一格
     * @param times
     * @throws CarException
     */
    public void carMove( int times) throws CarException{

        if(this.orientation%2== 0 ){// 南北方向的 操作纵坐标
         Integer finalPointY = null;
            if(this.orientation==0){
                finalPointY =  this.positionY +times;
            }else {
                finalPointY =  this.positionY -times;
            }
            if(finalPointY<=0||finalPointY>getMaxY()){
                throw new HsbcCarException(HsbcCarExceptionSeverity.OutBoxException);
            }else{
                this.positionY = finalPointY;
            }
        }else{  //东西移动
            Integer finalPointX = null;
            if(this.orientation==1){
                finalPointX =  this.positionX +times;
            }else {
                finalPointX =  this.positionX -times;
            }
            if(finalPointX<=0||finalPointX>getMaxX()){
                throw new HsbcCarException(HsbcCarExceptionSeverity.OutBoxException);
            }else{
                this.positionX = finalPointX;
            }
        }

    }

    @Override
    public int getPositionX() {
        return this.positionX;
    }


    @Override
    public int getPositionY() {
        return this.positionY;
    }



    public Integer getMaxX() {
        return carBox.getMaxX();
    }


    public Integer getMaxY() {
        return carBox.getMaxY();
    }

}
