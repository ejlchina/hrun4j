package vip.lematech.httprunner4j.testproject.testcases.postman;

import org.testng.annotations.Test;
import vip.lematech.httprunner4j.core.engine.TestCaseExecutorEngine;
import vip.lematech.httprunner4j.entity.testcase.TestCase;
import vip.lematech.httprunner4j.testproject.HttpRunner4j;

/**
 * @author lematech@foxmail.com
 * @version 1.0.0
 */
public class PostTest extends HttpRunner4j {
    @Test(dataProvider = "dataProvider")
    public void postScene(TestCase testCase) {
        TestCaseExecutorEngine.getInstance().execute(testCase);
    }
}
