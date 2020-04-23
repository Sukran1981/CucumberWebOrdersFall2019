package com.webordes.runners;





@RunWith(Cucumber.class)
@CucumberOPtions(
        features="src/test/resources/features",
        glue="com/weborders/step_definitions",
        tags="",
        dryRun=false,
        plugin="html:target/default-report"


)
public class CucumberRunner {
}
