package com.yisheng.ysim.main;

import android.os.Environment;

/**
 * Created by ustc on 2016/6/27.
 */
public class FXConstant {
    public static final String ENDPOIND="http://139.129.213.6/ysim/public/index.php/";
    public static final String YSHOST="http://139.129.213.6/ysim/public/index.php/index/";
    public static final String URL_REGISTER = YSHOST + "register";
    public static final String URL_LOGIN = YSHOST + "login";
    public static final String URL_FriendList = YSHOST + "getMyFriends";
    public static final String URL_AVATAR="http://139.129.213.6/ysim/public/uploads/avatar/";
    public static final String URL_Get_UserInfo = YSHOST + "get_userinfo";
    public static final String URL_Search_User = YSHOST + "search_friends";
    public static final String URL_UPDATE_Groupnanme = YSHOST + "update_groupname";
    public static final String URL_UPDATE = YSHOST + "update";
    public static final String URL_ADD_FRIEND=YSHOST + "accept_friend";
    public static final String URL_DELETE_FRIEND=YSHOST + "deleteFriend";


    public static final String URL_GROUP_MEMBERS = YSHOST + "groupMembers";
    public static final String URL_GROUP_ADD_MEMBERS = YSHOST + "addMembers";
    public static final String URL_GROUP_CREATE = YSHOST + "groupCreate";
 //朋友圈
    public static final String URL_PUBLISH = YSHOST + "publish";
    public static final String URL_SOCIAL = YSHOST + "social";
    public static final String URL_SOCIAL_PHOTO = "http://139.129.213.6/ysim/public/uploads/";
    public static final String URL_SOCIAL_COMMENT = YSHOST + "comment";
    public static final String URL_SOCIAL_GOOD = YSHOST + "social_good";
    public static final String URL_SOCIAL_GOOD_CANCEL = YSHOST + "social_good_cancel";
    public static final String URL_SOCIAL_DELETE_COMMENT = YSHOST + "social_comment_delete";
    public static final String URL_SOCIAL_DELETE = YSHOST + "social_delete";
    public static final String URL_SOCIAL_FRIEND = YSHOST + "social_friend";
    public static final String URL_CS_SEND_MSG = YSHOST + "csSendMsg";



    //短信
    public static final String URL_LOGIN_SEND_CODE=YSHOST+"sendMsgCode";
    //登陆
    public static final String URL_LOGIN_SEND=YSHOST+"verifyLogin";

    //订单
    public static final String URL_GET_ORDER=ENDPOIND+"order/all";
    //地址
    public static final String URL_GET_ADDRESS=ENDPOIND+"address/all";
    //服务器端
//    public static final String HOST = "http://120.24.211.126/fanxin3/";
//    public static final String URL_REGISTER = HOST + "register.php";
//    public static final String URL_LOGIN = HOST + "login.php";
//    public static final String URL_FriendList = HOST + "getMyFriends.php";
//    public static final String URL_AVATAR= HOST + "upload/";
//    public static final String URL_Search_User = HOST + "search_friends.php";
//    public static final String URL_Get_UserInfo = HOST + "get_userinfo.php";
//    public static final String URL_UPDATE_Groupnanme = HOST + "update_groupname.php";
//    public static final String URL_UPDATE = HOST + "update.php";
//    public static final String URL_ADD_FRIEND=HOST + "accept_friend.php";
//    public static final String URL_DELETE_FRIEND=HOST + "deleteFriend.php";
//    //朋友圈接口
//    public static final String URL_GROUP_MEMBERS = HOST + "groupMembers.php";
//    public static final String URL_GROUP_ADD_MEMBERS = HOST + "addMembers.php";
//    public static final String URL_GROUP_CREATE = HOST + "groupCreate.php";
//    // 服务器端
//    public static final String URL_PUBLISH = HOST + "publish.php";
//    public static final String URL_SOCIAL = HOST + "social.php";
//    public static final String URL_SOCIAL_PHOTO = HOST + "upload/";
//    public static final String URL_SOCIAL_COMMENT = HOST + "comment.php";
//    public static final String URL_SOCIAL_GOOD = HOST + "social_good.php";
//    public static final String URL_SOCIAL_GOOD_CANCEL = HOST + "social_good_cancel.php";
//    public static final String URL_SOCIAL_DELETE_COMMENT = HOST + "social_comment_delete.php";
//    public static final String URL_SOCIAL_DELETE = HOST + "social_delete.php";
//    public static final String URL_SOCIAL_FRIEND = HOST + "social_friend.php";


    public static final String JSON_KEY_NICK ="nick";
    public static final String JSON_KEY_HXID ="hxid";
    public static final String JSON_KEY_FXID ="fxid";
    public static final String JSON_KEY_SEX ="sex";
    public static final String JSON_KEY_AVATAR ="avatar";
    public static final String JSON_KEY_CITY ="city";
    public static final String JSON_KEY_PROVINCE ="province";
    public static final String JSON_KEY_TEL ="tel";
    public static final String JSON_KEY_SIGN ="sign";
    public static final String JSON_KEY_MONEY ="money_curr";
    public static final String JSON_KEY_SCORE ="score";


    //消息撤回
    public static final String FX_REVOKE_MESSAGE = "FX_REVOKE_MESSAGE";
    public static final String REVOKE_MESSAGE_ID = "REVOKE_MESSAGE_ID";
    public static final String IS_MESSAGE_REVOKE="IS_REVOKE_MESSAGE";
    public static final String IS_MESSAGE_REVOKE_SEND="IS_MESSAGE_REVOKE_SEND";

    public static final String DIR_AVATAR = Environment.getExternalStorageDirectory().toString()+"/fanxin/";
    //进入用户详情页传递json字符串
    public static final String KEY_USER_INFO="userInfo";


    //添加好友通知
    public static final String CMD_ADD_FRIEND="ADD_FRIEND";
    public static final String CMD_AGREE_FRIEND="AGREE_FRIEND";
    public static final String CMD_REFUSE_FRIEND="REFUSE_FRIEND";
    public static final String CMD_ADD_REASON="ADD_REASON";
    //删除好友通知
    public static final String CMD_DELETE_FRIEND="DELETE_FRIEND";
    public static final String FXLIVE_CHATROOM_ID="218352836658856384";


    public static final String RTEM_URL="rtmp://live.hkstv.hk.lxdns.com/live/hks";
    public static final String RTEM_URL_LIVE= "rtmp://publish3.cdn.ucloud.com.cn/ucloud/";
    //云账户红包群id
    public static final String REDPACKET_GROUP_ID="230584771716055476";



}
