package io.lematech.httprunner4j.entity.testcase;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @author lematech@foxmail.com
 * @version 1.0.0
 * @className TestSuite
 * @description Test Case Suite
 * @created 2021/5/12 4:14 下午
 * @publicWechat lematech
 */
@Data
public class TestSuite {
    private Config config;
    @JsonProperty(value = "testcases")
    @JSONField(name = "testcases")
    private List<TestSuiteCase> testCases;
}
