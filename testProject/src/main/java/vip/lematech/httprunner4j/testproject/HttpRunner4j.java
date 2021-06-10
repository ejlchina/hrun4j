package vip.lematech.httprunner4j.testproject;

import com.googlecode.aviator.AviatorEvaluator;
import vip.lematech.httprunner4j.base.TestBase;
import vip.lematech.httprunner4j.common.Constant;
import vip.lematech.httprunner4j.config.RunnerConfig;
import vip.lematech.httprunner4j.testproject.functions.JokeFunction;
import org.testng.annotations.BeforeSuite;
import vip.lematech.httprunner4j.widget.log.MyLog;

/**
 * Extension function
 *
 * @author lematech@foxmail.com
 * @version 1.0.0
 */
public class HttpRunner4j extends TestBase {

    @Override
    @BeforeSuite
    public void beforeSuite() {
        MyLog.info(" Add function to static code block !");
        AviatorEvaluator.getInstance().addFunction(new JokeFunction.JokeSetupHook());
        AviatorEvaluator.getInstance().addFunction(new JokeFunction.JokeTearDownHook());
        /**
         * 包名，资源路径下查找测试用例前置，默认：vip.lematech.httprunner4j
         */
        RunnerConfig.getInstance().setPkgName("vip.lematech.httprunner4j.testproject");
        /**
         * Test case file suffix
         */
        RunnerConfig.getInstance().setTestCaseExtName(Constant.SUPPORT_TEST_CASE_FILE_EXT_YML_NAME);
    }
}

