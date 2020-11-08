package pageObject;

import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Home {
    private static String PAGE_URL="http://book.theautomatedtester.co.uk/";


    public void openHomePage(){
        open(PAGE_URL);
    }

    public void clickChapterLink(String chapterNumberLink){
        $(Selectors.byLinkText(chapterNumberLink)).click();
    }

    public SelenideElement getChapterLink(){
       return $(Selectors.byLinkText("Chapter1")) ;
    }
}
