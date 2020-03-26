package com.nero.jandan.qsbk;

import java.util.ArrayList;

/**
 * Created by Lizhaotailang on 2016/8/4.
 */

public interface QsbkContract {

    interface View extends BaseView<Presenter> {

        void showResult(ArrayList<Qiushibaike.Item> articleList);

        void startLoading();

        void stopLoading();

        void showLoadError();

    }

    interface Presenter extends BasePresenter {

        void loadArticle(Boolean forceRefresh);

        void loadMore();

        void shareTo(int position);

        void copyToClipboard(int position);

    }

}
