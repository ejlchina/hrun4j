package io.lematech.httprunner4j;

import io.lematech.httprunner4j.core.engine.TestNGEngine;
import io.lematech.httprunner4j.junit.config.RunnerConfig;

import java.util.ArrayList;
import java.util.List;

public class MainRunner {
    public static void main(String args[]){
        List<String> executePaths = new ArrayList<>();
        executePaths.add("./src/test/resources/testcases");
        RunnerConfig.getInstance().setExecutePaths(executePaths);
        TestNGEngine.run();
    }
}
