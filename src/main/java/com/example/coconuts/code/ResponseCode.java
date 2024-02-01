package com.example.coconuts.code;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ResponseCode {
    SUCCESS_REGISTER(HttpStatus.OK, "회원가입을 성공했습니다."),
    SUCCESS_LOGIN(HttpStatus.OK, "로그인을 성공했습니다."),
    SUCCESS_SEARCH_USERS(HttpStatus.OK, "사용자 검색하기를 성공했습니다."),

    SUCCESS_GET_FRIEND_LIST(HttpStatus.OK, "팔로우 목록 불러오기 성공했습니다."),
    SUCCESS_ADD_FRIEND(HttpStatus.OK, "팔로우 추가하기를 성공했습니다."),
    ;
    private final HttpStatus status;
    private final String message;
}
