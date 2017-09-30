import fitnesse.junit.FitNesseRunner;
import org.junit.runner.RunWith;

@RunWith(FitNesseRunner.class)
@FitNesseRunner.Suite("MySuiteTest")
@FitNesseRunner.FitnesseDir("src/test/fitnesse")
@FitNesseRunner.OutputDir("target/fitnesse-output")
public class JavaItTest {
}
