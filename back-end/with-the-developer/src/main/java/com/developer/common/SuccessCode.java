package com.developer.common;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum SuccessCode {

    RECRUIT_APPLY_APPR_OK("채용공고 등록 신청 승인 완료"),
    RECRUIT_APPLY_REJECT_OK("채용공고 등록 신청 반려 완료"),
    RECRUIT_COMPLETE_OK("채용공고 마감 완료"),
    RECRUIT_DELETE_OK("채용공고 삭제 완료"),

    PROJ_POST_UPDATE_OK("프로젝트 자랑 게시글 수정 완료"),
    PROJ_POST_DELETE_OK("프로젝트 자랑 게시글 삭제 완료");

    private final String message;
}
