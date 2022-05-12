package Bridge.Pages;

import Bridge.Theme.Theme;

public class AboutPage implements WebSite {

    protected Theme theme;

    public AboutPage(Theme theme) {
        this.theme = theme;
    }


    @Override
    public String getConnect() {
   return "Page in  " + theme.getColor();
    }
}
