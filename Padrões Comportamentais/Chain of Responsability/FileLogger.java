public class FileLogger extends AbstractLogger {

  public ConsoleLogger(int level){
    this.level = level;
  }

  @Override
  protected void write(String message) {
    System.out.println("File Console::Logger: " + message);
  }
}