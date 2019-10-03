import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith (Cucumber.class)
@CucumberOptions (features = "D:\\practica cucumber\\Cucumber_PageObject\\src\\test\\java\\Feature\\testBasico.feature"
        ,glue={"stepDefinition"})
public class testRunnerBasico {

}
