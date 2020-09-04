package ru.netology.domain;

public class PostLikesBlock {

//    ПОЛЯ НА ОСНОВЕ ДОКУМЕНТАЦИИ:

//    количество лайков
    private int countLike;
//    наличие отметки «Мне нравится» от текущего пользователя
    private boolean userLikePost;
//    может ли текущий пользователь поставить отметку «Мне нравится»
    private boolean canLikePost;

//    ПОЛЯ, КОТОРЫЕ Я БЫ ДОБАВИЛА:

//    Кнопка лайка поста
    private boolean buttonLikePost;
    private String buttonLikePostImageUrl;

//    + get/set на все поля
}
