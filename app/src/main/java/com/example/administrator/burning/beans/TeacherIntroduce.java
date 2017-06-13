package com.example.administrator.burning.beans;

/**
 * Created by Administrator on 2017/6/13.
 */

public class TeacherIntroduce {

    /**
     * status : 1
     * errorCode : 0
     * message : success
     * data : {"id":"148ac21f187cdcbc","avatar":"http://wx.qlogo.cn/mmopen/K88xJribq4L1iaC7Bhg93kLzZFpBjpY1qR4t3mflooJQYDVnIibjxPN9mZqHSNxxOwFqGQyk2KHA1F9nR3WX6JC5l2ed79jMM8a/0","nickname":"大侠","name":"陈文厦","role":"teacher","score":5,"artifactNum":22,"followerNum":7,"friendNum":0,"eventNum":109,"statusNum":0,"relationStatus":"FRIEND","address":"北京","graduation":"画美星球学院","sign":null,"backgroundPhoto":{"width":1280,"height":810,"url":"http://artful.b0.upaiyun.com/artful/background/u_default_background.jpg"}}
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
         * id : 148ac21f187cdcbc
         * avatar : http://wx.qlogo.cn/mmopen/K88xJribq4L1iaC7Bhg93kLzZFpBjpY1qR4t3mflooJQYDVnIibjxPN9mZqHSNxxOwFqGQyk2KHA1F9nR3WX6JC5l2ed79jMM8a/0
         * nickname : 大侠
         * name : 陈文厦
         * role : teacher
         * score : 5
         * artifactNum : 22
         * followerNum : 7
         * friendNum : 0
         * eventNum : 109
         * statusNum : 0
         * relationStatus : FRIEND
         * address : 北京
         * graduation : 画美星球学院
         * sign : null
         * backgroundPhoto : {"width":1280,"height":810,"url":"http://artful.b0.upaiyun.com/artful/background/u_default_background.jpg"}
         */

        private String id;
        private String avatar;
        private String nickname;
        private String name;
        private String role;
        private int score;
        private int artifactNum;
        private int followerNum;
        private int friendNum;
        private int eventNum;
        private int statusNum;
        private String relationStatus;
        private String address;
        private String graduation;
        private Object sign;
        private BackgroundPhotoBean backgroundPhoto;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
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

        public String getRole() {
            return role;
        }

        public void setRole(String role) {
            this.role = role;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public int getArtifactNum() {
            return artifactNum;
        }

        public void setArtifactNum(int artifactNum) {
            this.artifactNum = artifactNum;
        }

        public int getFollowerNum() {
            return followerNum;
        }

        public void setFollowerNum(int followerNum) {
            this.followerNum = followerNum;
        }

        public int getFriendNum() {
            return friendNum;
        }

        public void setFriendNum(int friendNum) {
            this.friendNum = friendNum;
        }

        public int getEventNum() {
            return eventNum;
        }

        public void setEventNum(int eventNum) {
            this.eventNum = eventNum;
        }

        public int getStatusNum() {
            return statusNum;
        }

        public void setStatusNum(int statusNum) {
            this.statusNum = statusNum;
        }

        public String getRelationStatus() {
            return relationStatus;
        }

        public void setRelationStatus(String relationStatus) {
            this.relationStatus = relationStatus;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getGraduation() {
            return graduation;
        }

        public void setGraduation(String graduation) {
            this.graduation = graduation;
        }

        public Object getSign() {
            return sign;
        }

        public void setSign(Object sign) {
            this.sign = sign;
        }

        public BackgroundPhotoBean getBackgroundPhoto() {
            return backgroundPhoto;
        }

        public void setBackgroundPhoto(BackgroundPhotoBean backgroundPhoto) {
            this.backgroundPhoto = backgroundPhoto;
        }

        public static class BackgroundPhotoBean {
            /**
             * width : 1280
             * height : 810
             * url : http://artful.b0.upaiyun.com/artful/background/u_default_background.jpg
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
    }
}
