package BesinciGunDers.nLayeredDemo.core;

import BesinciGunDers.nLayeredDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements  LoggerService{

    @Override
    public void logToSystem(String message) {
        JLoggerManager manager=new JLoggerManager();
        manager.log(message);
    }
}
