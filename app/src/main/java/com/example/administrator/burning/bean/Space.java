package com.example.administrator.burning.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/6/12.
 */

public class Space {

    /**
     * status : 1
     * errorCode : 0
     * message : success
     * data : {"banners":[{"url":"artful://www.artful.com.cn/events/55c94aa948f037b1","photo":{"width":320,"height":420,"url":"https://mir-s3-cdn-cf.behance.net/project_modules/1400/da5cde52099709.590499d0d7f77.jpg"}},{"url":"artful://www.artful.com.cn/events/55c94aa948f037b1","photo":{"width":528,"height":390,"url":"http://image.artful.com.cn/artful/other/2017-06-06/a4e51abcc1e69d00.jpg"}},{"url":"artful://www.artful.com.cn/events/55c94aa948f037b1","photo":{"width":320,"height":420,"url":"https://mir-s3-cdn-cf.behance.net/project_modules/max_1200/98208c50709085.58d83821d3f21.jpg"}},{"url":"artful://www.artful.com.cn/events/0417edb8630def8c/detail","photo":{"width":528,"height":390,"url":"http://image.artful.com.cn/artful/other/2017-05-26/5114b2a5e3ab3dee.jpg"}},{"url":"artful://www.artful.com.cn/topics/8100fdb09c0274da","photo":{"width":750,"height":400,"url":"http://image.artful.com.cn/artful/other/2017-05-26/04598b943ee5eb50.jpg"}}],"postTopics":[{"title":"儿童节去上课","subtitle":"燃推荐","photo":{"width":740,"height":466,"url":"http://image.artful.com.cn/artful/post/2017-05-25/cd74a6874d1910ec.jpg"},"type":"EVENT","id":"c08856b62900f5c8"},{"title":"吴江涛：打开自己，让艺术的生命更完整","subtitle":"燃专访","photo":{"width":1280,"height":960,"url":"http://image.artful.com.cn/artful/post/2017-05-17/2c8e33b9deb6e62d.jpg"},"type":"ARTICLE","id":"ef61ebb3df9af0bb"},{"title":"最美的活动","subtitle":"每一次偶遇都从这里开始","photo":{"width":120,"height":120,"url":"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1495452539&di=3c3feed634962ed3d59418b2e38a1103&imgtype=jpg&er=1&src=http%3A%2F%2Fp1.img.cctvpic.com%2Fphotoworkspace%2Fcontentimg%2F2015%2F09%2F22%2F2015092215050152776.jpg"},"type":"EVENT","id":"c9c1be863e44b8ca"}],"teachers":[{"id":"9dbdc6a8d415cdf7","nickname":"Erikkk","name":null,"avatar":"http://wx.qlogo.cn/mmopen/Q4aVFBDtXuyh1oibaRibic3SUiaVEKXGgrnyTqJg9iaOZmErJR76IDse5BGpbBqRMc10nlrSKF3t8uvX4EDne5cfOiash0xcASrCQd/0","followerNum":1,"eventNum":0,"sign":null,"relationStatus":"FRIEND","artifacts":[]},{"id":"fa21e4b572b7f59f","nickname":"2333a2017","name":"王朔","avatar":"http://image.artful.com.cn/artful/avatar/2017-05-14/848f8f8166e77bb5.jpg","followerNum":0,"eventNum":0,"sign":"Qwerwes","relationStatus":"STRANGER","artifacts":[]},{"id":"3c34279285624686a88e001487a532d8","nickname":"机智的Jack","name":"本地测试账号","avatar":"http://wx.qlogo.cn/mmopen/PiajxSqBRaEKcSqeey5ZicubO8256Wp9GZORukWuY7Z1YTYiarsrnEqaiaGNuKQn21P42mxfJPopJ36Vic6e1ibicg6vg/0","followerNum":4,"eventNum":7,"sign":null,"relationStatus":"FRIEND","artifacts":[]},{"id":"148ac21f187cdcbc","nickname":"大侠","name":"陈文厦","avatar":"http://wx.qlogo.cn/mmopen/K88xJribq4L1iaC7Bhg93kLzZFpBjpY1qR4t3mflooJQYDVnIibjxPN9mZqHSNxxOwFqGQyk2KHA1F9nR3WX6JC5l2ed79jMM8a/0","followerNum":7,"eventNum":109,"sign":null,"relationStatus":"FRIEND","artifacts":[{"id":"b01a4435dd784c3cbf47a8ca13ecf924","photo":{"width":884,"height":1334,"url":"http://image.artful.com.cn/artful/post/2016-04-21/707719977c1946e78555fcf4b58fd617.jpg"}},{"id":"75dea29178634125b0326d4b3242ef59","photo":{"width":1014,"height":1334,"url":"http://image.artful.com.cn/artful/post/2016-04-21/90218c8fd42941a48fcc7d4e14a10d72.jpg"}},{"id":"1724046088ee44c9988425fafe7eb3ed","photo":{"width":1334,"height":887,"url":"http://image.artful.com.cn/artful/post/2016-04-21/a16474f20ff24c059e1c660ef0531d4c.jpg"}}]}]}
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
        private List<BannersBean> banners;
        private List<PostTopicsBean> postTopics;
        private List<TeachersBean> teachers;

        public List<BannersBean> getBanners() {
            return banners;
        }

        public void setBanners(List<BannersBean> banners) {
            this.banners = banners;
        }

        public List<PostTopicsBean> getPostTopics() {
            return postTopics;
        }

        public void setPostTopics(List<PostTopicsBean> postTopics) {
            this.postTopics = postTopics;
        }

        public List<TeachersBean> getTeachers() {
            return teachers;
        }

        public void setTeachers(List<TeachersBean> teachers) {
            this.teachers = teachers;
        }

        public static class BannersBean {
            /**
             * url : artful://www.artful.com.cn/events/55c94aa948f037b1
             * photo : {"width":320,"height":420,"url":"https://mir-s3-cdn-cf.behance.net/project_modules/1400/da5cde52099709.590499d0d7f77.jpg"}
             */

            private String url;
            private PhotoBean photo;

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public PhotoBean getPhoto() {
                return photo;
            }

            public void setPhoto(PhotoBean photo) {
                this.photo = photo;
            }

            public static class PhotoBean {
                /**
                 * width : 320
                 * height : 420
                 * url : https://mir-s3-cdn-cf.behance.net/project_modules/1400/da5cde52099709.590499d0d7f77.jpg
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

        public static class PostTopicsBean {
            /**
             * title : 儿童节去上课
             * subtitle : 燃推荐
             * photo : {"width":740,"height":466,"url":"http://image.artful.com.cn/artful/post/2017-05-25/cd74a6874d1910ec.jpg"}
             * type : EVENT
             * id : c08856b62900f5c8
             */

            private String title;
            private String subtitle;
            private PhotoBeanX photo;
            private String type;
            private String id;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getSubtitle() {
                return subtitle;
            }

            public void setSubtitle(String subtitle) {
                this.subtitle = subtitle;
            }

            public PhotoBeanX getPhoto() {
                return photo;
            }

            public void setPhoto(PhotoBeanX photo) {
                this.photo = photo;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public static class PhotoBeanX {
                /**
                 * width : 740
                 * height : 466
                 * url : http://image.artful.com.cn/artful/post/2017-05-25/cd74a6874d1910ec.jpg
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

        public static class TeachersBean {
            /**
             * id : 9dbdc6a8d415cdf7
             * nickname : Erikkk
             * name : null
             * avatar : http://wx.qlogo.cn/mmopen/Q4aVFBDtXuyh1oibaRibic3SUiaVEKXGgrnyTqJg9iaOZmErJR76IDse5BGpbBqRMc10nlrSKF3t8uvX4EDne5cfOiash0xcASrCQd/0
             * followerNum : 1
             * eventNum : 0
             * sign : null
             * relationStatus : FRIEND
             * artifacts : []
             */

            private String id;
            private String nickname;
            private Object name;
            private String avatar;
            private int followerNum;
            private int eventNum;
            private Object sign;
            private String relationStatus;
            private List<Artifact> artifacts;

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

            public Object getName() {
                return name;
            }

            public void setName(Object name) {
                this.name = name;
            }

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public int getFollowerNum() {
                return followerNum;
            }

            public void setFollowerNum(int followerNum) {
                this.followerNum = followerNum;
            }

            public int getEventNum() {
                return eventNum;
            }

            public void setEventNum(int eventNum) {
                this.eventNum = eventNum;
            }

            public Object getSign() {
                return sign;
            }

            public void setSign(Object sign) {
                this.sign = sign;
            }

            public String getRelationStatus() {
                return relationStatus;
            }

            public void setRelationStatus(String relationStatus) {
                this.relationStatus = relationStatus;
            }

            public List<Artifact> getArtifacts() {
                return artifacts;
            }

            public void setArtifacts(List<Artifact> artifacts) {
                this.artifacts = artifacts;
            }
        }
        public static class Artifact{
            /*
            "id": "b01a4435dd784c3cbf47a8ca13ecf924",
                        "photo": {
                            "width": 884,
                            "height": 1334,
                            "url": "http://image.artful.com.cn/artful/post/2016-04-21/707719977c1946e78555fcf4b58fd617.jpg"
                        }
             */
            private String id;
            private BannersBean.PhotoBean photo;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public BannersBean.PhotoBean getPhoto() {
                return photo;
            }

            public void setPhoto(BannersBean.PhotoBean photo) {
                this.photo = photo;
            }
        }
    }
}
