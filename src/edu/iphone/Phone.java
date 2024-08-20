package edu.iphone;

import edu.calls.Call;
import edu.musicPlayer.Player;
import edu.navigationOnInternet.BrowserInternet;

public class Phone implements Call, Player, BrowserInternet {
    // Methods of the calls interface
    public void call() {
        System.out.println("Calling...");
    }
    public void answer() {
        System.out.println("Answering...");
    }
    public void reject() {
        System.out.println("Rejecting...");
    }
    public void beginVoiceMail() {
        System.out.println("Beginning voice mail...");
    }

    // Methods of the player interface
    public void playMusic() {
        System.out.println("Playing music...");
    }
    public void stopMusic() {
        System.out.println("Stopping music...");
    }
    public void selectMusic(String musicName) {
        System.out.println("Selecting music: " + musicName);
    }

    // Methods of the browser interface
    public void navigateTo(String url) {
        System.out.println("Navigating to: " + url);
    }
    public void navigateBack() {
        System.out.println("Navigating back...");
    }
    public void navigateForward() {
        System.out.println("Navigating forward...");
    }
    public void refresh() {
        System.out.println("Refreshing...");
    }
    public void addNewTab() {
        System.out.println("Adding new tab...");
    }
    public void openBrowser() {
        System.out.println("Opening browser...");
    }
    public void closeBrowser() {
        System.out.println("Closing browser...");
    }
}
