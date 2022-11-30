package tests;

import org.testng.annotations.Test;

public class CheckResult extends TestBase{

    @Test
    public void checkResults(){

        app.getResult().searchBook("Harry Potter and the Order of the Phoenix");
        app.getResult().checkTotalResult();
        app.getResult().addFilterLaguageEnglish();
        app.getResult().checkEnglishLanguageTotalResult();
        app.getResult().checkLongestBookName();
    }
}
