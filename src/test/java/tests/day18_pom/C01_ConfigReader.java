package tests.day18_pom;

import com.fasterxml.jackson.databind.deser.DataFormatReaders;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_ConfigReader {

    @Test
    public void test01(){

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));


    }

}
