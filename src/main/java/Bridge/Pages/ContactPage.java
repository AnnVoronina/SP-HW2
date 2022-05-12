package Bridge.Pages;

import Bridge.Theme.Theme;

public class ContactPage implements WebSite{

    Theme theme;

    public ContactPage(Theme theme) {
        this.theme = theme;
    }

    @Override
    public String getConnect() {
        return "Page in  " + theme.getColor();
    }
}
