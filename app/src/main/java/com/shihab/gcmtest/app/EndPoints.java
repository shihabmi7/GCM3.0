package com.shihab.gcmtest.app;

/**
 * Created by Lincoln on 06/01/16.
 */
public class EndPoints {
//
    //   localhost url

    //    192.168.5.230
//    10.0.2.2
    public static final String BASE_URL = "http://192.168.5.230/gcm_chat/v1";

    ///public static final String BASE_URL = "http://172.20.10.2/gcm_chat/v1";
    public static final String LOGIN = BASE_URL + "/user/login";
    public static final String USER = BASE_URL + "/user/_ID_";
    public static final String CHAT_ROOMS = BASE_URL + "/chat_rooms";
    public static final String CHAT_THREAD = BASE_URL + "/chat_rooms/_ID_";
    public static final String CHAT_ROOM_MESSAGE = BASE_URL + "/chat_rooms/_ID_/message";
}
