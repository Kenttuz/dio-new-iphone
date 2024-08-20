package edu.navigationOnInternet;

public interface BrowserInternet {

    public void openBrowser();

    public void closeBrowser();

    public void navigateTo(String url);

    public void navigateBack();

    public void navigateForward();

    public void refresh();

    public void addNewTab();
}
