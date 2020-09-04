package ru.netology.domain.attachment;

public class Photo {

    private int id;
    private int albumId;
    private int ownerId;
    private int userId;
    private String text;
    private int date;
    private int width;
    private int height;

    public class PhotoSizes {
        private PhotoSizes[] sizes;
    }

//    + get/set на все поля
}
