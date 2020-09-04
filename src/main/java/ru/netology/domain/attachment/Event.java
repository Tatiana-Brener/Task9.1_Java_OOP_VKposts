package ru.netology.domain.attachment;

public class Event {

    private int id;
    private int time;
    private int memberStatus;
    private boolean isFavorite;
    private String address;
    private String text;
    private String buttonText;

    public class FriendsId {
        private FriendsId[] friendsId;
    }
}
