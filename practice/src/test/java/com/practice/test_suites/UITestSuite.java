package com.practice.test_suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.practice.ui_test_cases.*;

@RunWith(Suite.class)
@SuiteClasses({ CreateUserTest.class, FilterByUsername.class })
public class UITestSuite {
}
