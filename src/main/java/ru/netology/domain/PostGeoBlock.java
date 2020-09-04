package ru.netology.domain;

public class PostGeoBlock {

//    ПОЛЯ НА ОСНОВЕ ДОКУМЕНТАЦИИ:

//    тип места
    private String type;
//   координаты места
    private String coordinates;
// идентификатор места
    private int idPlace;
//   название места
    private String titlePlace;
// географическая широта, заданная в градусах (от -90 до 90)
    private int latitudePlace;
// географическая долгота, заданная в градусах (от -90 до 90)
    private int longitudePlace;
//    дата создания места в Unixtime
    private int dataCreated;
//    иконка места, URL изображения
    private String iconPlace;
//    число отметок в этом месте
    private int countCheckins;
//    дата обновления места в Unixtime
    private int updatedDataCreated;
//    идентификатор страны
    private int countryId;
//    идентификатор города.
    private int cityId;
//    адрес места
    private String addressPlace;

//    + get/set на все поля
}
