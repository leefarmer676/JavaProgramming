package day51_Map;

import jdk.swing.interop.SwingInterOpUtils;

public class TestEnum {

    public static void main(String[] args) {

        Browser browser = Browser.SAFARI;

        switch (browser){
            case FIREFOX:
                System.out.println("Firefox is selected");
                break;
            case SAFARI:
                System.out.println("Safari is selected");
                break;
            case OPERA:
                System.out.println("Opera is selected");
                break;
            case EDGE:
                System.out.println("Edge is selected");
                break;
            default:
                System.out.println("Chrome is selected"); //bc there are only 5 options in Enum, so default the only
                //option left is Chrome
        }

        System.out.println("------------------------------");

        Season season = Season.SPRING;
    }

}
