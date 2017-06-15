package com.example.administrator.burning.beans;

import java.util.List;

/**
 * Created by Administrator on 2017/6/15.
 */

public class TeacherArtifactDetails {

    /**
     * status : 1
     * errorCode : 0
     * message : success
     * data : {"id":"766c6a925533f1f0","created":"2016-12-17 15:08:55","content":null,"liked":false,"marked":false,"commentNum":0,"likeNum":1,"photo":{"width":96,"height":96,"url":"http://image.artful.com.cn/artful/post/2016-12-17/9ce84387e7b686ef.jpg"},"likedUsers":[],"user":{"id":"2c09e5b5d9cc4d9c91e1beb80a0567b4","nickname":"薛定谔不养猫","avatar":"http://image.artful.com.cn/artful/avatar/2017-01-05/cffccc94c52c7fbc.jpg","name":"王朔·个人测试","relationStatus":"FRIEND"},"markNum":0,"tags":["无"],"artifactName":"厕所测试","artifactSize":"99×99","artifactDate":"2016-12-29 00:00:00","artifactType":"丙烯","price":200,"sellStatus":1,"priceSecret":0}
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
         * id : 766c6a925533f1f0
         * created : 2016-12-17 15:08:55
         * content : null
         * liked : false
         * marked : false
         * commentNum : 0
         * likeNum : 1
         * photo : {"width":96,"height":96,"url":"http://image.artful.com.cn/artful/post/2016-12-17/9ce84387e7b686ef.jpg"}
         * likedUsers : []
         * user : {"id":"2c09e5b5d9cc4d9c91e1beb80a0567b4","nickname":"薛定谔不养猫","avatar":"http://image.artful.com.cn/artful/avatar/2017-01-05/cffccc94c52c7fbc.jpg","name":"王朔·个人测试","relationStatus":"FRIEND"}
         * markNum : 0
         * tags : ["无"]
         * artifactName : 厕所测试
         * artifactSize : 99×99
         * artifactDate : 2016-12-29 00:00:00
         * artifactType : 丙烯
         * price : 200
         * sellStatus : 1
         * priceSecret : 0
         */

        private String id;
        private String created;
        private Object content;
        private boolean liked;
        private boolean marked;
        private int commentNum;
        private int likeNum;
        private PhotoBean photo;
        private UserBean user;
        private int markNum;
        private String artifactName;
        private String artifactSize;
        private String artifactDate;
        private String artifactType;
        private int price;
        private int sellStatus;
        private int priceSecret;
        private List<?> likedUsers;
        private List<String> tags;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getCreated() {
            return created;
        }

        public void setCreated(String created) {
            this.created = created;
        }

        public Object getContent() {
            return content;
        }

        public void setContent(Object content) {
            this.content = content;
        }

        public boolean isLiked() {
            return liked;
        }

        public void setLiked(boolean liked) {
            this.liked = liked;
        }

        public boolean isMarked() {
            return marked;
        }

        public void setMarked(boolean marked) {
            this.marked = marked;
        }

        public int getCommentNum() {
            return commentNum;
        }

        public void setCommentNum(int commentNum) {
            this.commentNum = commentNum;
        }

        public int getLikeNum() {
            return likeNum;
        }

        public void setLikeNum(int likeNum) {
            this.likeNum = likeNum;
        }

        public PhotoBean getPhoto() {
            return photo;
        }

        public void setPhoto(PhotoBean photo) {
            this.photo = photo;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public int getMarkNum() {
            return markNum;
        }

        public void setMarkNum(int markNum) {
            this.markNum = markNum;
        }

        public String getArtifactName() {
            return artifactName;
        }

        public void setArtifactName(String artifactName) {
            this.artifactName = artifactName;
        }

        public String getArtifactSize() {
            return artifactSize;
        }

        public void setArtifactSize(String artifactSize) {
            this.artifactSize = artifactSize;
        }

        public String getArtifactDate() {
            return artifactDate;
        }

        public void setArtifactDate(String artifactDate) {
            this.artifactDate = artifactDate;
        }

        public String getArtifactType() {
            return artifactType;
        }

        public void setArtifactType(String artifactType) {
            this.artifactType = artifactType;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        public int getSellStatus() {
            return sellStatus;
        }

        public void setSellStatus(int sellStatus) {
            this.sellStatus = sellStatus;
        }

        public int getPriceSecret() {
            return priceSecret;
        }

        public void setPriceSecret(int priceSecret) {
            this.priceSecret = priceSecret;
        }

        public List<?> getLikedUsers() {
            return likedUsers;
        }

        public void setLikedUsers(List<?> likedUsers) {
            this.likedUsers = likedUsers;
        }

        public List<String> getTags() {
            return tags;
        }

        public void setTags(List<String> tags) {
            this.tags = tags;
        }

        public static class PhotoBean {
            /**
             * width : 96
             * height : 96
             * url : http://image.artful.com.cn/artful/post/2016-12-17/9ce84387e7b686ef.jpg
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

        public static class UserBean {
            /**
             * id : 2c09e5b5d9cc4d9c91e1beb80a0567b4
             * nickname : 薛定谔不养猫
             * avatar : http://image.artful.com.cn/artful/avatar/2017-01-05/cffccc94c52c7fbc.jpg
             * name : 王朔·个人测试
             * relationStatus : FRIEND
             */

            private String id;
            private String nickname;
            private String avatar;
            private String name;
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

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRelationStatus() {
                return relationStatus;
            }

            public void setRelationStatus(String relationStatus) {
                this.relationStatus = relationStatus;
            }
        }
    }
}
