package hbCar.carException;


/**
 * 车辆异常类型
 * 用于根据不同语言显示对应的异常信息
 */
public interface HsbcCarExceptionSeverity {


    /** 车辆超出车库范围 */
    public static final  String OutBoxException = "车辆超出车库范围";

    /** 传参异常 */
    public static final  String DataException = "传参异常";

    /** 车库异常 */
    public static final  String BoxException = "车库异常";

    /** 车辆异常 */
    public static final  String CarException = "车辆异常";

}
