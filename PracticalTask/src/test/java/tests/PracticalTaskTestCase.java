package tests;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;
import pageObject.Chapter1;
import pageObject.Home;
import static com.codeborne.selenide.CollectionCondition.texts;

public class PracticalTaskTestCase {

    Home homePage = new Home();
    Chapter1 chp = new Chapter1();

    @Test
    public void checkTextOnChapter1() {

        homePage.openHomePage();
        homePage.clickChapterLink("Chapter1");
        chp.getHomePageLink().shouldHave(
                texts("Assert that this text is on the page"));
    }

    @Test
    public void verifyHomeScreen() {
        chp.clickHomePageLink("Home Page");
        homePage.getChapterLink().shouldBe(Condition.visible);
    }

}