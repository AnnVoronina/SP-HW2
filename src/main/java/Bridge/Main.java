package Bridge;

import Bridge.Pages.AboutPage;
import Bridge.Pages.ContactPage;
import Bridge.Theme.DarkTheme;
import Bridge.Theme.LightTheme;

public class Main {


    public static void main(String[] args) {
        AboutPage aboutPage = new AboutPage(new DarkTheme());
        ContactPage contactPage = new ContactPage(new LightTheme());
        System.out.println(aboutPage.getConnect());
        System.out.println(contactPage.getConnect());
    }

}
