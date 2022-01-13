package day11_Switch_Scanner;

public class Browser {
    public static void main(String[] args) {

        String browserName = "chrome";

        String result = "";

        boolean validBrowser = browserName == "chrome" || browserName == "firefox" || browserName == "opera" ||
                browserName =="safari" || browserName == "edge";

        if(validBrowser) {
            //5 options
            if(browserName=="chrome"){
                result = "Chrome browswer is selected";
            }
        }else if(browserName=="firefox"){
            result = "Firefox browser is selected";

        }else if(browserName=="opera"){
            result = "Opera browser is selected";

        }else if(browserName=="edge"){
            result = "Edge browser is selected";

        }else{
            result = "Invalid browser name";
        }
        System.out.println(result);

    }
}
