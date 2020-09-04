package ru.netology.domain;

public class PostRepostsBlock {

//    ПОЛЯ НА ОСНОВЕ ДОКУМЕНТАЦИИ:

//    число пользователей, скопировавших запись
    private int countCopyPost;
//    наличие репоста от текущего пользователя
    private boolean userRepostPost;
//    может ли текущий пользователь сделать репост записи
    private boolean canPublish;

//    ПОЛЯ, КОТОРЫЕ Я БЫ ДОБАВИЛА:

//    Кнопка "Поделиться"
    private boolean buttonShare;
    private boolean buttonShareImageUrl;

//    + get/set на все поля
}
