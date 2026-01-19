public class zad2 {
    abstract static class Validator
    {
        public abstract boolean isValid(String value);
    }
    public static void main(String[] args)
    {
        Validator passwordValidator = new Validator()
        {
            @Override
            public boolean isValid(String value)
            {
                if (value == null) return false;
                boolean isLongEnough = value.length() >= 6;
                boolean hasDigit = value.matches(".*[0-9].*");
                return isLongEnough && hasDigit;
            }
        };
        String test1 = "abc12";
        String test2 = "abcdef";
        String test3 = "haslo123";
        System.out.println("Czy '" + test1 + "' poprawne? " + passwordValidator.isValid(test1));
        System.out.println("Czy '" + test2 + "' poprawne? " + passwordValidator.isValid(test2));
        System.out.println("Czy '" + test3 + "' poprawne? " + passwordValidator.isValid(test3));
    }
}
