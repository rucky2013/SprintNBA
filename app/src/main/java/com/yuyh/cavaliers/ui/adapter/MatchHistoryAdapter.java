package com.yuyh.cavaliers.ui.adapter;

import android.content.Context;

import com.yuyh.cavaliers.R;
import com.yuyh.cavaliers.http.bean.match.MatchStat;
import com.zengcanxiang.baseAdapter.absListView.HelperAdapter;
import com.zengcanxiang.baseAdapter.absListView.HelperViewHolder;

import java.util.List;

/**
 * @author yuyh.
 * @date 2016/7/4.
 */
public class MatchHistoryAdapter extends HelperAdapter<MatchStat.MatchStatInfo.StatsBean.VS> {

    public MatchHistoryAdapter(List<MatchStat.MatchStatInfo.StatsBean.VS> mList, Context context, int... layoutIds) {
        super(mList, context, layoutIds);
    }

    @Override
    public void HelpConvert(HelperViewHolder viewHolder, int position, MatchStat.MatchStatInfo.StatsBean.VS item) {
        viewHolder.setText(R.id.tvMatchRecentLeft, item.leftName)
                .setText(R.id.tvMatchRecentRight, item.rightName)
                .setText(R.id.tvMatchRecentTime, item.startTime + "  " + item.matchDesc);
        viewHolder.setText(R.id.tvMatchRecentLeftPoint, item.leftGoal + "")
                .setText(R.id.tvMatchRecentRightPoint, item.rightGoal + "");
        int primaryColor = mContext.getResources().getColor(R.color.primary_text);
        int secondaryColor = mContext.getResources().getColor(R.color.secondary_text);
        if (item.leftGoal > item.rightGoal) {
            viewHolder.setTextColor(R.id.tvMatchRecentLeft, primaryColor);
            viewHolder.setTextColor(R.id.tvMatchRecentLeftPoint, primaryColor);
            viewHolder.setTextColor(R.id.tvMatchRecentRight, secondaryColor);
            viewHolder.setTextColor(R.id.tvMatchRecentRightPoint, secondaryColor);
        } else {
            viewHolder.setTextColor(R.id.tvMatchRecentLeft, secondaryColor);
            viewHolder.setTextColor(R.id.tvMatchRecentLeftPoint, secondaryColor);
            viewHolder.setTextColor(R.id.tvMatchRecentRight, primaryColor);
            viewHolder.setTextColor(R.id.tvMatchRecentRightPoint, primaryColor);
        }
    }
}
