package com.example.administrator.burning.beans;

/**
 * Created by Administrator on 2017/6/15.
 */

public class TeacherDetails {

    /**
     * status : 1
     * errorCode : 0
     * message : success
     * data : {"userId":"148ac21f187cdcbc","name":"陈文厦","intro":"<span style='color: white'> \n Life is beautiful, We need get more patient\nLife is beautiful, We need get more patient\nLife is beautiful, We need get more patient\n <\/br>\n1\n <\/br>\n1 <\/br>\n1 <\/br>1 <\/br>1 <\/br>1 <\/br>1 <\/br>1 <\/br>1 <\/br>1 <\/br>1 <\/br>1 <\/br>\n <\/br>\n1 <\/br>1 <\/br>1 <\/br>1 <\/br>1 <\/br>1 <\/br>1 <\/br>1 <\/br>1 <\/br>1 <\/br>\n <\/br>\n1 <\/br>1 <\/br>1 <\/br>1 <\/br>1 <\/br>1 <\/br>1 <\/br>1 <\/br>1 <\/br>1 <\/br>\n <\/br>\n1 <\/br>1 <\/br>1 <\/br>1 <\/br>1 <\/br>1 <\/br>1 <\/br>1 <\/br>1 <\/br>1 <\/br>\n <\/br>\n1 <\/br>1 <\/br>1 <\/br>1 <\/br>1 <\/br>1 <\/br>1 <\/br>1 <\/br>1 <\/br>1 <\/br>\n <\/br>\n1 <\/br>1 <\/br>1 <\/br>1 <\/br>1 <\/br>1 <\/br>1 <\/br>1 <\/br>1 <\/br>1 <\/br>\nLife is beautiful, We need get more patient\nLife is beautiful, We need get more patient\nLife is beautiful, We need get more patient\nLife is beautiful, We need get more patient\nLife is beautiful, We need get more patient\n<\/span>","graduation":"画美星球学院","introBackgroundPhoto":{"width":751,"height":424,"url":"http://image.artful.com.cn/artful/event/2017-04-15/2007e09f90e2720b.jpg"}}
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
         * userId : 148ac21f187cdcbc
         * name : 陈文厦
         * intro : <span style='color: white'>
         Life is beautiful, We need get more patient
         Life is beautiful, We need get more patient
         Life is beautiful, We need get more patient
         </br>
         1
         </br>
         1 </br>
         1 </br>1 </br>1 </br>1 </br>1 </br>1 </br>1 </br>1 </br>1 </br>1 </br>
         </br>
         1 </br>1 </br>1 </br>1 </br>1 </br>1 </br>1 </br>1 </br>1 </br>1 </br>
         </br>
         1 </br>1 </br>1 </br>1 </br>1 </br>1 </br>1 </br>1 </br>1 </br>1 </br>
         </br>
         1 </br>1 </br>1 </br>1 </br>1 </br>1 </br>1 </br>1 </br>1 </br>1 </br>
         </br>
         1 </br>1 </br>1 </br>1 </br>1 </br>1 </br>1 </br>1 </br>1 </br>1 </br>
         </br>
         1 </br>1 </br>1 </br>1 </br>1 </br>1 </br>1 </br>1 </br>1 </br>1 </br>
         Life is beautiful, We need get more patient
         Life is beautiful, We need get more patient
         Life is beautiful, We need get more patient
         Life is beautiful, We need get more patient
         Life is beautiful, We need get more patient
         </span>
         * graduation : 画美星球学院
         * introBackgroundPhoto : {"width":751,"height":424,"url":"http://image.artful.com.cn/artful/event/2017-04-15/2007e09f90e2720b.jpg"}
         */

        private String userId;
        private String name;
        private String intro;
        private String graduation;
        private IntroBackgroundPhotoBean introBackgroundPhoto;

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getIntro() {
            return intro;
        }

        public void setIntro(String intro) {
            this.intro = intro;
        }

        public String getGraduation() {
            return graduation;
        }

        public void setGraduation(String graduation) {
            this.graduation = graduation;
        }

        public IntroBackgroundPhotoBean getIntroBackgroundPhoto() {
            return introBackgroundPhoto;
        }

        public void setIntroBackgroundPhoto(IntroBackgroundPhotoBean introBackgroundPhoto) {
            this.introBackgroundPhoto = introBackgroundPhoto;
        }

        public static class IntroBackgroundPhotoBean {
            /**
             * width : 751
             * height : 424
             * url : http://image.artful.com.cn/artful/event/2017-04-15/2007e09f90e2720b.jpg
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
