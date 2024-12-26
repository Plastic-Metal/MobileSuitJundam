package ReFreSH.JMobileSuit.ObjectModel;

import ReFreSH.JMobileSuit.IO.IOServer;
import ReFreSH.JMobileSuit.ObjectModel.Annotions.SuitIgnore;
import org.springframework.stereotype.Component;

@Component  // 使用 Spring 管理该类，支持依赖注入
public abstract class SuitClient implements InfoProvider, IOInteractive {

    protected String _text = "";
    private IOServer _io;

    /**
     * 获取当前实例的IOServer
     */
    protected IOServer IO() {
        return _io;
    }

    /**
     * 设置信息
     *
     * @param value 要提供的信息
     */
    protected void setText(String value) {
        _text = value;
    }

    /**
     * 获取信息
     *
     * @return 当前提供的信息
     */
    @SuitIgnore
    public String text() {
        return _text;
    }

    /**
     * 设置当前的 IOServer
     *
     * @param io 当前 SuitHost 的 IOServer
     */
    @SuitIgnore
    public void setIO(IOServer io) {
        _io = io;
    }
}

