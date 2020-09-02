package ru.netology.domain;

public class VkPost {

    private String postUrl;
    private int postId;
    private boolean buttonSendPost;
    private String buttonSendPostImageUrl;
    private boolean buttonLikePost;
    private String buttonLikePostImageUrl;
    private int countLike;
    private boolean buttonShare;
    private boolean buttonShareImageUrl;
    private int countViews;
    private String countViewsImageUrl;
//    + get/set на все поля

//    Button Complain Or Save
    private boolean buttonComplainOrSave;
    private String buttonComplainOrSaveImageUrl;
    private boolean buttonComplain;
    private String buttonComplainImageUrl;
    private boolean buttonSave;
    private String buttonSaveImageUrl;
//    + get/set на все поля

    private PostTextBlock postTextBlock;
    private PostNameBlock postNameBlock;
    private PostImageBlock postImageBlock;
    private PostCommentsBlock postCommentsBlock;

}
