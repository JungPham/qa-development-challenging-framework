package businessLoans;

import businessLoans.steps.*;
import common.steps.BaseSteps;
import common.steps.CommonSteps;
import common.steps.LifecycleSteps;
import common.steps.LoginSteps;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.CodeLocations;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import utils.TestContext;

import java.util.Collections;
import java.util.List;

public class businessLoansRegressionTestRunner extends JUnitStories {

    @org.testng.annotations.Test
    public void run() throws Throwable {
        super.run();
    }
    // Here we specify the configuration, starting from default MostUsefulConfiguration, and changing only what is needed
    @Override
    public Configuration configuration() {
        return new MostUsefulConfiguration()
                // where to find the stories
                .useStoryLoader(new LoadFromClasspath(this.getClass()))
                // CONSOLE and TXT reporting
                .useStoryReporterBuilder(new StoryReporterBuilder().withDefaultFormats().withFormats(Format.CONSOLE, Format.TXT));
    }

    // Here we specify the steps classes
    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(), new LifecycleSteps(), new RegisterSteps(new TestContext()),
                new CommonSteps(new TestContext()), new BaseSteps(new TestContext()), new LoginSteps(new TestContext()),
                new MobileOTPVerificationSteps(new TestContext()), new RegisterCompletedSteps(new TestContext()),
                new RoleSelectorSteps(new TestContext()), new AdditionalDetailsForDirectorSteps(new TestContext()),
                new RegisterSelectMethodSteps(new TestContext()), new PersonalDetailsSteps(new TestContext()),
                new EmailOTPVerificationStep(new TestContext()), new BusinessDetailsSteps(new TestContext()),
                new BusinessDetailsEditStep(new TestContext()), new AdditionalDetailsForDirectorSteps(new TestContext()),
                new BusinessRelationshipStep(new TestContext()), new IdentifyViewSteps(new TestContext()));
    }
    // Specify a stories file
    @Override
    protected List<String> storyPaths() {
        StoryFinder finder = new StoryFinder();
        return finder.findPaths(CodeLocations.codeLocationFromClass(this.getClass()).getFile(),
                Collections.singletonList("**/*.story"), Collections.singletonList(""));
    }

    @BeforeClass
    @Parameters({"url", "browser"})
    public void init(String url, String browser) {
        System.setProperty("browser", browser);
        System.setProperty("url", url);
    }
}