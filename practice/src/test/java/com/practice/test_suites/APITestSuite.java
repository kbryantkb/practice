package com.practice.test_suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.practice.api_test_cases.*;

@RunWith(Suite.class)
@SuiteClasses({ GetUsersAPITest.class, PostCommentAPITest.class, PutPostAPITest.class })
public class APITestSuite {
}
