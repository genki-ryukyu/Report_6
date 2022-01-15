package jp.ac.uryukyu.ie.e215732;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SampleTest {
    @Test
    void Test(){
        assertEquals(true, Sample.judge(9), "失敗");
        /**
         * 上記のテストは、a,b,cがランダムになるための、「システム」がちゃんと作動しているかの確認。
         * これが四桁になるのは、ランダムになる数値の範囲が10以上になる時であるため、もし、10以上の数値が
         * ランダム値の範囲になる場合は、上記のテストでエラーになる場合がある。
         * そして、9であればエラーにならない。
         */



    }





}