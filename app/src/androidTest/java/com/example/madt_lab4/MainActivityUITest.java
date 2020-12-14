package com.example.madt_lab4;


import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.filters.MediumTest;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@MediumTest
public class MainActivityUITest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule
            = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void testWhenClearEverythingIsClicked() {
        final String expectedResult = "";

        onView(withId(R.id.btn5)).perform(click());
        onView(withId(R.id.btn6)).perform(click());
        onView(withId(R.id.btnClearEverything)).perform(click());
        onView(withId(R.id.result_id)).check(matches(withText(expectedResult)));
    }
    @Test
    public void testWhenTwoPlusTwoIsIntended() {
        final String expectedResult = "4.0";

        onView(withId(R.id.btn2)).perform(click());
        onView(withId(R.id.btnAddition)).perform(click());
        onView(withId(R.id.btn2)).perform(click());
        onView(withId(R.id.btnEquals)).perform(click());
        onView(withId(R.id.result_id)).check(matches(withText(expectedResult)));
    }
    @Test
    public void testWhenFiveMinusThreeIsIntended() {
        final String expectedResult = "2.0";

        onView(withId(R.id.btn5)).perform(click());
        onView(withId(R.id.btnSubtract)).perform(click());
        onView(withId(R.id.btn3)).perform(click());
        onView(withId(R.id.btnEquals)).perform(click());
        onView(withId(R.id.result_id)).check(matches(withText(expectedResult)));
    }
    @Test
    public void testWhenThreeTimesThreeIsIntended() {
        final String expectedResult = "9.0";

        onView(withId(R.id.btn3)).perform(click());
        onView(withId(R.id.btnMultiply)).perform(click());
        onView(withId(R.id.btn3)).perform(click());
        onView(withId(R.id.btnEquals)).perform(click());
        onView(withId(R.id.result_id)).check(matches(withText(expectedResult)));
    }
    @Test
    public void testWhenEightOverFourIsIntended() {
        final String expectedResult = "2.0";

        onView(withId(R.id.btn8)).perform(click());
        onView(withId(R.id.btnDivision)).perform(click());
        onView(withId(R.id.btn4)).perform(click());
        onView(withId(R.id.btnEquals)).perform(click());
        onView(withId(R.id.result_id)).check(matches(withText(expectedResult)));
    }
    @Test
    public void testWhenSixMinusOneTimesTwoOverPointSevenIsIntended() {
        final String expectedResult = "14.285714528998554";

        onView(withId(R.id.btn6)).perform(click());
        onView(withId(R.id.btnSubtract)).perform(click());
        onView(withId(R.id.btn1)).perform(click());
        onView(withId(R.id.btnEquals)).perform(click());
        onView(withId(R.id.btnMultiply)).perform(click());
        onView(withId(R.id.btn2)).perform(click());
        onView(withId(R.id.btnEquals)).perform(click());
        onView(withId(R.id.btnDivision)).perform(click());
        onView(withId(R.id.btnPeriod)).perform(click());
        onView(withId(R.id.btn7)).perform(click());
        onView(withId(R.id.btnEquals)).perform(click());
        onView(withId(R.id.result_id)).check(matches(withText(expectedResult)));
    }
    @Test
    public void tesWhenOneOverZeroIsIntended() {
        final String expectedResult = "null";

        onView(withId(R.id.btn1)).perform(click());
        onView(withId(R.id.btnDivision)).perform(click());
        onView(withId(R.id.btn0)).perform(click());
        onView(withId(R.id.btnEquals)).perform(click());
        onView(withId(R.id.result_id)).check(matches(withText(expectedResult)));
    }
    @Test
    public void tesWhenOneTimesZeroIsIntended() {
        final String expectedResult = "0.0";

        onView(withId(R.id.btn1)).perform(click());
        onView(withId(R.id.btnMultiply)).perform(click());
        onView(withId(R.id.btn0)).perform(click());
        onView(withId(R.id.btnEquals)).perform(click());
        onView(withId(R.id.result_id)).check(matches(withText(expectedResult)));
    }
}
