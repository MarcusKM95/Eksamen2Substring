import java.util.Random;

public class User {

    private String fullname;
    private String userID;
    Random random = new Random();
    public User (String fullname, String userID){
        this.fullname = fullname;
        this.userID = userID;
    }

    public boolean validUsierID(){
        for (int i = 0; i < 4; i++){
            if (Character.isLowerCase(userID.charAt(i))&& Character.isDigit(userID.charAt(i+3))){
                return true;
            }
        }
        return false;
    }

    public String generateUserID(){
        String[] navn = fullname.split(" ");
        String userID = navn[0].substring(0,2) + navn[1].substring(0,2) + (random.nextInt(9999)+1000);
        return userID;


        }


}



