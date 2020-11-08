package pageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selectors;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Chapter1 {


    public void clickHomePageLink(String homePageLink){
        $(Selectors.byLinkText(homePageLink)).click();
    }

    public ElementsCollection getHomePageLink(){
        return $$("#divontheleft");

    }
}
