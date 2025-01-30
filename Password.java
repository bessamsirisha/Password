import java.util.Random;

public class Password {
    public static void main(String[] args) {
        int length=10;
        System.out.println(Apassword(length));
    }
    static char[]Apassword(int len){
        System.out.println("generating password using random():");
        System.out.println("your new password is:");
        String capital_chars="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String small_char="abcdefghijklmnopqrstuvwxyz";
        String numbers="012345689";
        String symbols="2005";
        String values=capital_chars+small_char+numbers+symbols;
        Random rndm_methon=new Random();
        char[]password=new char[len];
        for(int i=0;i<len;i++);{
             password[i]=
             values.charAt(rndm_methon.nextInt(values.length()));
        }
        return password;
    }
}
