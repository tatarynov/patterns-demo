package com.qadays.chaining;

import org.junit.Test;

public class ChainingTest {

    @Test
    public void exampleTest() {
        MeetupProfilePage meetupProfilePage = new MeetupMainPage()
                .openGroupsAndSuggestionsEvents()
                .openSavedEvents()
                .openUpcomingEvents()
                .goToProfile();
    }

    @Test
    public void exampleTestWithoutChaining() {
        MeetupMainPage meetupMainPage = new MeetupMainPage();
        meetupMainPage.openGroupsAndSuggestionsEvents();
        meetupMainPage.openSavedEvents();
        meetupMainPage.openUpcomingEvents();
        MeetupProfilePage meetupProfilePage = meetupMainPage.goToProfile();
    }
}
