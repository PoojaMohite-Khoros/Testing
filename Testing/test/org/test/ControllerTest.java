package org.test;

import org.example.Controller;
import org.example.Response;
import org.example.Twitter;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;

import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class ControllerTest {
    Controller controller;
    Twitter twitter; // step 1

    @Before // Annotation
    public void setUp() {
        twitter = mock(Twitter.class); // step 2
        controller = new Controller(twitter);
    }

    @Test
    public void testCase_getTweets_successCase() {
        // mocks the getTweetsFromTwitter
        //step 3
        when(twitter.getTweetsFromTwitter()).thenReturn(Arrays.asList("First Tweets", "Second Tweet", "Third Tweets"));
        Response expectedResponse = new Response(200, Arrays.asList("First Tweets", "Second Tweet", "Third Tweets"));
        Response actualResponse = controller.getTweets();
        Assert.assertEquals(expectedResponse, actualResponse);
        verify(twitter, times(1)).getTweetsFromTwitter(); //  verify if the method is called at least once
    }
}
