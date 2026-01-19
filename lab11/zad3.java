import java.util.Scanner;

interface Action {
    void onSuccess();
    void onFailure(String errorMessage);
}
class Button
{
    private String label;
    public Button(String label)
    {
        this.label = label;
    }
    public void onClick(Action action)
    {
        System.out.println("Kliknięto przycisk: " + label);
        boolean success = Math.random() > 0.5;
        if (success)
        {
            action.onSuccess();
        }
        else {
            action.onFailure("Błąd połączenia z serwerem");
        }
    }
}
public class zad3
{
    public static void main(String args[])
    {
        Button submitButton = new Button("Wyślij");
        submitButton.onClick(new Action() {
            @Override
            public void onSuccess() {
                System.out.println("Akcja zakończona sukcesem! Przekierowuję...");
            }

            @Override
            public void onFailure(String errorMessage) {
                System.err.println("Akcja nieudana. Powód: " + errorMessage);
            }
        });
    }
}
