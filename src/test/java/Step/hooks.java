package Step;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import static helper.utility.quitDriver;
import static helper.utility.setUpDriver;

public class hooks {

    @Before
    public void beforeTest(){
        setUpDriver();
    }

    @After
    public void afterTest(){
        quitDriver();
    }

}
