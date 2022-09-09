package AmazonProject;

public class UseAmazon {

    public static void main(String[] args) {

        AmazonAccount account = new AmazonAccount("Megan","MgnTc@gmail.com",true);
        System.out.println(account);
        System.out.println(account.getUserName());
        System.out.println(account.getEmail());
        System.out.println(account.getHasPrime());

        AmazonAccount account2 = new AmazonAccount("Alper","alperrozkann@gmail.com",false);

        System.out.println(account2);
        account2.setEmail("alp@gmail.com");
        account2.setUserName("Alpi");
        account2.setHasPrime(true);
        System.out.println(account2.equals(account));

    }
}
