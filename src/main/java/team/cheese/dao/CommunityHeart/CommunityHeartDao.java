package team.cheese.dao.CommunityHeart;

import team.cheese.Domain.CommunityBoard.CommunityBoardDto;
import team.cheese.Domain.CommunityHeart.CommunityHeartDto;
;

public interface CommunityHeartDao {
    int doLike(CommunityHeartDto communityHeartDto)throws Exception;
//    //게시글 좋아요
//    int insertLike(CommunityHeartDto heartDto)throws Exception;
//    //게시글 삭제
//    int deleteLike(CommunityHeartDto heartDto)throws Exception;
//    //게시글의 총 좋아요 수
//    int countAllLikes(Integer post_no)throws Exception;
//    //좋아요 상태
//    int countLikeStatus(CommunityHeartDto heartDto)throws Exception;
//
//    int deleteAll()throws Exception;
//
//    int count()throws Exception;
//
//    char changeHeartState(CommunityHeartDto heartDto)throws Exception;
//
    CommunityHeartDto select(Integer like_no)throws Exception;

}
