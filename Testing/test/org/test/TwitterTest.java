package org.test;

import org.example.Twitter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;

@RunWith(MockitoJUnitRunner.class)
public class TwitterTest {
    Twitter twitter;

    @Before // runs before all test cases , sets up environment
    public void setUp() {
        twitter = new Twitter();
    }

    /**
     * Success Case
     */
    @Test
    public void testCase_getTweetsFromTwitter_successCase() {
        List<String> expectedValue = Arrays.asList("First Tweets", "Second Tweet", "Third Tweets");
        List<String> actualResult = twitter.getTweetsFromTwitter(); // real time hit result
        // assert without any library
        /*  Assert.assertEquals(expectedValue.size(), actualResult.size()); // match size (int)
            Assert.assertEquals(expectedValue.get(0), actualResult.get(0)); // match 1st element (String)
            Assert.assertEquals(expectedValue.get(1), actualResult.get(1)); // match 1st element (String)
            Assert.assertEquals(expectedValue.get(2), actualResult.get(2)); // match 1st element (String)
        */
        // using library hamcrest.core
        Assert.assertThat(actualResult, is(expectedValue));
    }

    /**
     * Failure -- all hav edge cases
     */
    @Test
    public void testCase_getTweetsFromTwitter_failureCase() {
// think about failure cases and
    }
}