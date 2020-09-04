package ru.netology.domain;

public class PostCommentsBlock {

//    ПОЛЯ НА ОСНОВЕ ДОКУМЕНТАЦИИ:

//    количество комментариев
    private int countComments;
//    может ли текущий пользователь комментировать запись
    private boolean canCommentPost;
//    могут ли сообщества комментировать запись
    private boolean groupsCanCommentPost;
//    может ли текущий пользователь закрыть комментарии к записи
    private boolean canCloseComments;
//    может ли текущий пользователь открыть комментарии к записи
    private boolean canOpenComments;

//    ПОЛЯ, КОТОРЫЕ Я БЫ ДОБАВИЛА:

//    Кнопка "Комментировать"
    private boolean buttonComment;
    private String buttonCommentImageUrl;
//    Кнопка "Отправить комментарий"
    private boolean buttonSendComment;
    private String imageButtonSendCommentUrl;
//    Текст комментария
    private String textComment;
//    Кнопка "Показывать в начале интересные"
    private boolean buttonInterestingFirst;
    private String textButtonInterestingFirst;
//    Кнопка "Показать следующие"
    private boolean buttonShowNext;
    private String textButtonShowNext;
//    Дата комментария
    private String dataComment;
//    Автор комментария
    private String authorId;
    private String authorUrl;
    private String authorImageUrl;

//    Реакция Like на комментарии
    private boolean likeComment;
    private String likeImageUrl;
    private int countLike;
    private String textLikers;
    private String authorLikeId;
    private String authorLikeUrl;
    private String authorLikeImageUrl;

//    Кнопка "Поделиться комментарием"
    private boolean buttonShareComment;
    private String buttonShareCommentImageUrl;

//    Реакция "Пожаловаться" на комментарий
    private boolean complain;
    private String complainImageUrl;

//    Ответить на комментарий
    private boolean buttonAnswer;
    private String buttonAnswerUrl;
    private String textAnswer;
    private String authorAnswerId;
    private String authorAnswerUrl;
    private String authorAnswerImageUrl;

//    Вложения к комментариям и ответам на них
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
