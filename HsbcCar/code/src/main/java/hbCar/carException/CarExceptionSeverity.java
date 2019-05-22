package hbCar.carException;

/**
 * 异常等级类型
 */
public interface CarExceptionSeverity {

    /** 轻微 */
    public static final  int MINOR = 1;

    /** 一般 */
    public static final  int NORMAL = 2;

    /** 重要 */
    public static final  int MAJOR = 3;

    /** 严重 */
    public static final  int CRITICAL = 4;

}
