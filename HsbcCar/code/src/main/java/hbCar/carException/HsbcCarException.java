package hbCar.carException;

public class HsbcCarException extends CarException {

    /**
     * 空构造器。
     */
    public HsbcCarException() {
        super();
    }

    /**
     * 构造器。
     *
     * @param severity 严重级别
     */
    public HsbcCarException(int severity) {
        super();

        this.severity = severity;
    }
    /**
     * 构造器。
     * @param type 异常原因
     * @param message 消息
     * @param severity 严重级别
     */
    public HsbcCarException(String type,String message, int severity) {
        super("异常原因："+type+","+message);
        this.severity = severity;

    }
    /**
     * 构造器。
     * @param type 异常原因
     * @param message 消息
     */
    public HsbcCarException(String type,String message) {
        super("异常原因："+type+","+message);
    }
    /**
     * 构造器。
     *
     * @param type 消息
     */
    public HsbcCarException(String type ) {
        super("异常原因："+type+" " );
    }
    /**
     * 构造器。
     *
     * @param type 异常原因
     * @param severity 严重级别
     */
    public HsbcCarException(String type, int severity) {
        super("异常原因："+type+" " );
        this.severity = severity;
    }




}
