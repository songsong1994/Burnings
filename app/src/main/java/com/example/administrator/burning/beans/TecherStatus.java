package com.example.administrator.burning.beans;

import java.util.List;

/**
 * Created by Administrator on 2017/6/14.
 */

public class TecherStatus {

    /**
     * status : 1
     * errorCode : 0
     * message : success
     * data : {"base":"593f6d4b98e53d17105d2132","list":[{"id":"71ab2d78f49044afaedf93af685d9ec3","created":"2016-08-14 20:45:09","liked":false,"marked":false,"markNum":0,"commentNum":0,"likeNum":4,"user":{"id":"67fa17bd38a04adb8f259ca207dc7f0d","nickname":"琪","avatar":"http://wx.qlogo.cn/mmopen/54IWKPc416LQyiaEZnKaBH11icnJb5msqxSCibKdicaR0CrmopObklDeojRmq8F9DJL2Zia3BvoyvLhwGMad0qWszib7U1luP5gqwx/0","name":"高琪"},"type":"STATUS","tags":["无"],"content":"奥黛丽·赫本","photo":{"width":955,"height":1280,"url":"http://image.artful.com.cn/artful/post/2016-08-14/d2089291ee89485d802126fc58290fbd.jpg"}},{"id":"0f0f461a4bda44ce81f2c98bd56c7d80","created":"2016-08-13 19:02:35","liked":false,"marked":false,"markNum":0,"commentNum":0,"likeNum":3,"user":{"id":"67fa17bd38a04adb8f259ca207dc7f0d","nickname":"琪","avatar":"http://wx.qlogo.cn/mmopen/54IWKPc416LQyiaEZnKaBH11icnJb5msqxSCibKdicaR0CrmopObklDeojRmq8F9DJL2Zia3BvoyvLhwGMad0qWszib7U1luP5gqwx/0","name":"高琪"},"type":"STATUS","tags":["无"],"content":"我很满意??","photo":{"width":960,"height":1280,"url":"http://image.artful.com.cn/artful/post/2016-08-13/038782cf6abf42d28e352347b65f23d4.jpg"}},{"id":"d91b3092097847008f18f668a57483a9","created":"2016-07-24 22:46:17","liked":false,"marked":false,"markNum":0,"commentNum":0,"likeNum":4,"user":{"id":"67fa17bd38a04adb8f259ca207dc7f0d","nickname":"琪","avatar":"http://wx.qlogo.cn/mmopen/54IWKPc416LQyiaEZnKaBH11icnJb5msqxSCibKdicaR0CrmopObklDeojRmq8F9DJL2Zia3BvoyvLhwGMad0qWszib7U1luP5gqwx/0","name":"高琪"},"type":"STATUS","tags":["无"],"content":"示范过程中","photo":{"width":3931,"height":2949,"url":"http://image.artful.com.cn/artful/post/2016-07-24/92360569368146f0a8dbee1fa6fdd400.jpg"}}],"page":1,"length":15,"totalCount":3,"toEnd":true}
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
         * base : 593f6d4b98e53d17105d2132
         * list : [{"id":"71ab2d78f49044afaedf93af685d9ec3","created":"2016-08-14 20:45:09","liked":false,"marked":false,"markNum":0,"commentNum":0,"likeNum":4,"user":{"id":"67fa17bd38a04adb8f259ca207dc7f0d","nickname":"琪","avatar":"http://wx.qlogo.cn/mmopen/54IWKPc416LQyiaEZnKaBH11icnJb5msqxSCibKdicaR0CrmopObklDeojRmq8F9DJL2Zia3BvoyvLhwGMad0qWszib7U1luP5gqwx/0","name":"高琪"},"type":"STATUS","tags":["无"],"content":"奥黛丽·赫本","photo":{"width":955,"height":1280,"url":"http://image.artful.com.cn/artful/post/2016-08-14/d2089291ee89485d802126fc58290fbd.jpg"}},{"id":"0f0f461a4bda44ce81f2c98bd56c7d80","created":"2016-08-13 19:02:35","liked":false,"marked":false,"markNum":0,"commentNum":0,"likeNum":3,"user":{"id":"67fa17bd38a04adb8f259ca207dc7f0d","nickname":"琪","avatar":"http://wx.qlogo.cn/mmopen/54IWKPc416LQyiaEZnKaBH11icnJb5msqxSCibKdicaR0CrmopObklDeojRmq8F9DJL2Zia3BvoyvLhwGMad0qWszib7U1luP5gqwx/0","name":"高琪"},"type":"STATUS","tags":["无"],"content":"我很满意??","photo":{"width":960,"height":1280,"url":"http://image.artful.com.cn/artful/post/2016-08-13/038782cf6abf42d28e352347b65f23d4.jpg"}},{"id":"d91b3092097847008f18f668a57483a9","created":"2016-07-24 22:46:17","liked":false,"marked":false,"markNum":0,"commentNum":0,"likeNum":4,"user":{"id":"67fa17bd38a04adb8f259ca207dc7f0d","nickname":"琪","avatar":"http://wx.qlogo.cn/mmopen/54IWKPc416LQyiaEZnKaBH11icnJb5msqxSCibKdicaR0CrmopObklDeojRmq8F9DJL2Zia3BvoyvLhwGMad0qWszib7U1luP5gqwx/0","name":"高琪"},"type":"STATUS","tags":["无"],"content":"示范过程中","photo":{"width":3931,"height":2949,"url":"http://image.artful.com.cn/artful/post/2016-07-24/92360569368146f0a8dbee1fa6fdd400.jpg"}}]
         * page : 1
         * length : 15
         * totalCount : 3
         * toEnd : true
         */

        private String base;
        private int page;
        private int length;
        private int totalCount;
        private boolean toEnd;
        private List<ListBean> list;

        public String getBase() {
            return base;
        }

        public void setBase(String base) {
            this.base = base;
        }

        public int getPage() {
            return page;
        }

        public void setPage(int page) {
            this.page = page;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public int getTotalCount() {
            return totalCount;
        }

        public void setTotalCount(int totalCount) {
            this.totalCount = totalCount;
        }

        public boolean isToEnd() {
            return toEnd;
        }

        public void setToEnd(boolean toEnd) {
            this.toEnd = toEnd;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * id : 71ab2d78f49044afaedf93af685d9ec3
             * created : 2016-08-14 20:45:09
             * liked : false
             * marked : false
             * markNum : 0
             * commentNum : 0
             * likeNum : 4
             * user : {"id":"67fa17bd38a04adb8f259ca207dc7f0d","nickname":"琪","avatar":"http://wx.qlogo.cn/mmopen/54IWKPc416LQyiaEZnKaBH11icnJb5msqxSCibKdicaR0CrmopObklDeojRmq8F9DJL2Zia3BvoyvLhwGMad0qWszib7U1luP5gqwx/0","name":"高琪"}
             * type : STATUS
             * tags : ["无"]
             * content : 奥黛丽·赫本
             * photo : {"width":955,"height":1280,"url":"http://image.artful.com.cn/artful/post/2016-08-14/d2089291ee89485d802126fc58290fbd.jpg"}
             */

            private String id;
            private String created;
            private boolean liked;
            private boolean marked;
            private int markNum;
            private int commentNum;
            private int likeNum;
            private UserBean user;
            private String type;
            private String content;
            private PhotoBean photo;
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

            public int getMarkNum() {
                return markNum;
            }

            public void setMarkNum(int markNum) {
                this.markNum = markNum;
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

            public UserBean getUser() {
                return user;
            }

            public void setUser(UserBean user) {
                this.user = user;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public PhotoBean getPhoto() {
                return photo;
            }

            public void setPhoto(PhotoBean photo) {
                this.photo = photo;
            }

            public List<String> getTags() {
                return tags;
            }

            public void setTags(List<String> tags) {
                this.tags = tags;
            }

            public static class UserBean {
                /**
                 * id : 67fa17bd38a04adb8f259ca207dc7f0d
                 * nickname : 琪
                 * avatar : http://wx.qlogo.cn/mmopen/54IWKPc416LQyiaEZnKaBH11icnJb5msqxSCibKdicaR0CrmopObklDeojRmq8F9DJL2Zia3BvoyvLhwGMad0qWszib7U1luP5gqwx/0
                 * name : 高琪
                 */

                private String id;
                private String nickname;
                private String avatar;
                private String name;

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
            }

            public static class PhotoBean {
                /**
                 * width : 955
                 * height : 1280
                 * url : http://image.artful.com.cn/artful/post/2016-08-14/d2089291ee89485d802126fc58290fbd.jpg
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
}
