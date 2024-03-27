public class Main {

    public static void main(String[] args) {
        PasswordStore pass1 = new PasswordStore("Wachid Zufar Ramadhan", "zufarrama2222", "11998822*&adDah");
        pass1.setCategory(PasswordStore.CAT_WEBAPP);

        System.out.println(pass1);
    }

}
