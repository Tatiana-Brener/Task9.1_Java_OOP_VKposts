package ru.netology.domain;

public class PostCommentsBlock {
    private boolean buttonComment;
    private String buttonCommentImageUrl;
    private int countComment;
    private boolean buttonSendComment;
    private String imageButtonSendCommentUrl;
    private String textComment;
    private boolean buttonInterestingFirst;
    private String textButtonInterestingFirst;
    private boolean buttonShowNext;
    private String textButtonShowNext;
    private String dataComment;

//    Author of comment
    private String authorId;
    private String authorUrl;
    private String authorImageUrl;

//    Reaction Like on comments
    private boolean likeComment;
    private String likeImageUrl;
    private int countLike;
    private String textLikers;
    private boolean buttonShareComment;
    private String buttonShareCommentImageUrl;
    private String authorLikeId;
    private String authorLikeUrl;
    private String authorLikeImageUrl;

//    Reaction Complain on comments
    private boolean complain;
    private String complainImageUrl;

//    Reaction Answer on comments
    private boolean buttonAnswer;
    private String buttonAnswerUrl;
    private String textAnswer;
    private String authorAnswerId;
    private String authorAnswerUrl;
    private String authorAnswerImageUrl;

//    Attachments to comments and to answers to it
    private boolean attach;
    private String attachImageUrl;
    private boolean attachPhoto;
    private String PhotoUrl;
    private boolean attachVideo;
    private String videoUrl;
    private boolean attachAudio;
    private String audioUrl;
    private boolean attachDoc;
    private String docUrl;
    private boolean buttonEmoji;
    private String emojiImageUrl;

//    + get/set на все поля
}
