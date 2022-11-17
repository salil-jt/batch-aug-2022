package exceptions;

public class userDefinedExceptions {

}
class CustomException extends Exception
{
    String moreInfo;
    
    CustomException(String moreInfo)
    {
        this.moreInfo = moreInfo;
    }
}
