package ru.netology.domain;

public class VkPost {

//    ПОЛЯ НА ОСНОВЕ ДОКУМЕНТАЦИИ:

//    идентификатор записи
    private int id;
//    идентификатор владельца стены
    private int ownerId;
//  идентификатор автора записи
    private int fromId;
//  идентификатор администратора, который опубликовал запись
    private int createdBy;
//  если запись была создана с опцией «Только для друзей»
    private boolean friendsOnly;
//  источник материала
    private String copyright;
//    информация о репостах записи
    private int countReposts;
    private boolean userReposted;
//    информация о просмотрах записи
    private int countViews;
    private String countViewsImageUrl;
//    тип записи
    private String postType;
//    идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем
    private int signerId;
//    информация о том, может ли текущий пользователь закрепить
    private boolean canPin;
//    информация о том, может ли текущий пользователь закрепить
    private boolean canDelete;
//    информация о том, может ли текущий пользователь редактировать запись
    private boolean canEdit;
//    информация о том, что запись закреплена
    private boolean isPinned;
//    информация о том, содержит ли запись отметку "реклама"
    private boolean markedAsAds;
//    идентификатор отложенной записи
    private String postponedId;

//    ПОЛЯ, КОТОРЫЕ Я БЫ ДОБАВИЛА:

//    Идентификаторы поста
    private String postUrl;
    private int postId;
//    Дата и время публикации поста
    private String dataPost;
//    Кнопка "Опубликовать пост" (кабинет админа)
    private boolean buttonSendPost;
    private String buttonSendPostImageUrl;
//    Кнопка пожаловаться или сохранить в закладках с выпадающим списком
    private boolean buttonComplainOrSave;
    private String buttonComplainOrSaveImageUrl;
    private boolean buttonComplain;
    private String buttonComplainImageUrl;
    private boolean buttonSave;
    private String buttonSaveImageUrl;

//    + get/set на все поля

//    ОТДЕЛЬНЫЕ БЛОКИ:

    private PostCommentsBlock postCommentsBlock;
    private PostGeoBlock postGeoBlock;
    private PostImageBlock postImageBlock;
    private PostLikesBlock postLikesBlock;
    private PostRepostsBlock postRepostsBlock;
    private PostSourceBlock postSourceBlock;
    private PostTextBlock postTextBlock;
}
