package org.junit.my_study;

import org.junit.runner.JUnitCore;

/**
 * 学习 JunitCore 的使用
 * @author kenstant
 * {@code @date 2025/12/16}
 */
public class StudyJunitCoreTest {

    /**
     * 模拟 命令行入口
     * 可以参考 {@link org.junit.runner.MainRunner}
     */
    public static void main(String[] args) {
        // 其中runMain
        String myArgs = "org.junit.my_samples.MySimpleTest";
        JUnitCore.main(myArgs);
    }

}
