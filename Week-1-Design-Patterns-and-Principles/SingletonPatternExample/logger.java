
public class logger{
    private static logger logger= new logger();
    private logger(){
        System.out.print("Hello User!");
    }
    
    public static logger instance() {
    	return logger;
    }
}