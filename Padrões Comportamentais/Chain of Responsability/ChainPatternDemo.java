public class ChainPatternDemo {
  private static AbstractLogger getChainOfLoggers(){

    AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.Error);
    AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
    AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
  
    errorLogger.setNextLogger(fileLogger);
    fileLogger.setNextLogger(consoleLogger);

    return errorLogger;
  }

  public static void main(String[] args) {
    AbstractLogger loggerChain = getChainOfLoggers();

    loggerChain.logMessage(AbstractLogger.INFO,
    "this is an information");
    loggerChain.logMessage(AbstractLogger.DEBUG,
    "this is an debug level information");
    loggerChain.logMessage(AbstractLogger.ERROR,
    "this is an error information");
  }
}