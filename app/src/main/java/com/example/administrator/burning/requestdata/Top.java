package com.example.administrator.burning.requestdata;

import java.util.List;

/**
 *
 *
 * 测试类，
 * Created by Administrator on 2017/6/12.
 */

public class Top {

    /**
     * status : 1
     * errorCode : 0
     * message : success
     * data : {"base":"675","list":[{"id":"a9efde6145984b9bb43d207eddef85e3","topic":"红唇 | 风格插画 | 水彩+彩铅","photo":{"width":1024,"height":1024,"url":"http://image.artful.com.cn/artful/event/2016-09-19/f0735dee7e5b4cf18b36e8e39eee45ac.jpg"},"startTime":"2017-06-12 13:00:00","price":180,"distance":9509508,"location":{"id":"a9e8cd0bcbe748b28a4414846b31bb15","name":"V TIME (工体南门)","logo":null},"teacher":{"id":"67fa17bd38a04adb8f259ca207dc7f0d","nickname":"琪","name":"高琪","avatar":"http://wx.qlogo.cn/mmopen/54IWKPc416LQyiaEZnKaBH11icnJb5msqxSCibKdicaR0CrmopObklDeojRmq8F9DJL2Zia3BvoyvLhwGMad0qWszib7U1luP5gqwx/0","score":4.9,"relationStatus":null},"difficulty":3,"progressStatus":"IN","selledTicketCount":9,"ticketCount":15,"isCandidate":0,"marked":false},{"id":"0417edb8630def8c","topic":"我的新活动","photo":{"width":709,"height":1063,"url":"http://image.artful.com.cn/artful/event/2017-04-20/fbb954b4cfd6b96d.jpg"},"startTime":"2017-06-13 12:00:00","price":200,"distance":9509911,"location":{"id":"1482b5cb5c890fad","name":"Costa Coffee （远洋光华国际）","logo":"http://image.artful.com.cn/artful/venue/2016-11-25/c434aa877015a112.jpg"},"teacher":{"id":"148ac21f187cdcbc","nickname":"大侠","name":"陈文厦","avatar":"http://wx.qlogo.cn/mmopen/K88xJribq4L1iaC7Bhg93kLzZFpBjpY1qR4t3mflooJQYDVnIibjxPN9mZqHSNxxOwFqGQyk2KHA1F9nR3WX6JC5l2ed79jMM8a/0","score":4.9,"relationStatus":null},"difficulty":3,"progressStatus":"WAITING","selledTicketCount":1,"ticketCount":20,"isCandidate":0,"marked":true}],"page":1,"length":15,"totalCount":2,"toEnd":true}
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
         * base : 675
         * list : [{"id":"a9efde6145984b9bb43d207eddef85e3","topic":"红唇 | 风格插画 | 水彩+彩铅","photo":{"width":1024,"height":1024,"url":"http://image.artful.com.cn/artful/event/2016-09-19/f0735dee7e5b4cf18b36e8e39eee45ac.jpg"},"startTime":"2017-06-12 13:00:00","price":180,"distance":9509508,"location":{"id":"a9e8cd0bcbe748b28a4414846b31bb15","name":"V TIME (工体南门)","logo":null},"teacher":{"id":"67fa17bd38a04adb8f259ca207dc7f0d","nickname":"琪","name":"高琪","avatar":"http://wx.qlogo.cn/mmopen/54IWKPc416LQyiaEZnKaBH11icnJb5msqxSCibKdicaR0CrmopObklDeojRmq8F9DJL2Zia3BvoyvLhwGMad0qWszib7U1luP5gqwx/0","score":4.9,"relationStatus":null},"difficulty":3,"progressStatus":"IN","selledTicketCount":9,"ticketCount":15,"isCandidate":0,"marked":false},{"id":"0417edb8630def8c","topic":"我的新活动","photo":{"width":709,"height":1063,"url":"http://image.artful.com.cn/artful/event/2017-04-20/fbb954b4cfd6b96d.jpg"},"startTime":"2017-06-13 12:00:00","price":200,"distance":9509911,"location":{"id":"1482b5cb5c890fad","name":"Costa Coffee （远洋光华国际）","logo":"http://image.artful.com.cn/artful/venue/2016-11-25/c434aa877015a112.jpg"},"teacher":{"id":"148ac21f187cdcbc","nickname":"大侠","name":"陈文厦","avatar":"http://wx.qlogo.cn/mmopen/K88xJribq4L1iaC7Bhg93kLzZFpBjpY1qR4t3mflooJQYDVnIibjxPN9mZqHSNxxOwFqGQyk2KHA1F9nR3WX6JC5l2ed79jMM8a/0","score":4.9,"relationStatus":null},"difficulty":3,"progressStatus":"WAITING","selledTicketCount":1,"ticketCount":20,"isCandidate":0,"marked":true}]
         * page : 1
         * length : 15
         * totalCount : 2
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
             * id : a9efde6145984b9bb43d207eddef85e3
             * topic : 红唇 | 风格插画 | 水彩+彩铅
             * photo : {"width":1024,"height":1024,"url":"http://image.artful.com.cn/artful/event/2016-09-19/f0735dee7e5b4cf18b36e8e39eee45ac.jpg"}
             * startTime : 2017-06-12 13:00:00
             * price : 180
             * distance : 9509508
             * location : {"id":"a9e8cd0bcbe748b28a4414846b31bb15","name":"V TIME (工体南门)","logo":null}
             * teacher : {"id":"67fa17bd38a04adb8f259ca207dc7f0d","nickname":"琪","name":"高琪","avatar":"http://wx.qlogo.cn/mmopen/54IWKPc416LQyiaEZnKaBH11icnJb5msqxSCibKdicaR0CrmopObklDeojRmq8F9DJL2Zia3BvoyvLhwGMad0qWszib7U1luP5gqwx/0","score":4.9,"relationStatus":null}
             * difficulty : 3
             * progressStatus : IN
             * selledTicketCount : 9
             * ticketCount : 15
             * isCandidate : 0
             * marked : false
             */

            private String id;
            private String topic;
            private PhotoBean photo;
            private String startTime;
            private int price;
            private int distance;
            private LocationBean location;
            private TeacherBean teacher;
            private int difficulty;
            private String progressStatus;
            private int selledTicketCount;
            private int ticketCount;
            private int isCandidate;
            private boolean marked;

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

            public String getStartTime() {
                return startTime;
            }

            public void setStartTime(String startTime) {
                this.startTime = startTime;
            }

            public int getPrice() {
                return price;
            }

            public void setPrice(int price) {
                this.price = price;
            }

            public int getDistance() {
                return distance;
            }

            public void setDistance(int distance) {
                this.distance = distance;
            }

            public LocationBean getLocation() {
                return location;
            }

            public void setLocation(LocationBean location) {
                this.location = location;
            }

            public TeacherBean getTeacher() {
                return teacher;
            }

            public void setTeacher(TeacherBean teacher) {
                this.teacher = teacher;
            }

            public int getDifficulty() {
                return difficulty;
            }

            public void setDifficulty(int difficulty) {
                this.difficulty = difficulty;
            }

            public String getProgressStatus() {
                return progressStatus;
            }

            public void setProgressStatus(String progressStatus) {
                this.progressStatus = progressStatus;
            }

            public int getSelledTicketCount() {
                return selledTicketCount;
            }

            public void setSelledTicketCount(int selledTicketCount) {
                this.selledTicketCount = selledTicketCount;
            }

            public int getTicketCount() {
                return ticketCount;
            }

            public void setTicketCount(int ticketCount) {
                this.ticketCount = ticketCount;
            }

            public int getIsCandidate() {
                return isCandidate;
            }

            public void setIsCandidate(int isCandidate) {
                this.isCandidate = isCandidate;
            }

            public boolean isMarked() {
                return marked;
            }

            public void setMarked(boolean marked) {
                this.marked = marked;
            }

            public static class PhotoBean {
                /**
                 * width : 1024
                 * height : 1024
                 * url : http://image.artful.com.cn/artful/event/2016-09-19/f0735dee7e5b4cf18b36e8e39eee45ac.jpg
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

            public static class LocationBean {
                /**
                 * id : a9e8cd0bcbe748b28a4414846b31bb15
                 * name : V TIME (工体南门)
                 * logo : null
                 */

                private String id;
                private String name;
                private Object logo;

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

                public Object getLogo() {
                    return logo;
                }

                public void setLogo(Object logo) {
                    this.logo = logo;
                }
            }

            public static class TeacherBean {
                /**
                 * id : 67fa17bd38a04adb8f259ca207dc7f0d
                 * nickname : 琪
                 * name : 高琪
                 * avatar : http://wx.qlogo.cn/mmopen/54IWKPc416LQyiaEZnKaBH11icnJb5msqxSCibKdicaR0CrmopObklDeojRmq8F9DJL2Zia3BvoyvLhwGMad0qWszib7U1luP5gqwx/0
                 * score : 4.9
                 * relationStatus : null
                 */

                private String id;
                private String nickname;
                private String name;
                private String avatar;
                private double score;
                private Object relationStatus;

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

                public Object getRelationStatus() {
                    return relationStatus;
                }

                public void setRelationStatus(Object relationStatus) {
                    this.relationStatus = relationStatus;
                }
            }
        }
    }
}
