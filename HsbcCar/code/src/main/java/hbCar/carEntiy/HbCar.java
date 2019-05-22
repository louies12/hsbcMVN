package hbCar.carEntiy;

import hbCar.carBox.CarBox;
import hbCar.carException.HsbcCarException;
import hbCar.carException.HsbcCarExceptionSeverity;

public class HbCar extends HbBaseCar   {

    /**
     *构造器 默认车库大小为1X1
     */
    public HbCar(){
        super();
    }
    public HbCar(CarBox carBox){
        super(carBox);
        System.out.println("当前车库大小 :"+this.getMaxX()+" X "+this.getMaxY() );

    }
    /**
     * 构造器
     * @param maxX 车库宽度
     * @param maxY 车库高度
     */
    public HbCar( Integer maxX,Integer maxY){
        super(null,  null,  null ,  maxX,  maxY);
        System.out.println("当前车库大小 :"+this.getMaxX()+" X "+this.getMaxY() );

    }

    /**
     * 控制车辆位移
     * @param command 传参为字符串 用逗号隔开
     * 示例：
     * 传参turn 为顺时针旋转一次，传参 move,1 为往前移动1个位置
     */
    @Override
    public void move(String command)  {
        boolean DataCheck = false;
        if(command!=null&&command.length()>0){
            if(command.equals("turn")){
                DataCheck = true;
                super.rotation(true,1);
            }
            String[] coms = command.split(",");
            if(coms.length==2){
                if(coms[0].equals("move")){
                    int moveData = 0;
                    try{
                        moveData =  Integer.valueOf(coms[1]) ;
                    }catch (NumberFormatException e){
                        throw new HsbcCarException(HsbcCarExceptionSeverity.DataException,"传参："+command+"，异常原因："+e.getMessage());
                    }
                    DataCheck = true;
                    super.carMove(moveData);
                }
            }
        }
        if(!DataCheck){
            throw new HsbcCarException(HsbcCarExceptionSeverity.DataException,"传参："+command+"，异常原因：无法识别" );
        }
        System.out.println("当前车辆位置：x:"+this.getPositionX()+",y:"+this.getPositionY()+",orientation:"+this.getOrientation());
    }

    /**
     * 获取车辆朝向
     * 把显示内容抽取出来，用于设置显示对应的语言类型
     * @return
     */
    @Override
    public String getOrientation() {
        String orientationStr = null;
        switch (this.orientation) {
            case CarRotationSeverity.NORTH:
                orientationStr =  "NORTH" ;
                break;

            case CarRotationSeverity.EAST:
                orientationStr =  "EAST" ;
                break;

            case CarRotationSeverity.SOUTH:
                orientationStr =  "SOUTH";
                break;

            case CarRotationSeverity.WEST:
                orientationStr =  "WEST";
                break;

            default:
                orientationStr =  "UNKNOWN";
        }
        return orientationStr;
    }
}
