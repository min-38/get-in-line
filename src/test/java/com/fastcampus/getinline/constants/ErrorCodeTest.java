package com.fastcampus.getinline.constants;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ErrorCodeTest {

    @DisplayName("예외를 받으면, 예외 메시지가 포함된 메시지 출력")
    @Test
    void givenExceptionWithMessage_whenGettingMessage_thenReturnsMessage() {
        // given
        Exception e = new Exception("This is test message");

        // when
        String result = ErrorCode.OK.getMessage(e);

        // then
        assertThat(result).isEqualTo("Ok - This is test message");
    }
}