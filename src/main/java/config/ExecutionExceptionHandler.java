package config;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.UnsupportedCommandException;

import java.util.Optional;

public class ExecutionExceptionHandler implements AfterTestExecutionCallback {

    @Override
    public void afterTestExecution(ExtensionContext context) throws Exception {
        System.out.println("afterAll");
        if (context.getTestInstance().isPresent()) {
            BaseTestSuite testSuite = (BaseTestSuite) context.getTestInstance().get();
            Optional<Throwable> executionException = context.getExecutionException();
            String status = executionException.isPresent() ? "failed" : "passed";
            String errorMessage = "";
            if (executionException.isPresent()) {
                errorMessage = executionException.get().getMessage();
            };
            JavascriptExecutor jse = (JavascriptExecutor)testSuite.driver;
            if (jse != null) {
                try {
                    jse.executeScript("browserstack_executor: {\"action\": \"setSessionStatus\", \"arguments\": {\"status\": \"" + status + "\", \"reason\": \"" + errorMessage + "\"}}");
                } catch (UnsupportedCommandException e) {}
            }
        }
    }
}
