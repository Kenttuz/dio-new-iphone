package edu.iphone;
public class App {
    public static void main(String[] args) throws Exception {
        
        Phone iphone = new Phone();

        iphone.call();
        iphone.answer();
        iphone.reject();
        iphone.beginVoiceMail();

        iphone.playMusic();
        iphone.stopMusic();
        iphone.selectMusic("Rock");

        iphone.openBrowser();
        iphone.navigateTo("www.google.com");
        iphone.navigateBack();
        iphone.navigateForward();
        iphone.refresh();
        iphone.addNewTab();
        iphone.closeBrowser();
    }
}
