/**
 * Created by MariaJose on 17-04-2018.
 */

public class UserData {
    private static String userName;


    public static String getUserName(){
        return userName;
    }

    public static void setUserName(String user_name){
        UserData.userName = user_name;
    }



}
