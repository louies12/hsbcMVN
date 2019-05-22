package hbCar.carEntiy;

public interface Car {
    /**
     * 控制车辆位移及转向
     * @param command
     * @throws Exception
     */
    public void move(String command)  ;

    /**
     * 获取坐标X
     * @return
     */
    public int getPositionX();

    /**
     * 获取坐标Y
     * @return
     */
    public int getPositionY();

    /**
     * 获取车辆朝向
     * @return
     */
    public String getOrientation();
}
