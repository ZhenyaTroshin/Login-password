public class User {
    private String login;

    Account account;

    public User(String login, String password) {
        this.login = login;
        account = new Account(password);
        account.displayAccount();
    }
    class Account {
        private String password;
        public Account(String password) {
            this.password = password;
        }
        void displayAccount(){
            System.out.println("Account Login successful! Login: " + login + ", Password: " + password );
        }
    }
}
