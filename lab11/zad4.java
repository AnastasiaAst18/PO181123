import java.time.LocalDateTime;
abstract class Logger
{
    abstract void logInfo(String msg);
    abstract void logError(String msg);
}
public class zad4
{
    public static void main(String[] args)
    {
        Logger consoleLogger = new Logger() {
            @Override
            void logInfo(String msg) {
                System.out.println("[INFO] [" + LocalDateTime.now() + "] " + msg);
            }

            @Override
            void logError(String msg) {
                System.out.println("[ERROR] [" + LocalDateTime.now() + "] " + msg);
            }
        };
        consoleLogger.logInfo("System został uruchomiony pomyślnie.");
        consoleLogger.logError("Nie udało się nawiązać połączenia z bazą danych.");
    }
}