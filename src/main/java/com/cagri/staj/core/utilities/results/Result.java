    package com.cagri.staj.core.utilities.results;

    public class Result {
        private boolean success;
        private String messeage;

        public Result(boolean success) {
            this.success = success;
        }

        public Result(boolean success, String messeage) {
            this(success);
            this.messeage = messeage;
        }
        public  boolean isSuccess(){
            return this.success;
        }
        public String  getMessage(){
            return this.messeage;
        }

    }
