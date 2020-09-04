package ru.netology.domain.attachment;

public class Poll {

    private int id;
    private int ownerId;
    private int dataCreated;
    private String textQuestion;
    private int countVotes;
    private boolean anonymous;
    private boolean multiple;
    private int endData;
    private boolean closed;
    private boolean isBoard;
    private boolean canEdit;
    private boolean canVoit;
    private boolean canReport;
    private boolean canShare;
    private int authorId;
    private String backgroundUrl;

    public class Answers {
        private Answers[] answers;
    }

    public class AnswersIds {
        private AnswersIds[] answersIds;
    }

    public class FriendsId {
        private FriendsId[] friendsIds;
    }

// + get/set на все поля
}
