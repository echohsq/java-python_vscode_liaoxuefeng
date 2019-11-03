public class DiyException {
    public static void main(String[] args) {
        String token = login("admin", "password");
        System.out.println("Token: " + token);
    }
    static String login(String username, String password){
        if(username.equals("admin")) {
            if(password.equals("password")){
                return "登录成功！";
            }else{
                throw new LoginFailedException("Bad user or password.");
            }
        }else{
            throw new UserNotFoundException("User not found.");
        }
    }
}

class BaseException extends RuntimeException {
    /**
     *创建自己的异常类，通常继承RuntimeException
     */
    private static final long serialVersionUID = 1L;

    // 采用父类拥有的构造方法
    public BaseException(){
        super();
    }
    public BaseException(String message, Throwable cause) {
        super(message, cause);
    }
    public BaseException(String message){
        super(message);
    }
    public BaseException(Throwable cause) {
        super(cause);
    }

}

class LoginFailedException extends BaseException{
    /**
     *登录失败异常处理
     */
    private static final long serialVersionUID = 1L;

    public LoginFailedException() {
        super();
    }
    public LoginFailedException(String message){
        super(message);
    }
}
class UserNotFoundException extends BaseException{
    /**
     *用户名未找到异常处理
     */
    private static final long serialVersionUID = 1L;

    public UserNotFoundException() {
        super();
    }
    public UserNotFoundException(String message){
        super(message);
    }
}