public class PasswordStore {

    private String name;
    private String username;
    private String password;
    private String hashkey;
    private double score;
    private int category;

    public static final int UNCATEGORIZED = 0;
    public static final int CAT_WEBAPP = 1;
    public static final int CAT_MOBILEAPP = 2;
    public static final int CAT_OTHER = 3;

    public PasswordStore(String name, String username, String password) {
        this.name = name;
        this.setUsername(username);
        this.password = password;
        this.hashkey = "";
        this.score = 0;
        this.category = UNCATEGORIZED;
    }

    public String getUsername() {
        return username;

    }

    public void setUsername(String username) {
        this.username = username;

    }

    public PasswordStore(String name, String username, String password, int category) {
        this(name, username, password);
        this.category = category;
    }

    public void setPassword(String password) {
        this.password = password;
        calculateScore();
    }

    public String getPassword() {
        return password;
    }

    public void setCategory(int category) {
        if (category >= UNCATEGORIZED && category <= CAT_OTHER) {
            this.category = category;
        }
    }

    public String getCategory() {
        String[] categories = { "Belum terkategori", "Aplikasi web", "Aplikasi mobile", "Akun lainnya" };
        return categories[category];
    }

    private void calculateScore() {
        if (password.length() > 15) {
            score = 10;
        } else {
            score = (password.length() / 15) * 10;
        }
    }

    @Override
    public String toString() {
        return "Nama: " + name + "\n"
                + "Username: " + getUsername() + "\n"
                + "Password: " + password + "\n"
                + "Hashkey: " + hashkey + "\n"
                + "Kategori: " + getCategory() + "\n"
                + "Skor: " + score;
    }

}
