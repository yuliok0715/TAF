package Contexts;

import PageObjects.FictionBook;
import PageObjects.GoodPage;
import Waiter.Waiter;

public class SetOfGoods {
    public static GoodPage clickOnGood(FictionBook page, int index){
        page.click_on_result(index);
        Waiter.Wait(10000);
        return new GoodPage(page.driver);
    }
}
