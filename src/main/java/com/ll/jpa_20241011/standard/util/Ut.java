package com.ll.jpa_20241011.standard.util;

import lombok.SneakyThrows;

public class Ut {
    public static class thread {

        @SneakyThrows
        public static void sleep(int milli){
            Thread.sleep(milli);
        }
    }
}
