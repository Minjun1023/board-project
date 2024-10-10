package com.jun.board_back.dto.object;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor

public class BoardListitem {
    private int boardNumber;
    private String title;
    private String content;
    private String boardTitleImage;
    private int favoriteCount;
    private int commentcount;
    private int viewCount;
    private String writeDatetime;
    private String writeNickname;
    private String writeProfileImage;
    
}
