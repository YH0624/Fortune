package com.example.fortune;


class Fortune {

    private String[] fortuneList = {"大吉!!!", "中吉!!", "小吉!", "末吉", "大凶"};
    private String[] fortuneListContent = {"今日は、物事が全て上手く行くよ!!"
            , "今日は、嬉しい出来事があるかも!!"
            , "今日は、10円拾うかも!!"
            , "今日は、落とし物や忘れ物に気を付けて!!"
            , "今日は、自宅待機した方がいいかも!!"};

    private String[] fortuneImage = {};


    //fortuneListの結果を返す
    String fortuneList(int i) {
        return fortuneList[i];
    }

    //fortuneListContentの結果を返す
    String fortuneListContent(int i) {
        return fortuneListContent[i];
    }
}
