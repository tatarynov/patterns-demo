package com.qadays.chaining;

/***
 * This example uses https://www.meetup.com/ main page as reference
 */
public class MeetupMainPage {

    public MeetupMainPage openUpcomingEvents() {
        // click on upcoming events button

        return this;
    }

    public MeetupMainPage openSavedEvents() {
        // click on saved events button

        return this;
    }

    public MeetupMainPage openGroupsAndSuggestionsEvents() {
        // click on groups and suggestions events button

        return this;
    }

    public MeetupProfilePage goToProfile() {
        // logic to go to profile

        return new MeetupProfilePage();
    }
}


