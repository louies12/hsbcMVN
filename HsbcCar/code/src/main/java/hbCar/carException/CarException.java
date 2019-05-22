package hbCar.carException;

public class CarException extends RuntimeException {
    /** serialVersionUID */
    private static final long serialVersionUID = 0L;

    /** 严重级别 */
    protected int severity = CarExceptionSeverity.NORMAL;

    /**
     * 空构造器。
     */
    public CarException() {
        super();
    }

    /**
     * 构造器。
     *
     * @param severity 严重级别
     */
    public CarException(int severity) {
        super();

        this.severity = severity;
    }

    /**
     * 构造器。
     *
     * @param message 消息
     */
    public CarException(String message) {
        super(message);
    }

    /**
     * 构造器。
     *
     * @param message 消息
     * @param severity 严重级别
     */
    public CarException(String message, int severity) {
        super(message);

        this.severity = severity;
    }

    /**
     * 构造器。
     *
     * @param cause 原因
     */
    public CarException(Throwable cause) {
        super(cause);
    }

    /**
     * 构造器。
     *
     * @param cause 原因
     * @param severity 严重级别
     */
    public CarException(Throwable cause, int severity) {
        super(cause);

        this.severity = severity;
    }

    /**
     * 构造器。
     *
     * @param message 消息
     * @param cause 原因
     */
    public CarException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * 构造器。
     *
     * @param message 消息
     * @param cause 原因
     * @param severity 严重级别
     */
    public CarException(String message, Throwable cause, int severity) {
        super(message, cause);

        this.severity = severity;
    }

    /**
     * @return Returns the severity.
     */
    public int getSeverity() {
        return severity;
    }

    /**
     * @see Throwable#toString()
     */
    public String toString() {
        StringBuffer buffer = new StringBuffer();

        buffer.append(super.toString()).append(" - severity: ");

        switch (severity) {
            case CarExceptionSeverity.MINOR:
                buffer.append("MINOR");
                break;

            case CarExceptionSeverity.NORMAL:
                buffer.append("NORMAL");
                break;

            case CarExceptionSeverity.MAJOR:
                buffer.append("MAJOR");
                break;

            case CarExceptionSeverity.CRITICAL:
                buffer.append("CRITICAL");
                break;

            default:
                buffer.append("UNKNOWN");
        }

        buffer.append("(").append(severity).append(")");

        return buffer.toString();
    }

}
