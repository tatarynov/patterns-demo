package com.qadays.chaining;

import com.qadays.builder.CreditCard;
import org.junit.Test;

import static io.restassured.RestAssured.with;

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

    @Test
    public void whenRequestedPost_thenCreated() {
        with().body(CreditCard.builder().build())
                .when()
                .request("POST", "/odds/new")
                .then()
                .statusCode(201);
    }
}
