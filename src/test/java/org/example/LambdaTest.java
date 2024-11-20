package org.example;
/*
 * Copyright (C) 2024. by flatexDEGIRO AG, Frankfurt (Main), Germany. All Rights Reserved.
 */



public final class LambdaTest {
    static String username = "sreenadhb";
    static String password = "I304plaCpBxpERvH5roJ6vFuWqLf4lokSJv2Bb1JvgIF0pjqbH";
    static String deviceListUrl = "https://mobile-api.lambdatest.com/mobile-automation/api/v1/list?region=eu";
    static String hubUrl = String.format( "https://%s:%s@mobile-hub.lambdatest.com/wd/hub", username, password );

    /**
     *  constructor is empty because sonar want's it ;)
     **/
    private LambdaTest() {
    }

    public static String getUsername() {
        return username;
    }

    public static String getPassword() {
        return password;
    }

    public static String getDeviceListUrl() {
        return deviceListUrl;
    }

    public static String getHubUrl() {
        return hubUrl;
    }
}
