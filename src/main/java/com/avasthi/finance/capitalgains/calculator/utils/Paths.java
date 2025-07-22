package com.avasthi.finance.capitalgains.calculator.utils;

public class Paths {
    public static final String basePath = "/api";

    public class AY202425 {
        public static final String Base = basePath + "/ay202425";
        public static final String fullPath = Base;

        public class FileUpload {

            public static final String Base = "/uploads";
            public static final String fullPath = Paths.AY202425.fullPath + Base;
        }
    }
}
