package com.tline.android.features.timeline.fragment.presenter;

import com.tline.android.app.presenter.BasePresenter;
import com.tline.android.features.timeline.fragment.interactor.TweetsInteractor;
import com.tline.android.features.timeline.fragment.view.TweetsView;
import com.twitter.sdk.android.core.models.Tweet;

import java.util.List;

public interface TweetsPresenter extends BasePresenter<TweetsView>, TweetsInteractor.OnFetchDataListener {

    boolean isLoading();

    void fetchNextPage(Long maxId);

    void onRefreshClicked();
}