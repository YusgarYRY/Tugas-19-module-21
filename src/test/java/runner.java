import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



    @RunWith(Cucumber.class)
    @CucumberOptions(
            glue = {"Step"},
            features = {"src/test/resources"},
//        plugin reporting dan cara membuat report. outpu tampil di file report
            plugin = {"pretty","html:reports/cucumber.html", "json:reports/cucumber.json"}
    )
    public class runner {

    }

