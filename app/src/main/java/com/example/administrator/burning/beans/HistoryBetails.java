package com.example.administrator.burning.beans;

import java.util.List;

/**
 * Created by Administrator on 2017/6/15.
 */

public class HistoryBetails {

    /**
     * status : 1
     * errorCode : 0
     * message : success
     * data : {"id":"ab8f97b6081ff2ed","topic":"马","photo":{"width":600,"height":800,"url":"http://image.artful.com.cn/artful/event/2017-06-02/978a50bf6ae73dea.jpg"},"teacher":{"id":"148ac21f187cdcbc","nickname":"大侠","name":"陈文厦","avatar":"http://wx.qlogo.cn/mmopen/K88xJribq4L1iaC7Bhg93kLzZFpBjpY1qR4t3mflooJQYDVnIibjxPN9mZqHSNxxOwFqGQyk2KHA1F9nR3WX6JC5l2ed79jMM8a/0","score":4.9,"relationStatus":"FRIEND"},"startTime":"2017-06-06 19:30:00","canEvaluate":true,"evaluationScore":null,"evaluationMaxScore":5,"location":{"id":"d079cef83c9d4bad9ce2ded3a651907b","name":"北京千禧大酒店 | 亚洲小馆 （国贸）","address":"东三环中路7号","lat":39.91731,"lng":116.459199,"logo":"http://image.artful.com.cn/artful/venue/2016-11-25/4a648d99613a20d0.jpg"},"eventUsers":[{"id":"148ac21f187cdcbc","nickname":"大侠","avatar":"http://wx.qlogo.cn/mmopen/K88xJribq4L1iaC7Bhg93kLzZFpBjpY1qR4t3mflooJQYDVnIibjxPN9mZqHSNxxOwFqGQyk2KHA1F9nR3WX6JC5l2ed79jMM8a/0","ticketCount":0},{"id":"a6d459b03920414ca57e98770169ec5a","nickname":"薛定谔不养猫","avatar":"http://image.artful.com.cn/artful/avatar/2017-06-09/385f81abb29972c1.jpg","ticketCount":2},{"id":"fa2e8ba6877d1ee5","nickname":"1851423_륂멨䶞תּ","avatar":"http://image.artful.com.cn/artful/avatar/2017-05-18/75a0c0a22ec9de11.jpg","ticketCount":1}],"isParticipant":0,"statusNum":0}
     */

    private int status;
    private int errorCode;
    private String message;
    private DataBean data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : ab8f97b6081ff2ed
         * topic : 马
         * photo : {"width":600,"height":800,"url":"http://image.artful.com.cn/artful/event/2017-06-02/978a50bf6ae73dea.jpg"}
         * teacher : {"id":"148ac21f187cdcbc","nickname":"大侠","name":"陈文厦","avatar":"http://wx.qlogo.cn/mmopen/K88xJribq4L1iaC7Bhg93kLzZFpBjpY1qR4t3mflooJQYDVnIibjxPN9mZqHSNxxOwFqGQyk2KHA1F9nR3WX6JC5l2ed79jMM8a/0","score":4.9,"relationStatus":"FRIEND"}
         * startTime : 2017-06-06 19:30:00
         * canEvaluate : true
         * evaluationScore : null
         * evaluationMaxScore : 5
         * location : {"id":"d079cef83c9d4bad9ce2ded3a651907b","name":"北京千禧大酒店 | 亚洲小馆 （国贸）","address":"东三环中路7号","lat":39.91731,"lng":116.459199,"logo":"http://image.artful.com.cn/artful/venue/2016-11-25/4a648d99613a20d0.jpg"}
         * eventUsers : [{"id":"148ac21f187cdcbc","nickname":"大侠","avatar":"http://wx.qlogo.cn/mmopen/K88xJribq4L1iaC7Bhg93kLzZFpBjpY1qR4t3mflooJQYDVnIibjxPN9mZqHSNxxOwFqGQyk2KHA1F9nR3WX6JC5l2ed79jMM8a/0","ticketCount":0},{"id":"a6d459b03920414ca57e98770169ec5a","nickname":"薛定谔不养猫","avatar":"http://image.artful.com.cn/artful/avatar/2017-06-09/385f81abb29972c1.jpg","ticketCount":2},{"id":"fa2e8ba6877d1ee5","nickname":"1851423_륂멨䶞תּ","avatar":"http://image.artful.com.cn/artful/avatar/2017-05-18/75a0c0a22ec9de11.jpg","ticketCount":1}]
         * isParticipant : 0
         * statusNum : 0
         */

        private String id;
        private String topic;
        private PhotoBean photo;
        private TeacherBean teacher;
        private String startTime;
        private boolean canEvaluate;
        private Object evaluationScore;
        private int evaluationMaxScore;
        private LocationBean location;
        private int isParticipant;
        private int statusNum;
        private List<EventUsersBean> eventUsers;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTopic() {
            return topic;
        }

        public void setTopic(String topic) {
            this.topic = topic;
        }

        public PhotoBean getPhoto() {
            return photo;
        }

        public void setPhoto(PhotoBean photo) {
            this.photo = photo;
        }

        public TeacherBean getTeacher() {
            return teacher;
        }

        public void setTeacher(TeacherBean teacher) {
            this.teacher = teacher;
        }

        public String getStartTime() {
            return startTime;
        }

        public void setStartTime(String startTime) {
            this.startTime = startTime;
        }

        public boolean isCanEvaluate() {
            return canEvaluate;
        }

        public void setCanEvaluate(boolean canEvaluate) {
            this.canEvaluate = canEvaluate;
        }

        public Object getEvaluationScore() {
            return evaluationScore;
        }

        public void setEvaluationScore(Object evaluationScore) {
            this.evaluationScore = evaluationScore;
        }

        public int getEvaluationMaxScore() {
            return evaluationMaxScore;
        }

        public void setEvaluationMaxScore(int evaluationMaxScore) {
            this.evaluationMaxScore = evaluationMaxScore;
        }

        public LocationBean getLocation() {
            return location;
        }

        public void setLocation(LocationBean location) {
            this.location = location;
        }

        public int getIsParticipant() {
            return isParticipant;
        }

        public void setIsParticipant(int isParticipant) {
            this.isParticipant = isParticipant;
        }

        public int getStatusNum() {
            return statusNum;
        }

        public void setStatusNum(int statusNum) {
            this.statusNum = statusNum;
        }

        public List<EventUsersBean> getEventUsers() {
            return eventUsers;
        }

        public void setEventUsers(List<EventUsersBean> eventUsers) {
            this.eventUsers = eventUsers;
        }

        public static class PhotoBean {
            /**
             * width : 600
             * height : 800
             * url : http://image.artful.com.cn/artful/event/2017-06-02/978a50bf6ae73dea.jpg
             */

            private int width;
            private int height;
            private String url;

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }

        public static class TeacherBean {
            /**
             * id : 148ac21f187cdcbc
             * nickname : 大侠
             * name : 陈文厦
             * avatar : http://wx.qlogo.cn/mmopen/K88xJribq4L1iaC7Bhg93kLzZFpBjpY1qR4t3mflooJQYDVnIibjxPN9mZqHSNxxOwFqGQyk2KHA1F9nR3WX6JC5l2ed79jMM8a/0
             * score : 4.9
             * relationStatus : FRIEND
             */

            private String id;
            private String nickname;
            private String name;
            private String avatar;
            private double score;
            private String relationStatus;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public double getScore() {
                return score;
            }

            public void setScore(double score) {
                this.score = score;
            }

            public String getRelationStatus() {
                return relationStatus;
            }

            public void setRelationStatus(String relationStatus) {
                this.relationStatus = relationStatus;
            }
        }

        public static class LocationBean {
            /**
             * id : d079cef83c9d4bad9ce2ded3a651907b
             * name : 北京千禧大酒店 | 亚洲小馆 （国贸）
             * address : 东三环中路7号
             * lat : 39.91731
             * lng : 116.459199
             * logo : http://image.artful.com.cn/artful/venue/2016-11-25/4a648d99613a20d0.jpg
             */

            private String id;
            private String name;
            private String address;
            private double lat;
            private double lng;
            private String logo;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public String getLogo() {
                return logo;
            }

            public void setLogo(String logo) {
                this.logo = logo;
            }
        }

        public static class EventUsersBean {
            /**
             * id : 148ac21f187cdcbc
             * nickname : 大侠
             * avatar : http://wx.qlogo.cn/mmopen/K88xJribq4L1iaC7Bhg93kLzZFpBjpY1qR4t3mflooJQYDVnIibjxPN9mZqHSNxxOwFqGQyk2KHA1F9nR3WX6JC5l2ed79jMM8a/0
             * ticketCount : 0
             */

            private String id;
            private String nickname;
            private String avatar;
            private int ticketCount;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public int getTicketCount() {
                return ticketCount;
            }

            public void setTicketCount(int ticketCount) {
                this.ticketCount = ticketCount;
            }
        }
    }
}
